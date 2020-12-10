//
//import io.gatling.core.Predef._
//import io.gatling.http.Predef._
//
//class RecordedSimulation extends Simulation {
//
//  val httpProtocol = http
//    .baseURL("http://biznesliga-silesia.pl")
//    .inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
//
//  val headers_0 = Map(
//    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
//    "Upgrade-Insecure-Requests" -> "1")
//
//  val headers_1 = Map(
//    "Accept" -> "text/css,*/*;q=0.1",
//    "Resource-Freshness" -> "max-age=86400,stale-while-revalidate=604800,age=3395",
//    "X-Client-Data" -> "CJW2yQEIprbJAQjEtskBCPScygE=")
//
//  val headers_2 = Map(
//    "Accept" -> "text/css,*/*;q=0.1",
//    "X-Client-Data" -> "CJW2yQEIprbJAQjEtskBCPScygE=")
//
//  val headers_3 = Map(
//    "Accept" -> "*/*",
//    "Origin" -> "http://biznesliga-silesia.pl")
//
//  val headers_4 = Map(
//    "Accept" -> "*/*",
//    "Origin" -> "http://biznesliga-silesia.pl",
//    "X-Client-Data" -> "CJW2yQEIprbJAQjEtskBCPScygE=")
//
//  val headers_30 = Map("Accept" -> "*/*")
//
//  val headers_39 = Map("Accept" -> "text/css,*/*;q=0.1")
//
//  val headers_41 = Map(
//    "Accept" -> "text/html, */*; q=0.01",
//    "Accept-Encoding" -> "gzip, deflate",
//    "Origin" -> "http://biznesliga-silesia.pl",
//    "X-Requested-With" -> "XMLHttpRequest")
//
//  val headers_54 = Map(
//    "Accept" -> "*/*",
//    "Pragma" -> "no-cache")
//
//  val uri01 = "http://i0.wp.com/biznesliga-silesia.pl/wp-content/uploads"
//  val uri02 = "www.biznesliga-silesia.pl"
//  val uri03 = "graph.facebook.com"
//  val uri04 = "http://stats.wp.com/e-201635.js"
//  val uri05 = "http://fonts.gstatic.com/s"
//  val uri06 = "http://biznesliga-silesia.pl"
//  val uri07 = "http://pixel.wp.com"
//  val uri08 = "http://i2.wp.com/biznesliga-silesia.pl/wp-content/uploads"
//  val uri09 = "http://fonts.googleapis.com/css"
//  val uri10 = "https://www.google.com/recaptcha/api.js"
//  val uri11 = "http://s0.wp.com/wp-content/js/devicepx-jetpack.js"
//  val uri12 = "http://s.gravatar.com"
//  val uri13 = "http://i1.wp.com/biznesliga-silesia.pl/wp-content/uploads"
//
//  val scn = scenario("RecordedSimulation")
//    // OPePAge
//    .exec(http("request_0")
//    .get("/video/")
//    .headers(headers_0)
//    .resources(http("request_1")
//      .get(uri09 + "?family=Open+Sans:800&subset=latin,cyrillic-ext,latin-ext,cyrillic,greek-ext,greek,vietnamese")
//      .headers(headers_1),
//      http("request_2")
//        .get(uri09 + "?family=Open+Sans:800&subset=latin,cyrillic-ext,latin-ext,cyrillic,greek-ext,greek,vietnamese")
//        .headers(headers_2),
//      http("request_3")
//        .get(uri06 + "/wp-content/plugins/js_composer/assets/lib/bower/font-awesome/fonts/fontawesome-webfont.woff2?v=4.5.0")
//        .headers(headers_3)
//        .check(status.is(304)),
//      http("request_4")
//        .get(uri05 + "/muktavaani/v1/X9qyC4rK_D9w1AvSv0mw_3JuJo8UJJfpGKt7pXjBv4s.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_5")
//        .get(uri05 + "/oswald/v11/_P8jt3Y65hJ9c4AzRE0V1OvvDin1pK8aKteLpeZ5c0A.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_6")
//        .get(uri05 + "/muktavaani/v1/nBCV_CfolotRfZcyb1WMZ4gp9Q8gbYrhqGlRav_IXfk.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_7")
//        .get(uri05 + "/lato/v11/MDadn8DQ_3oT6kvnUq_2r_esZW2xOQ-xsNqO47m55DA.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_8")
//        .get(uri05 + "/muktavaani/v1/X9qyC4rK_D9w1AvSv0mw_y68rctvF73tXrwnoj-zJz4.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_9")
//        .get(uri05 + "/oswald/v11/Qw6_9HvXRQGg5mMbFR3Phn-_kf6ByYO6CLYdB4HQE-Y.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_10")
//        .get(uri05 + "/lato/v11/HkF_qI1x_noxlxhrhMQYEJBw1xU1rKptJj_0jans920.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_11")
//        .get(uri05 + "/muktavaani/v1/nBCV_CfolotRfZcyb1WMZ6E8kM4xWR1_1bYURRojRGc.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_12")
//        .get(uri05 + "/lato/v11/8qcEw_nrk_5HEcCpYdJu8BTbgVql8nDJpwnrE27mub0.woff2")
//        .headers(headers_4)
//        .check(status.is(304)),
//      http("request_13")
//        .get(uri01 + "/2016/04/unilever-200x200.png?resize=200%2C200")
//        .check(status.is(304)),
//      http("request_14")
//        .get(uri01 + "/2016/03/Madej-Wrobel-Logo2.png?w=300")
//        .check(status.is(304)),
//      http("request_15")
//        .get(uri01 + "/2015/01/logo_jeronimo-biedronka.png?resize=300%2C150")
//        .check(status.is(304)),
//      http("request_16")
//        .get(uri01 + "/2016/03/Perform_Groupb.jpg?w=300")
//        .check(status.is(304)),
//      http("request_17")
//        .get(uri13 + "/2016/08/KAMSOFT.png?w=300")
//        .check(status.is(304)),
//      http("request_18")
//        .get(uri08 + "/2016/03/Geodis.jpg?w=300")
//        .check(status.is(304)),
//      http("request_19")
//        .get(uri08 + "/2016/08/max-fliz.jpg?w=300")
//        .check(status.is(304)),
//      http("request_20")
//        .get(uri01 + "/2016/03/logo_tmf22.png?w=201")
//        .check(status.is(304)),
//      http("request_21")
//        .get(uri13 + "/2016/03/auchan-eps-vector-logo200-1.png?w=200")
//        .check(status.is(304)),
//      http("request_22")
//        .get(uri01 + "/2016/08/sygnity-min-1.jpg?w=300")
//        .check(status.is(304)),
//      http("request_23")
//        .get(uri08 + "/2016/03/Raben_logo.png?resize=300%2C136")
//        .check(status.is(304)),
//      http("request_24")
//        .get(uri08 + "/2016/08/castorama.png?w=300")
//        .check(status.is(304)),
//      http("request_25")
//        .get(uri13 + "/2016/03/logo-fortis.jpg?w=96")
//        .check(status.is(304)),
//      http("request_26")
//        .get(uri08 + "/2016/08/dbgeodezja-logo.jpg?w=300")
//        .check(status.is(304)),
//      http("request_27")
//        .get(uri01 + "/2015/01/logo_pwc.png?resize=300%2C150")
//        .check(status.is(304)),
//      http("request_28")
//        .get(uri08 + "/2015/01/logo_dagma.png?resize=300%2C150")
//        .check(status.is(304)),
//      http("request_29")
//        .get(uri01 + "/2016/03/komandor_logo223.png?w=200")
//        .check(status.is(304)),
//      http("request_30")
//        .get(uri06 + "/wp-includes/js/wp-emoji-release.min.js?ver=4.5.3")
//        .headers(headers_30)
//        .check(status.is(304)),
//      http("request_31")
//        .get(uri01 + "/2016/08/Hireright.png?w=300")
//        .check(status.is(304)),
//      http("request_32")
//        .get(uri08 + "/2016/09/logo-Pro-Business-Solutions-kolor.png?w=300")
//        .check(status.is(304)),
//      http("request_33")
//        .get(uri01 + "/2016/08/retosbus-logo.png?w=300")
//        .check(status.is(304)),
//      http("request_34")
//        .get(uri08 + "/2015/01/logo_themadmix.png?resize=300%2C150")
//        .check(status.is(304)),
//      http("request_35")
//        .get(uri13 + "/2016/03/BMW-Sikora_300x150.png?w=300")
//        .check(status.is(304)),
//      http("request_36")
//        .get(uri01 + "/2016/03/czystebuty_logo.png?w=300")
//        .check(status.is(304)),
//      http("request_37")
//        .get(uri13 + "/2016/03/spectrum.jpg?w=300")
//        .check(status.is(304)),
//      http("request_38")
//        .get(uri13 + "/2015/01/logo_g2.png?resize=300%2C150")
//        .check(status.is(304)),
//      http("request_39")
//        .get(uri12 + "/css/hovercard.css?ver=2016Sepaa")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_40")
//        .get(uri12 + "/css/services.css?ver=2016Sepaa")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_42")
//        .get(uri06 + "/wp-content/plugins/football-pool/assets/admin/datetimepicker/jquery.datetimepicker.css?ver=2.5.4")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_43")
//        .get(uri06 + "/wp-content/plugins/football-pool/assets/admin/admin.css?ver=2.5.4")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_44")
//        .get(uri06 + "/wp-content/plugins/wp-lightbox-bank/assets/css/framework.css?ver=4.5.3")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_45")
//        .get(uri06 + "/wp-content/plugins/football-pool/assets/admin/jquery-ui/jquery-ui-1.10.4.custom.min.css?ver=2.5.4")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_46")
//        .get(uri06 + "/wp-content/plugins/wp-lightbox-bank/assets/css/system-message.css?ver=4.5.3")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_47")
//        .get(uri06 + "/wp-content/plugins/wp-lightbox-bank/assets/css/lightbox-custom.css?ver=4.5.3")
//        .headers(headers_39)
//        .check(status.is(304)),
//      http("request_48")
//        .get(uri08 + "/2016/08/video-thumb-2-5.png?w=586")
//        .check(status.is(304)),
//      http("request_49")
//        .get(uri01 + "/2016/08/video-thumb-2-2.png?w=586")
//        .check(status.is(304)),
//      http("request_50")
//        .post(uri06 + "/wp-admin/admin-ajax.php")
//        .headers(headers_41)
//        .formParam("action", "vc_get_vc_grid_data")
//        .formParam("vc_action", "vc_get_vc_grid_data")
//        .formParam("tag", "vc_basic_grid")
//        .formParam("data[visible_pages]", "5")
//        .formParam("data[page_id]", "8735")
//        .formParam("data[style]", "pagination")
//        .formParam("data[action]", "vc_get_vc_grid_data")
//        .formParam("data[shortcode_id]", "1469188250699-d7b41b30-61d2-10")
//        .formParam("data[items_per_page]", "6")
//        .formParam("data[auto_play]", "false")
//        .formParam("data[gap]", "15")
//        .formParam("data[speed]", "-1000")
//        .formParam("data[loop]", "yes")
//        .formParam("data[animation_in]", "none")
//        .formParam("data[animation_out]", "none")
//        .formParam("data[arrows_design]", "none")
//        .formParam("data[arrows_color]", "blue")
//        .formParam("data[arrows_position]", "inside")
//        .formParam("data[paging_design]", "pagination_rounded")
//        .formParam("data[paging_color]", "black")
//        .formParam("data[tag]", "vc_basic_grid")
//        .formParam("vc_post_id", "8735")
//        .formParam("_vcnonce", "5739f33242"),
//      http("request_51")
//        .get(uri07 + "/g.gif?v=ext&j=1%3A4.2.2&blog=108452113&post=8735&tz=2&srv=biznesliga-silesia.pl&host=biznesliga-silesia.pl&ref=http%3A%2F%2Fbiznesliga-silesia.pl%2F&rand=0.39761787094175816"),
//      http("request_52")
//        .post(uri06 + "/wp-admin/admin-ajax.php")
//        .headers(headers_41)
//        .formParam("action", "vc_get_vc_grid_data")
//        .formParam("vc_action", "vc_get_vc_grid_data")
//        .formParam("tag", "vc_basic_grid")
//        .formParam("data[visible_pages]", "5")
//        .formParam("data[page_id]", "8735")
//        .formParam("data[style]", "pagination")
//        .formParam("data[action]", "vc_get_vc_grid_data")
//        .formParam("data[shortcode_id]", "1469188250704-7ae43dc8-45c4-9")
//        .formParam("data[items_per_page]", "6")
//        .formParam("data[auto_play]", "false")
//        .formParam("data[gap]", "15")
//        .formParam("data[speed]", "-1000")
//        .formParam("data[loop]", "")
//        .formParam("data[animation_in]", "none")
//        .formParam("data[animation_out]", "none")
//        .formParam("data[arrows_design]", "none")
//        .formParam("data[arrows_color]", "blue")
//        .formParam("data[arrows_position]", "inside")
//        .formParam("data[paging_design]", "pagination_rounded")
//        .formParam("data[paging_color]", "black")
//        .formParam("data[tag]", "vc_basic_grid")
//        .formParam("vc_post_id", "8735")
//        .formParam("_vcnonce", "5739f33242"),
//      http("request_53")
//        .get(uri06 + "/wp-content/plugins/js_composer/assets/fonts/vc_grid/vc_grid_v1.woff?-9hbgac")
//        .headers(headers_3)
//        .check(status.is(304))))
//    .pause(2)
//    .exec(http("request_54")
//      .get(uri01 + "/2015/02/cropped-LOGO-SLASK-BIZNES_cz.jpg?fit=192%2C192")
//      .headers(headers_54))
//    .pause(10)
//    // Open Home
//    .exec(http("request_55")
//    .get(uri07 + "/c.gif?s=2&u=http%3A%2F%2Fwww.biznesliga-silesia.pl%2F&r=&b=108452113&p=8735&rand=0.7926466206554323")
//    .resources(http("request_56")
//      .get("http://" + uri02 + "/")
//      .headers(headers_0),
//      http("request_57")
//        .get(uri06 + "/wp-content/plugins/sportspress-pro/includes/sportspress-scoreboard/js/sportspress-scoreboard.js?ver=1472720633")
//        .headers(headers_30),
//      http("request_58")
//        .get(uri06 + "/wp-content/plugins/sportspress-pro/includes/sportspress-sponsors/js/sportspress-sponsors.js?ver=1472720633")
//        .headers(headers_30),
//      http("request_59")
//        .get(uri06 + "/wp-content/plugins/visual-football-formation-vertical-edition/css/front/style.css?ver=4.5.3")
//        .headers(headers_39)
//        .check(status.is(404)),
//      http("request_60")
//        .get(uri07 + "/g.gif?v=ext&j=1%3A4.2.2&blog=108452113&post=135&tz=2&srv=biznesliga-silesia.pl&host=biznesliga-silesia.pl&ref=http%3A%2F%2Fbiznesliga-silesia.pl%2Fvideo%2F&rand=0.8611254654824734"),
//      http("request_61")
//        .post(uri06 + "/wp-admin/admin-ajax.php")
//        .headers(headers_41)
//        .formParam("action", "vc_get_vc_grid_data")
//        .formParam("vc_action", "vc_get_vc_grid_data")
//        .formParam("tag", "vc_basic_grid")
//        .formParam("data[visible_pages]", "5")
//        .formParam("data[page_id]", "135")
//        .formParam("data[style]", "all")
//        .formParam("data[action]", "vc_get_vc_grid_data")
//        .formParam("data[shortcode_id]", "1472683957778-80d6d8c5-7b36-0")
//        .formParam("data[tag]", "vc_basic_grid")
//        .formParam("vc_post_id", "135")
//        .formParam("_vcnonce", "5739f33242"),
//      http("request_62")
//        .post(uri06 + "/wp-admin/admin-ajax.php")
//        .headers(headers_41)
//        .formParam("action", "vc_get_vc_grid_data")
//        .formParam("vc_action", "vc_get_vc_grid_data")
//        .formParam("tag", "vc_basic_grid")
//        .formParam("data[visible_pages]", "5")
//        .formParam("data[page_id]", "135")
//        .formParam("data[style]", "all")
//        .formParam("data[action]", "vc_get_vc_grid_data")
//        .formParam("data[shortcode_id]", "1472683957777-ba45f350-08f2-6")
//        .formParam("data[tag]", "vc_basic_grid")
//        .formParam("vc_post_id", "135")
//        .formParam("_vcnonce", "5739f33242"),
//      http("request_63")
//        .post(uri06 + "/wp-admin/admin-ajax.php")
//        .headers(headers_41)
//        .formParam("action", "vc_get_vc_grid_data")
//        .formParam("vc_action", "vc_get_vc_grid_data")
//        .formParam("tag", "vc_basic_grid")
//        .formParam("data[visible_pages]", "5")
//        .formParam("data[page_id]", "135")
//        .formParam("data[style]", "load-more")
//        .formParam("data[action]", "vc_get_vc_grid_data")
//        .formParam("data[shortcode_id]", "1472683957776-7ac10eb1-e9b5-1")
//        .formParam("data[items_per_page]", "4")
//        .formParam("data[btn_data][title]", "Więcej artykułów")
//        .formParam("data[btn_data][style]", "outline-custom")
//        .formParam("data[btn_data][gradient_color_1]", "outline-custom")
//        .formParam("data[btn_data][gradient_color_2]", "outline-custom")
//        .formParam("data[btn_data][gradient_custom_color_1]", "outline-custom")
//        .formParam("data[btn_data][gradient_custom_color_2]", "outline-custom")
//        .formParam("data[btn_data][gradient_text_color]", "outline-custom")
//        .formParam("data[btn_data][custom_background]", "#ededed")
//        .formParam("data[btn_data][custom_text]", "#666")
//        .formParam("data[btn_data][outline_custom_color]", "#383838")
//        .formParam("data[btn_data][outline_custom_hover_background]", "#353535")
//        .formParam("data[btn_data][outline_custom_hover_text]", "#ffffff")
//        .formParam("data[btn_data][shape]", "rounded")
//        .formParam("data[btn_data][color]", "blue")
//        .formParam("data[btn_data][size]", "sm")
//        .formParam("data[btn_data][align]", "inline")
//        .formParam("data[btn_data][button_block]", "")
//        .formParam("data[btn_data][add_icon]", "true")
//        .formParam("data[btn_data][i_align]", "left")
//        .formParam("data[btn_data][i_type]", "fontawesome")
//        .formParam("data[btn_data][i_icon_fontawesome]", "fa fa-history")
//        .formParam("data[btn_data][i_icon_openiconic]", "vc-oi vc-oi-dial")
//        .formParam("data[btn_data][i_icon_typicons]", "typcn typcn-adjust-brightness")
//        .formParam("data[btn_data][i_icon_entypo]", "entypo-icon entypo-icon-note")
//        .formParam("data[btn_data][i_icon_linecons]", "vc_li vc_li-heart")
//        .formParam("data[btn_data][i_icon_monosocial]", "vc_li vc_li-heart")
//        .formParam("data[btn_data][i_icon_pixelicons]", "vc_pixel_icon vc_pixel_icon-alert")
//        .formParam("data[btn_data][custom_onclick]", "vc_pixel_icon vc_pixel_icon-alert")
//        .formParam("data[btn_data][custom_onclick_code]", "vc_pixel_icon vc_pixel_icon-alert")
//        .formParam("data[tag]", "vc_basic_grid")
//        .formParam("vc_post_id", "135")
//        .formParam("_vcnonce", "5739f33242"),
//    .pause(3)
//    .exec(http("request_65")
//      .get("/newsy/nowa-pilka-ligowa-select-flash-turf/")
//      .headers(headers_0)
//      .resources(http("request_66")
//        .get(uri01 + "/2016/09/pilka-select-turf-min-1.png?w=750"),
//        http("request_67")
//          .get(uri07 + "/g.gif?v=wpcom-no-pv&x_sharing-count-request=linkedin&r=0.5101177464239299"),
//        http("request_68")
//          .get(uri07 + "/g.gif?v=wpcom-no-pv&x_sharing-count-request=facebook&r=0.42395607638172805"),
//        http("request_69")
//          .get(uri07 + "/g.gif?v=ext&j=1%3A4.2.2&blog=108452113&post=10876&tz=2&srv=biznesliga-silesia.pl&host=biznesliga-silesia.pl&ref=http%3A%2F%2Fbiznesliga-silesia.pl%2F&rand=0.6779732559807599"),
//        http("request_70")
//          .get("http://" + uri03 + "/?callback=WPCOMSharing.update_facebook_count&ids=http%3A%2F%2Fbiznesliga-silesia.pl%2Fnewsy%2Fnowa-pilka-ligowa-select-flash-turf%2F&_=1472721347607")
//          .headers(headers_30)))
//
//    setUp (scn.inject(atOnceUsers(1))).protocols(httpProtocol)
//}