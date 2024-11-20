package com.lb.spring.ioc.config;

import com.lb.spring.ioc.bean.Dog;
import org.springframework.context.annotation.Bean;

/**
 * 第三方组件想要导入容器中：没办法快速标注分层注解
 * 1、@Bean：自己new，注册给容器
 * 2、@Component 等分层注解
 * 3、@Import：快速导入组件
 */
//@Configuration
public class DogConfig {


//    @Lazy //单例模式，可以继续调整为懒加载
//    @ConditionalOnMissingBean(value = {UserService.class})
//    @ConditionalOnMissingBean(name="joseph",value = {Person.class})
//    @ConditionalOnBean(name = "bill")
//    @ConditionalOnResource(resources="classpath:haha.abc")

    // Spring在底层会有多组件名字判定bug。
//    @ConditionalOnMissingBean(name="joseph")
    @Bean
    public Dog dog01(){
        Dog dog = new Dog();
        dog.setName("大狗");

        return dog;
    }

    @Bean
    public Dog dog02(){
        Dog dog = new Dog();
        dog.setName("2狗");

        return dog;
    }

}
