package jsp_servlet;

public class First_servlet extends HtpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);

}
