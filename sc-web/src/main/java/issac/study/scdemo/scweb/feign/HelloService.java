package issac.study.scdemo.scweb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sc-service")
public interface HelloService {
  @GetMapping("/hello")
   String sayHi();

    @GetMapping("/hello/{name}")
    String get(@PathVariable("name") String name);
}