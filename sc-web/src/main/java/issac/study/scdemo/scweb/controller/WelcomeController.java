package issac.study.scdemo.scweb.controller;

import issac.study.scdemo.scweb.bean.Page;
import issac.study.scdemo.scweb.bean.User;
import issac.study.scdemo.scweb.feign.HelloService;
import issac.study.scdemo.scweb.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    UserService userService;

    @RequestMapping
    public String hi(){
        return helloService.sayHi();
    }

    @RequestMapping("/{name}")
    public String hi(@PathVariable("name") String name){
        return helloService.get(name);
    }

    @RequestMapping("/user/id")
    public String getUser(){
        return userService.get(1);
    }

    @RequestMapping("/user/save")
    public String save(){
        User user = new User();
        user.setId(1);
        user.setName("test");
        Page page = new Page();
        page.setPage(1);
        page.setSize(3);
        return userService.save(user,page)+"";
    }

}
