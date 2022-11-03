package th.co.serviceauthen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthenController {
    @GetMapping("/")
    public String index(){
        return "<h1>This Service Authen</h1>";
    }
}
