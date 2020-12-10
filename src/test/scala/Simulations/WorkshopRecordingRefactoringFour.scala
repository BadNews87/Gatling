package Simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class WorkshopRecordingRefactoringFour extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept-Encoding" -> "gzip, deflate",
	"Origin" -> "http://computer-database.gatling.io",
	"Upgrade-Insecure-Requests" -> "1")

	val uri1 = "http://computer-database.gatling.io"

	object OpenMainPage{

		val open = exec(http("OpenMainPage")
			.get("/")
			.headers(headers_0))
			.pause(1)
	}

	object Search{

		val feeder = csv("dataFeed.csv").random

		val search = exec(http("Search").get("/"))
			.pause(1)
			.feed(feeder)
			.exec(http("SearchFor_${searchCriterion}")
			.get("/computers?f=${searchCriterion}")
			.headers(headers_0)
				.check(css("a:contains('${computerName}')", "href")
					.saveAs("computerURL")))
			.pause(1)
			.exec(http("Result")
			  .get("${computerURL}").check(status.is(200)))
	}

	object Edit{

		val edit = exec(http("ClickEditComputer")
			.get("/computers/169509")
			.headers(headers_0))
			.pause(1)
			.exec(http("SaveChanges")
				.post("/computers/169509")
				.headers(headers_3)
				.formParam("name", "Apple iMac 2066")
				.formParam("introduced", "2033-01-02")
				.formParam("discontinued", "2057-12-22")
				.formParam("company", "5"))
			.pause(1)
	}

	object Delete{

		val delete = exec(http("ClickEditComputer")
			.get("/computers/209154")
			.headers(headers_0))
			.pause(1)
			.exec(http("Delete")
				.post("/computers/209154/delete")
				.headers(headers_3))
			.pause(1)
	}

	object AddNewComputer{

		val addNewComputer = exec(http("AddNew")
			.get("/computers/new")
			.headers(headers_0))
			.pause(1)
			.exec(http("CreateComputer")
				.post("/computers")
				.headers(headers_3)
				.formParam("name", "My computer")
				.formParam("introduced", "2033-01-02")
				.formParam("discontinued", "2057-12-22")
				.formParam("company", "4"))
			.pause(1)
	}

	object FindComputer{

		val findComputer = exec(http("Search")
			.get("/computers?f=My+")
			.headers(headers_0))
			.pause(1)
	}

	object BrowsePage{

		val browsePage =
			repeat(8, "i") {
				exec(http("BrowsePage_${i}")
					.get("/computers?p=${i}")
					.headers(headers_0))
					.pause(1)
			}
	}


	val users = scenario("Users").exec(OpenMainPage.open, Search.search,
		 FindComputer.findComputer, BrowsePage.browsePage)


	val admins = scenario("Administrators").exec(OpenMainPage.open, Search.search,
		Edit.edit, Delete.delete, AddNewComputer.addNewComputer, FindComputer.findComputer, BrowsePage.browsePage)


	setUp(
		users.inject(rampUsers(25) over (20)),
		admins.inject(rampUsers(10) over(10))
		).protocols(httpProtocol).assertions(
		global.successfulRequests.percent.between(85,100),
		global.responseTime.max.lessThan(50)
	)
}