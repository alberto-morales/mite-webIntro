package eu.albertomorales.mite.webIntro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingGeneratorImpl implements GreetingGenerator {

    @RequestMapping(value="/greetings.do")
	public String greet() {
		return "Hello, guy";
	}
}
