package com.qgh.chaptor3.pojo;

import com.qgh.chaptor3.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * @author 秦光泓
 * @title:
 * @projectName chaptor3
 * @description: TODO
 * @date 2020/2/2717:13
 */
@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("狗叫");
    }
}
