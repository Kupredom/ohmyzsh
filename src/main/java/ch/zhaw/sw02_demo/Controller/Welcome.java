package ch.zhaw.sw02_demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Welcome {
 @GetMapping("/hello")
 public String helloWorld(@RequestParam String name) {
 return "Hello " + name + "\n";
 }
} 
