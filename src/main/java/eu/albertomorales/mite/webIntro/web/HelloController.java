package eu.albertomorales.mite.webIntro.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value="/hello.do")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ModelAndView view = new ModelAndView("hello");
    	view.addObject("greeting", greetingGenerator.greet());
        return view;
    }

    @Autowired
	public void setGreetingGenerator(GreetingGenerator greetingGenerator) {
		this.greetingGenerator = greetingGenerator;
	}

    GreetingGenerator greetingGenerator;

}