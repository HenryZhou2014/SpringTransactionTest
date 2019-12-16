package henry.annotation.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("serviceA")
public class HellowServerA {
    @Value("${server.port}")
    String serverPost;
    public  void sayHello(){
        System.out.println("HellowServerA sayHello");
    }
    public  void getServerPost(){
        System.out.println(serverPost);
    }

}
