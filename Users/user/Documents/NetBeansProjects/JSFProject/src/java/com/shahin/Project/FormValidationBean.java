/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahin.Project;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Shahin_Rashidbayli
 */
@ManagedBean
@RequestScoped
public class FormValidationBean implements Filter{

    private String isim;
    private String soyisim;
    private String il;
    private String eposta;
    private String linkedin;
    private String cinsiyet;
    private String adres;
    private String parola;
    private static Map<String, Object> cinsiyetler = new LinkedHashMap<String, Object>();
    private static Map<String, Object> iller = new LinkedHashMap<String, Object>();
    private static Map<String, Object> hesapvarmi = new LinkedHashMap<String, Object>();

    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getLinkedIn() {
        return linkedin;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedin = linkedIn;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    static {
        cinsiyetler.put("Erkek", "Erkek");
        cinsiyetler.put("Bayan", " Bayan");
    }

    public Map<String, Object> cinsiyetleridondur(){
        return cinsiyetler;
    }
    
    public static Map<String, Object> getCinsiyetler() {
        return cinsiyetler;
    }
    
    public static void setCinsiyetler(Map<String, Object> cinsiyetler) {
        FormValidationBean.cinsiyetler = cinsiyetler;
    }

    static {
        iller.put("Istanbul", "Istanbul");
        iller.put("Ankara", "Ankara");
        iller.put("Balikesir", "Balikesir");
        iller.put("Bursa", "Bursa");
        iller.put("Erzurum", "Erzurum");

    }

    public Map<String, Object> iller(){
        return iller;
    }
    
    public static Map<String, Object> getIller() {
        return iller;
    }

    
    public static void setIller(Map<String, Object> iller) {
        FormValidationBean.iller = iller;
    }
 
    static {
        hesapvarmi.put("Evet", "Evet");
        hesapvarmi.put("Hayir", "Hayir");
    }
    public Map<String, Object> hesapvarmidondur() {
        return hesapvarmi;
    }

    public static Map<String, Object> getHesapvarmi() {
        return hesapvarmi;
    }
    
    public static void setHesapvarmi(Map<String, Object> hesapvarmi) {
        FormValidationBean.hesapvarmi = hesapvarmi;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
