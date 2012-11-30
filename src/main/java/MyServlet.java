import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.concurrent.atomic.*;

public class MyServlet extends HttpServlet {
	AtomicLong counter=new AtomicLong(0);
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Hello Jason times "+counter.getAndIncrement());
	}
}
