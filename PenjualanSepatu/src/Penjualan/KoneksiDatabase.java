package Penjualan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author wisnu
 */
public class KoneksiDatabase {
   private static Connection koneksi;
   public static Connection getkoneksi(){
       if(koneksi == null) {
       try{
           String url = new String();
           String user = new String();
           String password = new String();
           url = "jdbc:mysql://localhost:3306/user";
           user = "root";
           password = "";
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           koneksi = (Connection) DriverManager.getConnection(url,user,password);
           
       }catch (SQLException t) {
           System.out.println("Koneksi Gagal");
       }
       }
       return koneksi;
       }
   }
