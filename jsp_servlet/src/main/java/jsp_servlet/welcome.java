
package jsp_servlet;
import jakarta.servlet.http.HttpServlet;

public class welcome extends HtpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  this.getServletContext().getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req, resp);

}
