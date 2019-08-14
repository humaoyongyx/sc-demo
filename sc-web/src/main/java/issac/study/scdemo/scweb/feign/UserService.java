package issac.study.scdemo.scweb.feign;

import issac.study.scdemo.scweb.bean.Page;
import issac.study.scdemo.scweb.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "sc-service/user")
public interface UserService {

    @GetMapping("/{id}")
    String get(@PathVariable("id") Integer id);

    @PostMapping
     Boolean save(User user, @SpringQueryMap Page page);
}