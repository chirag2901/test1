import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet{	

	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
	
		System.out.println("Hello i am smit.\nCurrently i am pursuing Computer Engineering");
	}
}