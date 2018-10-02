/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;

/**
 *
 * @author Shahin_Rashidbayli
 */
@ManagedBean
@SessionScoped
public class MelumatGonder {

    String ad, soyad;

    public MelumatGonder() {
    }

    public MelumatGonder(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "MelumatGonder{" + "ad=" + ad + ", soyad=" + soyad + '}';
    }

    public String DBGonder() {

        Connection connect = null;
        PreparedStatement pst = null;
        int i = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinama", "root", "AA12345aa!");
            pst = connect.prepareStatement("insert into insan(ad,soyad) values (?,?)");
            pst.setString(1, ad);
            pst.setString(2, soyad);
            i = pst.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                connect.close();
                pst.close();
            } catch (Exception e) {
                System.err.println("Xeta" + e);
            }
        }
        if(i>0){
            System.out.println("Success");
            return "success?faces-redirect=true";
        }else{
            System.out.println("Failed");
            return "fail?faces-redirect=true";
        }

    }
}
