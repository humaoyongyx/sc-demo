package issac.study.scdemo.scweb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sc-service")
public interface HelloService {
  @GetMapping("/hello")
   String sayHi();
}