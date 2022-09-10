
package jsp_servlet;
import jakarta.servlet.http.HttpServlet;

public class welcome extends HtpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String []personnes = ["youens","james","muhammed"];
	  req.setAtttribute("personnes",personnes);
	  this.getServletContext().getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req, resp);

}
