package com.atguigu.springboot.bean;

/**
 * Description:
 * User: huangchengdu
 * Date: 2018-08-27
 * Time: 下午9:22
 */
public class Dog {

    private String name;
    private Integer age;


    @java.lang.Override
    public java.lang.String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
