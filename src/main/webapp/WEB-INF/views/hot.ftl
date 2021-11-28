<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head><#import "spring.ftl" as spring />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Pricing - Brand</title>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/bootstrap/css/bootstrap.min.css'/>">
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/fonts/font-awesome.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/fonts/simple-line-icons.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Footer-Basic.css'/>">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Navigation-with-Button.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Registration-Form-with-Photo.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Soft-ui-Navbar.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/vanilla-zoom.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Light-Contact-List.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Ludens-Users---3-Profile.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Ludens-Users---4-Edit-Profile.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/Manage-Users.css'/>">
    <script type="text/javascript" src="<@spring.url '/resources/js/jquery-3.6.0.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/bootstrap/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/baguetteBox.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/vanilla-zoom.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/theme.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/sockjs.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/stomp.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/resources/js/websocket.js'/>"></script>

</head>

<body>
<div class="navbar navbar-light navbar-expand-md navigation-clean-button" >

    <div class="container"><a class="navbar-brand" href="/HotTariffApp/main"><img src="/static/img/tech/main%20logo.png" width="60"
                                                                           style="margin: 0px 0px 0px 0px;" href="vk.com/firstofthekind"
                                                                           link="vk.com/firstofthekind"></a>
        <button data-bs-toggle="collapse" class="navbar-toggler" data-bs-target="#navcol-1"><span
                    class="visually-hidden">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navcol-1">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link" href="/HotTariffApp/main">Main</a></li>
                <li class="nav-item"><a class="nav-link" href="/HotTariffApp/tariffs">Tariffs</a></li>
            </ul>
            <span
                    class="navbar-text actions" > <a
                        class="btn btn-light action-button" role="button" href="/main">back</a></span></div>
    </div>
</div>
<main class="page landing-page">
    <section>
        <div class="container" id="tarifflist">
            <div class="block-heading" style="margin-top: 20px"
            ><h2 class="text-center">HOTTEST TARIFFS OF THE MONTH</h2></div>
            <div class="row justify-content-center" >
                <#list tariffs>
                    <#items as tariff>
                        <#if !tariff.isDeleted()>
                            <div class="col-md-12" style="width: 30%">
                                <form class="clean-pricing-item">
                                    <div class="heading"><h3 class="heading">${tariff.title}</h3></div>
                                    <div class="features"><h4>
                                            <span class="feature">Price (USD per month):&nbsp;</span>
                                            <span>${tariff.price}</span></h4>
                                        <h4><span class="feature">Connection cost (USD):&nbsp;</span>
                                            <span>${tariff.connectionCost}</span></h4>
                                        <h4><span class="feature">CURRENT CONTRACTS:&nbsp;</span>
                                            <span>${tariff.count}</span></h4></div>
                                    <div class="price"></div>
                                </form>
                            </div>
                        </#if>
                    </#items>
                </#list>
            </div>
        </div>
    </section>
</main>
<footer class="footer-basic">
    <div class="social"><a href="http://instagram.com/firstofthekind"><img
                    src="<@spring.url '/resources/img/small-logos/instagram.png'/>"
                    width="40" style="margin: 0px 12px 0px 0px;"
                    href="instagram.com/firstofthekind"></a><a
                href="http://vk.com/firstofthekind"><img src="<@spring.url '/resources/img/small-logos/vk-social-logotype.png'/>"
                                                         width="40"
                                                         style="margin: 0px 12px 0px 0px;" href="vk.com/firstofthekind"
                                                         link="vk.com/firstofthekind"></a><a
                href="http://github.com/firstofthekind"><img src="<@spring.url '/resources/img/small-logos/github.png'/>" width="40"
                                                             style="margin: 0px 12px 0px 0px;"
                                                             href="github.com/firstofthekind"></a></div>
    <ul class="list-inline">
        <li class="list-inline-item"><a href="#">Home</a></li>
        <li class="list-inline-item"><a href="#">Services</a></li>
        <li class="list-inline-item"><a href="#">About</a></li>
        <li class="list-inline-item"><a href="#">Terms</a></li>
        <li class="list-inline-item"><a href="#">Privacy Policy</a></li>
    </ul>
    <p class="copyright">Viacheslav Liashenko © 2021</p></footer>

</body>
</html>