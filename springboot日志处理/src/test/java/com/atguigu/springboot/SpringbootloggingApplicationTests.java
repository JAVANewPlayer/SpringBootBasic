package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootloggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        //日志级别
        //日志级别由低到高 trace<debug<info<warn<error
        //可以调整日志输出的级别：日志只会在这个级别和以后的高级别生效

        logger.trace("这是trac日志。。。。");
        logger.debug("这是debug日志。。。");
        logger.info("这是info日志。。。");
        logger.warn("这是warn日志。。。。");
        logger.error("这是error日志。。。");
    }

}
