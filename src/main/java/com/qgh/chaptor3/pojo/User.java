package com.qgh.chaptor3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 秦光泓
 * @title:
 * @projectName chaptor3
 * @description: TODO
 * @date 2020/2/2716:45
 */
@Component
public class User {
    @Value("xiachengyang")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
