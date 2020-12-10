package dazn

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://stag.dazn.com")
		.inferHtmlResources()



    val uri1 = "stag.dazn.com"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.post("/misl/v1/Startup?%24format=json")
			.body(RawFileBody("RecordedSimulation_0000_request.txt")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}