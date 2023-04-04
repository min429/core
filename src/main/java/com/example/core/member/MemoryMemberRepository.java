package com.example.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>(); // 여러곳에서 HashMap에 접근하면 동시성 이슈가 있으므로 실무에서는 ConcurrentHashMap을 사용해야함
    // static: 객체와 상관없는 전역(객체)

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
