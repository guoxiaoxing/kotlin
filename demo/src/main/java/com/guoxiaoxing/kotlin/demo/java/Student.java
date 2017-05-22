package com.guoxiaoxing.kotlin.demo.java;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/22 下午6:00
 */
public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void say(String message) {
        super.say(message);
    }
}
