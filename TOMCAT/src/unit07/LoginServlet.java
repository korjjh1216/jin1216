package unit07;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.println("당신이 입력한 정보입니다.<br>");
        out.println("아이디 : ");
        out.println(id);
        out.println("<br> 비밀번호 : ");
        out.println(pwd);
        out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
        out.print("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}