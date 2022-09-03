package jsp_servlet;
import jakarta.servlet.http.HttpServlet;

public class First_servlet extends HtpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String message = "See you !";
	  res.setAttribute("varibale",message);
	  this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);

}
