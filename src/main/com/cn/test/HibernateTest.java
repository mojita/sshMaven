package com.cn.test;

import com.cn.utils.HibernateUtil;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 16/9/12.
 */
public class HibernateTest extends HibernateUtil {

    //hibernate测试成功
    //struts2测试成功
    @Test
    public void test1(){
        Configuration configuration = new Configuration();
        configuration.configure();
    }
}
