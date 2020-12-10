package dazn

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DaZone extends Simulation {

	val httpProtocol = http
		.baseURL("https://stag.dazn.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())



    val uri1 = "https://cdn-stag.dazn.com/app/web/1.16.0"
    val uri2 = "stag.dazn.com"

	val scn = scenario("DaZone")
		.exec(http("request_0")
			.get("/en-JP/account/signin-selector"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}