package com.example.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        /**잘못된 코드**/
//        // ThreadA: A사용자 10000원 주문
//        statefulService1.order("userA", 10000);
//        // ThreadB: B사용자 20000원 주문
//        statefulService2.order("userB", 20000);
//
//        // ThreadA: A사용자 주문 금액 조회
//        int price = statefulService1.getPrice();
//        System.out.println("price = " + price);
//
//        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);

        /**올바른 코드**/
        // ThreadA: A사용자 10000원 주문
        int userAPrice = statefulService1.order("userA", 10000);
        // ThreadB: B사용자 20000원 주문
        int userBPrice = statefulService2.order("userB", 20000);
        System.out.println("userAPrice = " + userAPrice);
        System.out.println("userBPrice = " + userBPrice);
    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }

}