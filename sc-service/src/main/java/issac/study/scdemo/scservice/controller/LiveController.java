package issac.study.scdemo.scservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author humy6
 * @Date: 2019/8/9 13:26
 */
@RestController
public class LiveController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/isLive")
    public String isLive(){
        return "sc_service : "+port;
    }
}
