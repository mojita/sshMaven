package com.cn.test;

import com.cn.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/9/12.
 */
public class SpringTest {

    //spring测试成功
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person)context.getBean("person");
        person.setName("asdasd");
        System.out.println(person.getName());
    }
}
