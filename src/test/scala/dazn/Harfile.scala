package dazn

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Harfile extends Simulation {

	val httpProtocol = http
		.baseURL("https://stag.dazn.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://stag.dazn.com",
		"Pragma" -> "no-cache")

	val headers_3 = Map(
		"accept" -> "image/webp,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, sdch, br",
		"accept-language" -> "pl-PL,pl;q=0.8,en-US;q=0.6,en;q=0.4,de;q=0.2",
		"cache-control" -> "no-cache",
		"cookie" -> "datr=JBGjWFjj6nZp6Ej2OKm4jmES; reg_fb_ref=https%3A%2F%2Fwww.facebook.com%2F; reg_fb_gate=https%3A%2F%2Fwww.facebook.com%2F; fr=064MZEVa2pA6KAwdZ..BYoxBq.7p.AAA.0.0.BYoxid.AWWrWqmF",
		"pragma" -> "no-cache",
		"referer" -> "https://stag.dazn.com/en-JP",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36")

	val headers_4 = Map(
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://stag.dazn.com",
		"Pragma" -> "no-cache")

	val headers_5 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://stag.dazn.com",
		"Pragma" -> "no-cache")

	val headers_6 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Cache-Control" -> "no-cache",
		"Content-type" -> "application/json",
		"Origin" -> "https://stag.dazn.com",
		"Pragma" -> "no-cache")

	val headers_9 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_10 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_15 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

    val uri01 = "https://5291104.fls.doubleclick.net"
    val uri02 = "www.google-analytics.com"
    val uri03 = "du7kewxt8xh3b.cloudfront.net"
    val uri04 = "az692189.vo.msecnd.net"
    val uri05 = "bat.bing.com"
    val uri06 = "https://stag-jp.dazn.com/misl/jp/v1/RatePlans"
    val uri07 = "www.googletagmanager.com"
    val uri08 = "https://stag.dazn.com"
    val uri09 = "www.facebook.com"
    val uri10 = "sp.analytics.yahoo.com"
    val uri11 = "https://cdn-stag.dazn.com"

	val scn = scenario("Harfile")
		.exec(http("request_0")
			.get("/en-JP")
			.headers(headers_0)
			.resources(http("request_1")
			.get("https://" + uri07 + "/gtm.js?id=GTM-MCBGVB"),
            http("request_2")
			.post(uri08)
			.headers(headers_2)
			.body(RawFileBody("Harfile_0002_request.txt")),
            http("request_3")
			.get("https://" + uri09 + "/tr/?id=169007393511166&ev=PageView&dl=https%3A%2F%2Fstag.dazn.com%2Fen-JP&rl=&if=false&ts=1487087802446&v=2.5.1")
			.headers(headers_3),
            http("request_4")
			.get("https://" + uri03 + "/misl/jp/v1/ResourceStrings?%24format=json&LanguageCode=en&region=JP&Platform=web")
			.headers(headers_4),
            http("request_5")
			.options(uri06)
			.headers(headers_5),
            http("request_6")
			.post(uri06)
			.headers(headers_6)
			.body(RawFileBody("Harfile_0006_request.txt")),
            http("request_7")
			.get(uri11 + "/sign-up/generic/web/jp/en/config.json?id=1487087803707")
			.headers(headers_4),
            http("request_8")
			.get("https://" + uri02 + "/collect?v=1&_v=j47&a=1133939006&t=pageview&_s=1&dl=https%3A%2F%2Fstag.dazn.com%2Fen-JP&dp=en-JP&ul=en-us&de=UTF-8&dt=DAZN-Staging&sd=24-bit&sr=1920x1200&vp=1478x1126&je=0&fl=24.0%20r0&_u=QIAAAAAB~&cid=00646E45BA&tid=UA-69490814-1&gtm=GTM-MCBGVB&cd1=none&cd3=Mozilla%2F5.0%20(Macintosh%3B%20Intel%20Mac%20OS%20X%2010_11_3)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F56.0.2924.87%20Safari%2F537.36&cd4=web&cd5=1.16.0&cd13=&cd14=&z=638372250"),
            http("request_9")
			.get(uri01 + "/activityi;src=5291104;type=dazn_jp;cat=jp-da0;ord=6339493508611;~oref=https%3A%2F%2Fstag.dazn.com%2Fen-JP?")
			.headers(headers_9),
            http("request_10")
			.get("https://" + uri05 + "/action/0?ti=5318804&Ver=2&mid=78eeb3e7-7140-045d-1ce9-309d9ff6db33&evt=pageLoad&lt=953&pi=-1748725250&lg=en-US&sw=1920&sh=1200&sc=24&tl=DAZN-Staging&p=https%3A%2F%2Fstag.dazn.com%2Fen-JP&r=&rn=441026")
			.headers(headers_10),
            http("request_11")
			.get(uri01 + "/activityi;src=5291104;type=dach;cat=de_ge0;ord=2022568696814;~oref=https%3A%2F%2Fstag.dazn.com%2Fen-JP?")
			.headers(headers_9),
            http("request_12")
			.get(uri01 + "/activityi;dc_pre=CI77j-L5j9ICFUVbGAodxzkEJw;src=5291104;type=dach;cat=ch_ge0;ord=8244970239488;~oref=https%3A%2F%2Fstag.dazn.com%2Fen-JP"),
            http("request_13")
			.get(uri01 + "/activityi;dc_pre=CNbXkOL5j9ICFUGPGAodvb4JyA;src=5291104;type=dach;cat=at_ge0;ord=7240366116128;~oref=https%3A%2F%2Fstag.dazn.com%2Fen-JP"),
            http("request_14")
			.get(uri01 + "/activityi;dc_pre=CL2qjuL5j9ICFUdbGAodSSoBZQ;src=5291104;type=dazn_jp;cat=jp-da0;ord=6339493508611;~oref=https%3A%2F%2Fstag.dazn.com%2Fen-JP"),
            http("request_15")
			.get("https://" + uri10 + "/sp.pl?a=10000&jsonp=YAHOO.ywa.I13N.handleJSONResponse&d=Tue%2C%2014%20Feb%202017%2015%3A56%3A43%20GMT&n=-1&b=DAZN-Staging&.yp=10007673&f=https%3A%2F%2Fstag.dazn.com%2Fen-JP&enc=UTF-8")
			.headers(headers_15),
            http("request_16")
			.get("https://" + uri04 + "/scrpt/ct.js%3Chttp://az692189.vo.msecnd.net/scrpt/ct.js%3E")
			.headers(headers_15)
			.check(status.is(404)),
            http("request_17")
			.get(uri11 + "/app/web/1.16.0/fonts/FoundryGridnikW03Bold.woff2")
			.headers(headers_4),
            http("request_18")
			.get(uri11 + "/app/web/1.16.0/fonts/FoundryGridnikW03Regular.woff2")
			.headers(headers_4),
            http("request_19")
			.get(uri11 + "/app/web/1.16.0/fonts/iconfont.woff?20e223920f19327f646d79d915660cf7")
			.headers(headers_4),
            http("request_20")
			.get(uri11 + "/app/web/1.16.0/fonts/FoundryGridnikW03Medium.woff2")
			.headers(headers_4)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}