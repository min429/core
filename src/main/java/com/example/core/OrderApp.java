package com.example.core;

import com.example.core.member.Grade;
import com.example.core.member.Member;
import com.example.core.member.MemberService;
import com.example.core.member.MemberServiceImpl;
import com.example.core.order.Order;
import com.example.core.order.OrderService;
import com.example.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // 스프링 컨테이너 // @Configuration이 붙은 AppConfig를 설정 정보로 사용 // AppConfig의 @Bean들 관리

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class); // Bean가져옴 // "메서드 이름", 타입
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class); // Bean가져옴 // "메서드 이름", 타입

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
