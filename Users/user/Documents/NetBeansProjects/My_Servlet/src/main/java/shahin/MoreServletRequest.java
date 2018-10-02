package shahin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shahin_Rashidbayli
 */
@WebServlet(name = "MoreServletRequest", urlPatterns = {"/moreServletRequest"})
public class MoreServletRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.write("<html><body>");
        String serverName = request.getServerName();
        String hostHeaderInfo = request.getHeader("host");
        int serverPort = request.getServerPort();
        int localPort = request.getLocalPort();
        int remotePort = request.getRemotePort();
        String method = request.getMethod();
        String contextPath = request.getContextPath();

        pw.write("<b>ServerName</b> proyektin ustunde islediyi serverin bilgisi, serverin adi: " + serverName + "<br/>");
        pw.write("<b>Serverport</b> elediyimiz isteyin serverde hansi port ile qarsilandigidir: " + serverPort + "<br/>");
        pw.write("<b>GetHeader</b> bunun icinde ne desek onu bize gosterecek, misal biz host demisik: " + hostHeaderInfo + "<br/>");
        pw.write("<b>Localport</b> Isteyin, misal get-in tamamlandigi portdur: " + localPort + "<br/>");
        pw.write("<b>RemotePort</b> Web Browser hansi porta istekde bulunur: " + remotePort + "<br/>");
        pw.write("<b>Method</b> Istifade etdiyi metod: " + method + "<br/>");
        pw.write("<b>ContextPath</b> Projemizin adi: " + contextPath + "<br/>");
        pw.write("</body></html>");
        pw.close();
    }
}
