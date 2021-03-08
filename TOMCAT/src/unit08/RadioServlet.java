package unit08;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RadioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String gender = request.getParameter("gender");
        String chk_mail = request.getParameter("chk_mail");
        String content = request.getParameter("content");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.println("당신이 입력한 정보입니다.<br>");
        out.println("성별 : ");
        out.println(gender);
        out.println("<br> 메일 수신 정보 : ");
        out.println(chk_mail);
        out.println("<br> 자기 소개 : ");
        out.println(content);
        out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
        out.print("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}