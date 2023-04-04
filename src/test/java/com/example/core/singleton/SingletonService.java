package com.example.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // 객체를 한번만 만들어서 전체 공유

    public static SingletonService getInstance(){ // 객체를 참조할 수 있는 유일한 방법
        return instance;
    }

    private SingletonService(){ // 다른 클래스에서 객체를 생성하지 못함 -> 유일한 객체 완성

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
