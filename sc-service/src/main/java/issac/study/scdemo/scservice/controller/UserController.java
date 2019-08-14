package issac.study.scdemo.scservice.controller;

import issac.study.scdemo.scservice.bean.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


/**
 * @author humy6
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String get(@PathVariable("id") Integer id) throws InterruptedException {
        Thread.sleep(1000);
          return "user"+id;
    }

    @PostMapping
    public boolean save(@RequestBody User user,  @PageableDefault(page = 0, size = 50, sort = {"typeId","orderIndex"}, direction =  Sort.Direction.ASC) Pageable pageable){
        System.out.println(user+" " +pageable);
        return true;
    }
}
