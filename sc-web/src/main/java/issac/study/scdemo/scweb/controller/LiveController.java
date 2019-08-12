package issac.study.scdemo.scweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author humy6
 */
@RestController
public class LiveController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/isLive")
    public String isLive(){
        return "sc_web : "+port;
    }
}
