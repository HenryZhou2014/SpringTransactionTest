package henry.annotation.demo.config;

import henry.annotation.demo.service.ServerB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("serviceB")
    public ServerB serverb(){
        return  new ServerB();
    }
}
