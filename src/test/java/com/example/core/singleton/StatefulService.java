package com.example.core.singleton;

public class StatefulService {

    /**잘못된 코드**/
//    private int price; // 상태를 유지하는 공유필드

//    public void order(String name, int price){
//        System.out.println("name = " + name + " price" + price);
//        this.price = price; // 여기가 문제!
//    }

//    public int getPrice(){
//        return price;
//    }

    /**올바른 코드**/
    public int order(String name, int price){
        System.out.println("name = " + name + " price" + price);
//        this.price = price; // 여기가 문제!
        return price;
    }

}
