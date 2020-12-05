package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/saySomeThing")
    public String sayHelloWorld(){
        return "Hello Anna";
    }

}
