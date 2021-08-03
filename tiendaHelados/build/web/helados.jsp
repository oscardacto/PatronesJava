<%-- 
    Document   : helados
    Created on : 9/11/2020, 11:26:50 PM
    Author     : Oscar Dacto
--%>

<%@page import="java.util.Iterator"%>
<%@page import="pojos.Category"%>
<%@page import="patroniterator.IteratorListaCategorias"%>
<%@page import="cruds.CRUDCategorias"%>
<%@page import="cruds.CRUDCategorias"%>
<%@page import="java.util.LinkedList"%>
<%@page import="pojos.Helado"%>
<%@page import="cruds.CRUDHelados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
                            <a href="helados.html">
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
                                            <span class="pcoded-mtext">CRUD Helados</span>
                                            <span class="pcoded-mcaret"></span>
                                        </a>
                                    </li>
                                </ul>
                                <div class="pcoded-navigation-label">Categorias</div>
                                <ul class="pcoded-item pcoded-left-item">
                                    <li class="active">
                                        <a href="listaCategorias.jsp" class="waves-effect waves-dark">
                                            <span class="pcoded-micon"><i class="ti-receipt"></i><b>B</b></span>
                                            <span class="pcoded-mtext">Tipo de Helado</span>
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
                                            <!-- Basic table card start -->
                                            <div class="card">
                                                <div class="card-header">
                                                    <h5>Helados</h5>

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
                                                                    <th>Categoria</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <%
                                                                    CRUDHelados crudHelados = new CRUDHelados();
                                                                    LinkedList<Helado> lista = crudHelados.listarHelados();
                                                                    for (int i = 0; i < lista.size(); i++) {
                                                                        Helado helado = lista.get(i);
                                                                        out.println("<tr>");
                                                                        out.println("<td>" + helado.getId() + "</td>");
                                                                        out.println("<td>" + helado.getName() + "</td>");
                                                                        out.println("<td>" + helado.getDescription() + "</td>");
                                                                        out.println("<td>" + helado.getPrice() + "</td>");
                                                                        out.println("<td>" + helado.getCategory() + "</td>");
                                                                        out.println("<tr>");
                                                                    }
                                                                %>
                                                            </tbody>

                                                        </table>

                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <!-- Basic Form Inputs card start -->
                                                    <div class="card">
                                                        <div class="card-header">
                                                            <h5>CRUD</h5>
                                                        </div>
                                                        <div class="card-block">
                                                            <form name="formulariohelados" action="ControladorHelados" method="get">
                                                                <div class="form-group row">
                                                                    <label class="col-sm-2 col-form-label">Codigo </label>     <input type="text" name="id">                                                            
                                                                </div>
                                                                <div class="form-group row">
                                                                    <label class="col-sm-2 col-form-label">Nombre </label>     <input type="text" name="name">                                                           
                                                                </div>
                                                                <div class="form-group row">
                                                                    <label class="col-sm-2 col-form-label">Descripcion </label>     <input type="text" name="description">                                                            
                                                                </div>
                                                                <div class="form-group row">
                                                                    <label class="col-sm-2 col-form-label">Precio </label>     <input type="text" name="price" value="0">                                                              
                                                                </div>

                                                                <div class="form-group row">
                                                                    <label class="col-sm-2 col-form-label">Seleccionar Categoria</label>

                                                                    <select name="category" class="form-control">
                                                                        <%
                                                                            CRUDCategorias crudCategorias = new CRUDCategorias();
                                                                            IteratorListaCategorias listaCategorias = new IteratorListaCategorias();
                                                                            LinkedList<Category> listaCat = crudCategorias.listarCategorias();
                                                                            for (int x = 0; x < listaCat.size(); x++) {
                                                                                listaCategorias.add(listaCat.get(x).getId());
                                                                            }
                                                                            Iterator<Category> iteratorCategorias = listaCategorias.iterator();
                                                                            while (iteratorCategorias.hasNext()) {
                                                                                Category categoria = (Category) iteratorCategorias.next();
                                                                                out.println("<option value = \"" + categoria.getId() + "\">"
                                                                                        + categoria.getName() + "</option>");
                                                                            }
                                                                        %>
                                                                    </select>

                                                                </div>

                                                                <button type="submit" name="insertarhelado" class="btn btn-success waves-effect waves-light"> GUARDAR HELADO </button>
                                                                <button type="submit" name="modificarhelado" class="btn btn-success waves-effect waves-light"> ACTUALIZAR HELADO </button>
                                                                <button type="submit" name="borrarhelado" class="btn btn-success waves-effect waves-light"> BORRAR HELADO </button>

                                                            </form>
                                                        </div>
                                                    </div>
                                                    <!-- Basic Form Inputs card end -->
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
