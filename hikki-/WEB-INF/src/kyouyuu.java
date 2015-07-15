import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class kyouyuu extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException, ServletException
{
response.setContentType("text/html; charset=Windows-31J");
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>oracle</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>オラクルマスター</h1>");
out.println("</body>");
out.println("</html>");
}
}