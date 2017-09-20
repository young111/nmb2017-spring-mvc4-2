package kr.hs.emirim.nmb2017.nmb2017.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/")
	   @ResponseBody
	   public String hello() {
	      return "안녕하세요, 스프링!";
	   }

}
