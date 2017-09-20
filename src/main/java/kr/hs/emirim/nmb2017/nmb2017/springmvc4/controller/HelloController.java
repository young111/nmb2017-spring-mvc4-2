package kr.hs.emirim.nmb2017.nmb2017.springmvc4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

@Autowired private Twitter twitter;

 @RequestMapping("/")
 public String hello(@RequestParam(defaultValue = "고양이")
 String search, Model model) {
  SearchResults searchResults = twitter.searchOperations().search(search);
  String text = searchResults.getTweets().get(0).getText(); 
  model.addAttribute("message", text);
  return "resultPage";
 }
}
