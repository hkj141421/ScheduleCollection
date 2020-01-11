package com.knight.Util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by forget on 2019/12/29.
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.applicationContext = applicationContext;
    }

    public Object getBean(String name) {
        return SpringUtil.applicationContext.getBean(name);
    }


    //通过class获取Bean.
    public  <T> T getBean(Class<T> clazz) {
        return SpringUtil.applicationContext.getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public  <T> T getBean(String name, Class<T> clazz) {
        return SpringUtil.applicationContext.getBean(name, clazz);
    }
}