package issac.study.scdemo.scservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScserviceApplication.class, args);
    }

}
