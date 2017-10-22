package com.guoxiaoxing.kotlin.demo._01_expression;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/19 下午1:47
 */
public class PersonInJava {

    private String name;
    private int age;
    private String city;

    private PersonInJava(Builder builder) {
        setName(builder.name);
        setAge(builder.age);
        setCity(builder.city);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public static final class Builder {
        private String name;
        private int age;
        private String city;

        private Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public PersonInJava build() {
            return new PersonInJava(this);
        }
    }
}
