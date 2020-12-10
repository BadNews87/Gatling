package Simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class WorkshopRecording extends Simulation {

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
		.exec(http("request_0")
			.get("/")
			.headers(headers_0))
		.pause(15)
		// Search
		.exec(http("request_1")
			.get("/computers?f=Mac")
			.headers(headers_0))
		.pause(18)
		// Edit
		.exec(http("request_2")
			.get("/computers/169509")
			.headers(headers_0))
		.pause(20)
		.exec(http("request_3")
			.post("/computers/169509")
			.headers(headers_3)
			.formParam("name", "Apple iMac 2066")
			.formParam("introduced", "2033-01-02")
			.formParam("discontinued", "2057-12-22")
			.formParam("company", "5"))
		.pause(11)
		// Delete
		.exec(http("request_4")
			.get("/computers/209154")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_5")
			.post("/computers/209154/delete")
			.headers(headers_3))
		.pause(13)
		// AddNewComputer
		.exec(http("request_6")
			.get("/computers/new")
			.headers(headers_0))
		.pause(15)
		.exec(http("request_7")
			.post("/computers")
			.headers(headers_3)
			.formParam("name", "My computer")
			.formParam("introduced", "2033-01-02")
			.formParam("discontinued", "2057-12-22")
			.formParam("company", "4"))
		.pause(21)
		// FindMyComputer
		.exec(http("request_8")
			.get("/computers?f=My+")
			.headers(headers_0))
		.pause(27)
		// BrowsePage
		.exec(http("request_9")
			.get("/")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_10")
			.get("/computers?p=1")
			.headers(headers_0)
			.resources(http("request_11")
			.get(uri1 + "/computers?p=2")
			.headers(headers_0),
            http("request_12")
			.get(uri1 + "/computers?p=3")
			.headers(headers_0),
            http("request_13")
			.get(uri1 + "/computers?p=4")
			.headers(headers_0),
            http("request_14")
			.get(uri1 + "/computers?p=5")
			.headers(headers_0),
            http("request_15")
			.get(uri1 + "/computers?p=6")
			.headers(headers_0),
            http("request_16")
			.get(uri1 + "/computers?p=7")
			.headers(headers_0),
            http("request_17")
			.get(uri1 + "/computers?p=8")
			.headers(headers_0)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}