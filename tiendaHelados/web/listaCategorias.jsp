<%-- 
    Document   : listaCategorias
    Created on : 27/11/2020, 09:50:09 AM
    Author     : Oscar Dacto
--%>
<%@page import="patronfacade.FacadeHelados"%>
<%@page import="patronfacade.HeladosFacade"%>
<%@page import="cruds.CRUDHelados"%>
<%@page import="cruds.CRUDCategorias"%>

<%@page import="java.util.LinkedList"%>
<%@page import="pojos.Helado"%>
<%@page import="pojos.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>HELADERIA</title>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />

        <meta name="keywords" content="bootstrap, bootstrap admin template, admin theme, admin dashboard, dashboard template, admin template, responsive" />
        <meta name="author" content="Codedthemes" />
        <!-- Favicon icon -->
        <link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,700" rel="stylesheet">
        <!-- waves.css -->
        <link rel="stylesheet" href="assets/pages/waves/css/waves.min.css" type="text/css" media="all">
        <!-- Required Fremwork -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap/css/bootstrap.min.css">
        <!-- waves.css -->
        <link rel="stylesheet" href="assets/pages/waves/css/waves.min.css" type="text/css" media="all">
        <!-- themify-icons line icon -->
        <link rel="stylesheet" type="text/css" href="assets/icon/themify-icons/themify-icons.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" type="text/css" href="assets/icon/font-awesome/css/font-awesome.min.css">
        <!-- ico font -->
        <link rel="stylesheet" type="text/css" href="assets/icon/icofont/css/icofont.css">
        <!-- Style.css -->
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link rel="stylesheet" type="text/css" href="assets/css/jquery.mCustomScrollbar.css">
    </head>

    <body>
        <!-- Pre-loader start -->
        <div class="theme-loader">
            <div class="loader-track">
                <div class="preloader-wrapper">
                    <div class="spinner-layer spinner-blue">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>
                    <div class="spinner-layer spinner-red">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>

                    <div class="spinner-layer spinner-yellow">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>

                    <div class="spinner-layer spinner-green">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Pre-loader end -->
        <div id="pcoded" class="pcoded">
            <div class="pcoded-overlay-box"></div>
            <div class="pcoded-container navbar-wrapper">
                <nav class="navbar header-navbar pcoded-header">
                    <div class="navbar-wrapper">
                        <div class="navbar-logo">
                            <a class="mobile-menu waves-effect waves-light" id="mobile-collapse" href="#!">
                                <i class="ti-menu"></i>
                            </a>
                            <div class="mobile-search waves-effect waves-light">
                                <div class="header-search">
                                    <div class="main-search morphsearch-search">
                                        <div class="input-group">
                                            <span class="input-group-prepend search-close"><i class="ti-close input-group-text"></i></span>
                                            <input type="text" class="form-control" placeholder="Enter Keyword">
                                            <span class="input-group-append search-btn"><i class="ti-search input-group-text"></i></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <a href="helados.jsp">
                                <img class="img-fluid" src="assets/images/logo.png" alt="Theme-Logo" />
                            </a>
                            <a class="mobile-options waves-effect waves-light">
                                <i class="ti-more"></i>
                            </a>
                        </div>
                        <div class="navbar-container container-fluid">
                            <ul class="nav-left">
                                <li>
                                    <div class="sidebar_toggle"><a href="javascript:void(0)"><i class="ti-menu"></i></a></div>
                                </li>
                                <li>
                                    <a href="#!" onclick="javascript:toggleFullScreen()" class="waves-effect waves-light">
                                        <i class="ti-fullscreen"></i>
                                    </a>
                                </li>
                            </ul>
                            <ul class="nav-right">

                                <li class="user-profile header-notification">
                                    <a href="#!" class="waves-effect waves-light">
                                        <img src="assets/images/avatar-4.jpg" class="img-radius" alt="User-Profile-Image">
                                        <span>Oscar I. Dacto</span>
                                        <i class="ti-angle-down"></i>
                                    </a>
                                    <ul class="show-notification profile-notification">
                                        <li class="waves-effect waves-light">
                                            <a href="#!">
                                                <i class="ti-settings"></i> Configuraciones
                                            </a>
                                        </li>
                                        <li class="waves-effect waves-light">
                                            <a href="user-profile.html">
                                                <i class="ti-user"></i> Perfil
                                            </a>
                                        </li>
                                        <li class="waves-effect waves-light">
                                            <a href="email-inbox.html">
                                                <i class="ti-email"></i> Mensajes
                                            </a>
                                        </li>

                                        <li class="waves-effect waves-light">
                                            <a href="auth-normal-sign-in.html">
                                                <i class="ti-layout-sidebar-left"></i> Salir
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <div class="pcoded-main-container">
                    <div class="pcoded-wrapper">
                        <nav class="pcoded-navbar">
                            <div class="sidebar_toggle"><a href="#"><i class="icon-close icons"></i></a></div>
                            <div class="pcoded-inner-navbar main-menu">
                                <div class="">
                                    <div class="main-menu-header">
                                        <img class="img-80 img-radius" src="assets/images/avatar-4.jpg" alt="User-Profile-Image">

                                    </div>
                                    <div class="main-menu-content">
                                        <ul>
                                            <li class="more-details">
                                                <a href="user-profile.html"><i class="ti-user"></i>View Profile</a>
                                                <a href="#!"><i class="ti-settings"></i>Settings</a>
                                                <a href="auth-normal-sign-in.html"><i class="ti-layout-sidebar-left"></i>Logout</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>


                                <div class="pcoded-navigation-label">Admin</div>
                                <ul class="pcoded-item pcoded-left-item">
                                    <li class="">
                                        <a href="helados.jsp" class="waves-effect waves-dark">
                                            <span class="pcoded-micon"><i class="ti-layers"></i><b>FC</b></span>
                                            <span class="pcoded-mtext">Helado</span>
                                            <span class="pcoded-mcaret"></span>
                                        </a>
                                    </li>
                                </ul>
                                <div class="pcoded-navigation-label">Categorias</div>
                                <ul class="pcoded-item pcoded-left-item">
                                    <li class="active">
                                        <a href="listaCategorias.jsp" class="waves-effect waves-dark">
                                            <span class="pcoded-micon"><i class="ti-receipt"></i><b>B</b></span>
                                            <span class="pcoded-mtext">Lista Categorias     </span>
                                            <span class="pcoded-mcaret"></span>
                                        </a>
                                    </li>
                                </ul>

                            </div>
                        </nav>
                        <div class="pcoded-content">
                            <!-- Page-header start -->
                            <div class="page-header">
                                <div class="page-block">
                                    <div class="row align-items-center">
                                        <div class="col-md-8">
                                            <div class="page-header-title">
                                                <h5 class="m-b-10">Helado por Categoria</h5>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <!-- Page-header end -->
                            <div class="pcoded-inner-content">
                                <!-- Main-body start -->
                                <div class="main-body">
                                    <div class="page-wrapper">
                                        <!-- Page-body start -->
                                        <div class="page-body">
                                            <div class="card">

                                                <div class="card-block table-border-style">
                                                    <div class="table-responsive">
                                                        <table class="table">
                                                            <thead>
                                                                <tr>
                                                                    <th>
                                                                        <div class="card">
                                                                            <div class="card-header">
                                                                                <h5>CHOLAOS</h5>

                                                                            </div>
                                                                            <div class="card-block table-border-style">
                                                                                <div class="table-responsive">
                                                                                    <table class="table">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>ID</th>
                                                                                                <th>Helado</th>
                                                                                                <th>Descripcion</th>
                                                                                                <th>Precio</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <%
                                                                                                CRUDHelados crudHelados = new CRUDHelados();

                                                                                                LinkedList<Helado> listaHeladosCholao = crudHelados.listarHeladosBuilder(3);
                                                                                                for (int i = 0; i < listaHeladosCholao.size(); i++) {

                                                                                                    out.println("<tr>");
                                                                                                    out.println("<td>" + listaHeladosCholao.get(i).getId() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosCholao.get(i).getName() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosCholao.get(i).getDescription() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosCholao.get(i).getPrice() + "</td>");
                                                                                                   // out.println("<td>" + listaHeladosCholao.get(i).getCategory() + "</td>");
                                                                                                    out.println("<tr>");
                                                                                                }
                                                                                            %>

                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="card">
                                                                            <div class="card-header">
                                                                                <h5>DE PAILA</h5>

                                                                            </div>
                                                                            <div class="card-block table-border-style">
                                                                                <div class="table-responsive">
                                                                                    <table class="table">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>ID</th>
                                                                                                <th>Helado</th>
                                                                                                <th>Descripcion</th>
                                                                                                <th>Precio</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <%
                                                                                                LinkedList<Helado> listaHeladosPaila = crudHelados.listarHeladosBuilder(4);
                                                                                                for (int j = 0; j < listaHeladosPaila.size(); j++) {
                                                                                                    out.println("<tr>");
                                                                                                    out.println("<td>" + listaHeladosPaila.get(j).getId() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosPaila.get(j).getName() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosPaila.get(j).getDescription() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosPaila.get(j).getPrice() + "</td>");
                                                                                                  //  out.println("<td>" + listaHeladosPaila.get(j).getCategory() + "</td>");
                                                                                                    out.println("<tr>");
                                                                                                }
                                                                                            %>

                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="card">
                                                                            <div class="card-header">
                                                                                <h5>SUNDAE</h5>

                                                                            </div>
                                                                            <div class="card-block table-border-style">
                                                                                <div class="table-responsive">
                                                                                    <table class="table">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>ID</th>
                                                                                                <th>Helado</th>
                                                                                                <th>Descripcion</th>
                                                                                                <th>Precio</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <%
                                                                                                LinkedList<Helado> listaHeladosSundae = crudHelados.listarHeladosBuilder(1);
                                                                                                for (int i = 0; i < listaHeladosSundae.size(); i++) {

                                                                                                    out.println("<tr>");
                                                                                                    out.println("<td>" + listaHeladosSundae.get(i).getId() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosSundae.get(i).getName() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosSundae.get(i).getDescription() + "</td>");
                                                                                                    out.println("<td>" + listaHeladosSundae.get(i).getPrice() + "</td>");
                                                                                                    //out.println("<td>" + listaHeladosSundae.get(i).getCategory() + "</td>");
                                                                                                    out.println("<tr>");
                                                                                                }
                                                                                            %>

                                                                                        </tbody>
                                                                                    </table>

                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                    </th>

                                                                </tr>

                                                            </thead>


                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="card">

                                                <div class="card-block table-border-style">
                                                    <div class="table-responsive">
                                                        <div class="card-header">
                                                                                <h5> FACADE </h5>

                                                                            </div>
                                                        <table class="table">
                                                            <thead>
                                                                <tr>
                                                                    <th>ID</th>
                                                                    <th>Helado</th>
                                                                    <th>Descripcion</th>
                                                                    <th>Precio</th>
                                                                    <th>Categoria</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <%
                                                                    FacadeHelados facadeHelados = new FacadeHelados();
                                                                    LinkedList<HeladosFacade> listaHeladosFacade = facadeHelados.generarHeladosFacade();

                                                                    for (int i = 0; i < listaHeladosFacade.size(); i++) {

                                                                        out.println("<tr>");
                                                                        out.println("<td>" + listaHeladosFacade.get(i).getId() + "</td>");
                                                                        out.println("<td>" + listaHeladosFacade.get(i).getNameHelado() + "</td>");
                                                                        out.println("<td>" + listaHeladosFacade.get(i).getDescriptionHelado() + "</td>");
                                                                        out.println("<td>" + listaHeladosFacade.get(i).getPriceHelado() + "</td>");
                                                                        out.println("<td>" + listaHeladosFacade.get(i).getCategoryHelado() + "</td>");
                                                                        out.println("<tr>");
                                                                    }
                                                                %>

                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- Page-body end -->
                                    </div>
                                </div>
                                <!-- Main-body end -->

                                <div id="styleSelector">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Required Jquery -->
        <script type="text/javascript" src="assets/js/jquery/jquery.min.js "></script>
        <script type="text/javascript" src="assets/js/jquery-ui/jquery-ui.min.js "></script>
        <script type="text/javascript" src="assets/js/popper.js/popper.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap/js/bootstrap.min.js "></script>
        <!-- waves js -->
        <script src="assets/pages/waves/js/waves.min.js"></script>
        <!-- jquery slimscroll js -->
        <script type="text/javascript" src="assets/js/jquery-slimscroll/jquery.slimscroll.js"></script>
        <!-- Custom js -->
        <script src="assets/js/pcoded.min.js"></script>
        <script src="assets/js/vertical/vertical-layout.min.js"></script>
        <script src="assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script type="text/javascript" src="assets/js/script.js"></script>
    </body>

</html>
