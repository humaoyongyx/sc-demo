package issac.study.scdemo.scweb.controller;

import issac.study.scdemo.scweb.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author humy6
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    HelloService helloService;

    @RequestMapping
    public String hi(){
        return helloService.sayHi();
    }
}
