/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invs6f;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class dbKoneksi {
    Connection konek;
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost/dnashop";
    
    public void config(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            konek = DriverManager.getConnection(url, user, pass);
            System.out.println("Database terhubung... ");
        }catch(Exception e){
            System.out.println("Database tidak terhubung... " + e.getMessage());
        }
    }

    public String namabrg(String kode){
        String nm = "";
        try{
            config();
            String sqlMBarang = "Select * from barang where kodebarang = '" + kode + "'";
            Statement stMBarang = konek.createStatement();
            ResultSet rsMBarang = stMBarang.executeQuery(sqlMBarang);
            while(rsMBarang.next()){
                nm =rsMBarang.getString("namabarang");
            }
            stMBarang.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data tidak ada " +e.getMessage());
        }
        return nm;
    }

    public String isiNMBarang(String kdbrg){
       String nmbrg = "";
       try{
           config();
           String sqlMBarang = "Select * from barang where kodebarang = '" + kdbrg + "'";
           Statement stMBarang = konek.createStatement();
           ResultSet rsMBarang = stMBarang.executeQuery(sqlMBarang);
           while(rsMBarang.next()){
               nmbrg = rsMBarang.getString("namabarang");
           }
           stMBarang.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Data tidak ada " +e.getMessage());
       }
       return nmbrg;
    } 

    public String isiSatuan(String kdbrg){
       String satuan = "";
       try{
           config();
           String sqlMBarang = "Select * from barang where kodebarang = '" + kdbrg + "'";
           Statement stMBarang = konek.createStatement();
           ResultSet rsMBarang = stMBarang.executeQuery(sqlMBarang);
           while(rsMBarang.next()){
               satuan = rsMBarang.getString("satuan");
           }
           stMBarang.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Data tidak ada " +e.getMessage());
       }
       return satuan;
    }    
}
