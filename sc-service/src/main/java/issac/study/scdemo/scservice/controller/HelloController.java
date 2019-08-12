package issac.study.scdemo.scservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author humy6
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String sayHi(){
        return "hello world!";
    }
}
