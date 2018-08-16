package springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.property.HomeProperties;

@RestController
public class HelloWorldController{

    @Autowired
    private HomeProperties homeProperties;

    @RequestMapping("/")
    public String sayHello(){
        return "你好，隔壁老黄" + homeProperties.toString();
    }

}
