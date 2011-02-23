package mavenJettyPluginExample.foo;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SpringDemoController implements Controller
{
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        System.out.println("***** Returning \"hello.jsp\" with SpringDemoController *****");
        return new ModelAndView("hello.jsp");
    }
}