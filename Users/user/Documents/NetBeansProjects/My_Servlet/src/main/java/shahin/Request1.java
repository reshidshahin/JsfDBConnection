package shahin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Request1", urlPatterns = {"/request"})
public class Request1 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.println("Ad: "+request.getParameter("ad") + " ");
        pw.println("Soyad: "+request.getParameter("soyad") + " ");
        pw.println("Status: "+request.getParameter("mstatus"));
        
        String[] dizi = request.getParameterValues("language");
        for (int i = 0; i < dizi.length; i++) {
           pw.println("Bildiyi proqramlasdirma dillleri: " + dizi[i]);
        }
    }
}
