package dazn

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LoginDocomo extends Simulation {

	val httpProtocol = http
		.baseURL("http://softwareengineering.stackexchange.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"X-Requested-With" -> "XMLHttpRequest")

    val uri1 = "ajax.googleapis.com"
    val uri2 = "https://cdn.sstatic.net"
    val uri3 = "https://www.gravatar.com/avatar"
    val uri4 = "b.scorecardresearch.com"
    val uri5 = "pixel.quantserve.com"
    val uri6 = "http://softwareengineering.stackexchange.com"
    val uri7 = "https://i.stack.imgur.com"

	val scn = scenario("LoginDocomo")
		.exec(http("request_0")
			.get("/questions/19203/what-are-the-benefits-of-using-dependency-injection-and-ioc-containers")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri6 + "/posts/19203/ivc/f68d?_=1487080159716")
			.headers(headers_1),
            http("request_2")
			.get("http://" + uri4 + "/b?c1=2&c2=17440561&ns__t=1487080160263&ns_c=UTF-8&cv=3.1&c8=design%20patterns%20-%20What%20are%20the%20benefits%20of%20using%20Dependency%20Injection%20and%20IoC%20Containers%3F%20-%20Software%20Engineering%20Stack%20Exchange&c7=http%3A%2F%2Fsoftwareengineering.stackexchange.com%2Fquestions%2F19203%2Fwhat-are-the-benefits-of-using-dependency-injection-and-ioc-containers&c9="),
            http("request_3")
			.get("http://" + uri5 + "/pixel;r=588920834;a=p-c1rF4kxgLUzNc;fpan=0;fpa=P0-2099861850-1457265579202;ns=0;ce=1;cm=;je=0;sr=1920x1200x24;enc=n;dst=1;et=1487080160260;tzo=-60;ref=;url=http%3A%2F%2Fsoftwareengineering.stackexchange.com%2Fquestions%2F19203%2Fwhat-are-the-benefits-of-using-dependency-injection-and-ioc-containers;ogl=type.website%2Cimage.https%3A%2F%2Fcdn%252Esstatic%252Enet%2FSites%2Fsoftwareengineering%2Fimg%2Fapple-touch-icon%402%252Epng%3Fv%3D1%2Ctitle.What%20are%20the%20benefits%20of%20using%20Dependency%20Injection%20and%20IoC%20Containers%3F%2Cdescription.I'm%20planning%20to%20do%20a%20talk%20on%20Dependency%20Injection%20and%20IoC%20Containers%252C%20and%20I'm%20lo%2Curl.http%3A%2F%2Fsoftwareengineering%252Estackexchange%252Ecom%2Fquestions%2F19203%2Fwhat-are-the-benefi")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}