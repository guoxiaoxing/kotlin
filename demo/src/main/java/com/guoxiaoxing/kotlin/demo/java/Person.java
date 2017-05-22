package com.guoxiaoxing.kotlin.demo.java;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/22 下午5:48
 */
public abstract class Person {

    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(String message){
        System.out.print(message);
    }
}
