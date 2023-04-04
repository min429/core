package com.example.core.discount;

import com.example.core.annotaion.MainDiscountPolicy;
import com.example.core.member.Grade;
import com.example.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // 빈 객체 중복 시 우선순위 부여
@MainDiscountPolicy // @Qualifier로 직접 만든 애노테이션
//@Qualifier("mainDiscountPolicy") // 추가 구분자
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }
        else {
            return 0;
        }
    }
}
