package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.property.HomeProperties;
import springboot.property.UserProperties;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private HomeProperties homeProperties;
    @Autowired
    private UserProperties userProperties;

    public static void main(String[] args){
        //程序启动入口
        //启动嵌入式的 Tomcat 并初始化 Spring 环境以及各 Spring组件
        SpringApplication.run(Application.class, args);
    }

    @java.lang.Override
    public void run(java.lang.String... args) throws Exception {
        System.out.println("\n" + homeProperties.toString());
        System.out.println();
        System.out.println("\n" + userProperties.toString());
    }
}
