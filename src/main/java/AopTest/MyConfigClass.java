package AopTest;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"AopTest.*"})
@PropertySource("classpath:rich.properties")
public class MyConfigClass {
    @Value("${myName}")
    private String myName;

    public void showVars(){
        System.out.println(myName);
    }
}
