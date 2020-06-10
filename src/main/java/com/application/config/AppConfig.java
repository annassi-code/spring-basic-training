package com.application.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages ="com.application.*")
@EnableAspectJAutoProxy
//@ImportResource("classpath:application-context.xml")
public class AppConfig {

 /*   @Bean
    public IInstrument guitar(){
        return new Guitar();
    }

    @Bean
    public IMusician guitarist(){
        return new Guitarist();
    }

    @Bean
    public IInstrument piano(){
        return new Piano();
    }

    @Bean
    public IMusician pianist(){
        return new Pianist();
    }
    @Bean
    public AspectInterceptor aspectInterceptor(){
        return new AspectInterceptor();
    }*/
}
