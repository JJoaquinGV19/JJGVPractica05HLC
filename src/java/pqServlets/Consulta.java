/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqServlets;

import static java.lang.System.out;
import java.sql.*;
import java.util.*;

/**
 *
 * @author joaquin
 */
public class Consulta {
    
    
    public static ArrayList<Personas> devuelveConsulta()
    {
        ArrayList<Personas> x = new ArrayList<Personas>();
        
        Conexion bd = new Conexion();

                try {

                    PreparedStatement stmt=bd.getC().prepareStatement("select * from personas");
                    ResultSet rs = stmt.executeQuery();

                    while(rs.next())
                    {
                        x.add(new Personas(rs.getInt("id"), rs.getString("nombre"), rs.getFloat("altura"), rs.getString("fecha_nacimiento"), rs.getString("nombre_imagen")));
                    }
                    rs.close();
                    stmt.close();
                    bd.getC().close();


                } catch (SQLException ex) {}
                return x;
    }
    
    public static String tipo(String x, String tipo)
    {
        String cadena="";
        
        if(tipo.equals("Nombre"))
        {
            cadena="select * from personas where nombre='"+x+"'";
        }
        
        if(tipo.equals("Altura"))
        {
            cadena="select * from personas where altura="+x;
        }
        
        if(tipo.equals("Nacimiento"))
        {
            cadena="select * from personas where fecha_nacimiento='"+x+"'";
        }
        
        return cadena;
    }
    
    public static ArrayList<Personas> devuelveConsultaFiltrada(String aux, String tipo)
    {
        ArrayList<Personas> x = new ArrayList<Personas>();
        
        Conexion bd = new Conexion();
                
                String sql=tipo(aux, tipo);

                try {

                    PreparedStatement stmt=bd.getC().prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();

                    while(rs.next())
                    {
                        x.add(new Personas(rs.getInt("id"), rs.getString("nombre"), rs.getFloat("altura"), rs.getString("fecha_nacimiento"), rs.getString("nombre_imagen")));
                    }
                    rs.close();
                    stmt.close();
                    bd.getC().close();


                } catch (SQLException ex) {}
                return x;
    }

}

