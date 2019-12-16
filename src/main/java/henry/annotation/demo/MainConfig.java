package henry.annotation.demo;

import henry.annotation.demo.service.HellowServerA;
import henry.annotation.demo.service.ServerB;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "henry.annotation.demo.config") // (2)
@Import(henry.annotation.demo.service.HellowServerA.class) // (3)
@PropertySource(value={"classpath:application.properties"})
public class MainConfig {
    public static void main(String[] args) {

        // (5)
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ctx.getBean("serviceA", HellowServerA.class).sayHello();// (6)
        ctx.getBean("serviceA", HellowServerA.class).getServerPost();


        ctx.getBean("serviceB", ServerB.class).sayHello();// (6)
    }
}
