package AopTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StringTest {

    public static void main (String[] args){

        SpringApplication springApplication = new SpringApplication();
        ApplicationContext applicationContext = springApplication.run(StringTest.class,args);

    }

}
