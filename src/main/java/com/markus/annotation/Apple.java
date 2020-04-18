package com.markus.annotation;

/**
 * Author:markusZhang
 * degree of proficiency:
 * Date:Create in 2020/4/18 22:54
 */
public class Apple {
    @FruitProvider(id = 1,name = "陕西红富士集团",address = "陕西省西安市")
    private String appleProvider;
    public void setAppleProvider(String appleProvider){
        this.appleProvider = appleProvider;
    }
    public String getAppleProvider(){
        return appleProvider;
    }

//    public static void main(String[] args) {
//        Apple apple = new Apple();
//        System.out.println(apple.getAppleProvider());
//    }
}
