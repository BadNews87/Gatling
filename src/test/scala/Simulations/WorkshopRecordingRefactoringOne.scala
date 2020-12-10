package Simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class WorkshopRecordingRefactoringOne extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept-Encoding" -> "gzip, deflate",
	"Origin" -> "http://computer-database.gatling.io",
	"Upgrade-Insecure-Requests" -> "1")

	val uri1 = "http://computer-database.gatling.io"

	val scn = scenario("WorkshopRecording")
		// OpenMainPage
		.exec(http("OpenMainPage")
			.get("/")
			.headers(headers_0))
		.pause(1)
		// Search
		.exec(http("Search")
			.get("/computers?f=Mac")
			.headers(headers_0))
		.pause(1)
		// Edit
		.exec(http("ClickEditComputer")
			.get("/computers/169509")
			.headers(headers_0))
		.pause(2)
		.exec(http("SaveChanges")
			.post("/computers/169509")
			.headers(headers_3)
			.formParam("name", "Apple iMac 2066")
			.formParam("introduced", "2033-01-02")
			.formParam("discontinued", "2057-12-22")
			.formParam("company", "5"))
		.pause(1)
		// Delete
		.exec(http("ClickEditComputer")
			.get("/computers/209154")
			.headers(headers_0))
		.pause(1)
		.exec(http("Delete")
			.post("/computers/209154/delete")
			.headers(headers_3))
		.pause(3)
		// AddNewComputer
		.exec(http("AddNew")
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
		// FindMyComputer
		.exec(http("Search")
			.get("/computers?f=My+")
			.headers(headers_0))
		.pause(2)
		// BrowsePage
		.exec(http("NextPage")
			.get("/")
			.headers(headers_0))
		.pause(1)
		.exec(http("NextPage")
			.get("/computers?p=1")
			.headers(headers_0)
			.resources(http("NextPage")
			.get(uri1 + "/computers?p=2")
			.headers(headers_0),
            http("NextPage")
			.get(uri1 + "/computers?p=3")
			.headers(headers_0),
            http("NextPage")
			.get(uri1 + "/computers?p=4")
			.headers(headers_0),
            http("NextPage")
			.get(uri1 + "/computers?p=5")
			.headers(headers_0),
            http("NextPage")
			.get(uri1 + "/computers?p=6")
			.headers(headers_0),
            http("NextPage")
			.get(uri1 + "/computers?p=7")
			.headers(headers_0),
            http("NextPage")
			.get(uri1 + "/computers?p=8")
			.headers(headers_0)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}