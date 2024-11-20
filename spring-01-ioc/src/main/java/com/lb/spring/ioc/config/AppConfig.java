package com.lb.spring.ioc.config;

import ch.qos.logback.core.CoreConstants;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({CoreConstants.class})
@Configuration
@ComponentScan(basePackages = "com.lb.spring") //组件批量扫描； 只扫利用Spring相关注解注册到容器中的组件
public class AppConfig {


}
