package springbootdemo.spring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hello {

    
    @GetMapping("/home")
    public String home() {
        return "Hello Meow";
    }
    @GetMapping("/pen")
    public String pen() {
        return "Welcome to Home";
    }
}
    

