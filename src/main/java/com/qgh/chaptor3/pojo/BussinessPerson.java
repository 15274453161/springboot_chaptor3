package com.qgh.chaptor3.pojo;

import com.qgh.chaptor3.pojo.definition.Animal;
import com.qgh.chaptor3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author 秦光泓
 * @title:
 * @projectName chaptor3
 * @description: TODO
 * @date 2020/2/2717:12
 */
@Component
public class BussinessPerson implements Person {
    @Autowired
    //private  Animal animal;
    @Qualifier("dog")
    private  Animal dog;
    @Override
    public void service() {
        dog.use();
    }

   /* @Override
    public void setAnimal(Animal animal) {
       this.animal=animal;
    }*/
}
