/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.view;

/**
 *
 * @author lndra
 */
import piiiutscuaca.view.konek.*;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conek {

    static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String username, pasw;
    public conek (){}
    
    public conek (String user, String psw){
        setData (user, psw);
    }
    private void setData (String user, String psw) {
        username= user;
        pasw= psw;
    }
    Connection con;
    public Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/p3_java","root","manonjaya");
            //JOptionPane.showMessageDialog(null, "Koneksi ke Database BERHASIL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database GAGAL");       
    }
    return con;
   
    }

    //private void setData(String user, String psw) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}
