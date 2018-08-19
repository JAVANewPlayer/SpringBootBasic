package springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * User: huangchengdu
 * Date: 2018-08-17
 * Time: 上午8:45
 */

@SpringBootApplication
@MapperScan("springboot.dao")
public class Application {

    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }
}
