package com.example.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // @Component가 붙은 것들을 자동으로 스프링 컨테이너에 등록해줌
//        basePackages = "com.example.core.member", // 탐색경로 지정
//        basePackageClasses = AutoAppConfig.class, // AutoAppConfig.class의 패키지 com.example.core를 탐색경로로 지정
        // 지정하지 않을 시 @ComponentScan이 붙은 설정 정보 클래스의 패키지를 탐색 경로로 지정 (관례)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)) // @Configuration 붙은 건 등록x
public class AutoAppConfig {

    
}
