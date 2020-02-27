package com.qgh.chaptor3.config;

import com.qgh.chaptor3.pojo.BussinessPerson;
import com.qgh.chaptor3.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 秦光泓
 * @title:
 * @projectName chaptor3
 * @description: TODO
 * @date 2020/2/2716:37
 */
@Configuration
@ComponentScan(basePackages = {"com.qgh.chaptor3.pojo"})
public class AppConfig {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        BussinessPerson person=context.getBean(BussinessPerson.class);
       person.service();
    }


}
