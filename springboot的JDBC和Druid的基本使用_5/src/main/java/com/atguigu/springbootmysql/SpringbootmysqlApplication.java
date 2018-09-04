package com.atguigu.springbootmysql;

import org.apache.tomcat.jdbc.pool.DataSource;
//import com.mysql.jdbc.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.*;
import java.sql.SQLException;

@SpringBootApplication
public class SpringbootmysqlApplication {


    public static void main(String[] args) throws SQLException {
        SpringApplication.run(SpringbootmysqlApplication.class, args);


    }
}
