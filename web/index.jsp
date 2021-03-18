<%@page import="java.util.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import = "pqServlets.Conexion"%>
<%@page import = "java.sql.*"%>
<%@page import = "javax.swing.JOptionPane"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css" type="text/css"><link>
        <title>Pagina Principal</title>
    </head>
    <body>
    <header>
        <h1 class="titulo">Pagina Principal</h1>
        <ul>
            <li><a href="index.jsp">Pagina Principal</a></li>
            <li><a href="ServletNombre">Personajes</a></li>
            <li><a href="ServletDatos">Personajes Filtrados</a></li>
        </ul>
    </header>
    
    <section>
        
    </section>
    
    
    <footer>
        <div id="pie">2021 &copy; PracticaJSP01</div>
    </footer>
    </body>
</html>
