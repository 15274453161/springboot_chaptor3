package com.qgh.chaptor3.pojo;

import com.qgh.chaptor3.pojo.definition.Animal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author 秦光泓
 * @title:
 * @projectName chaptor3
 * @description: TODO
 * @date 2020/2/2717:19
 */
@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("抓老鼠");
    }
}
