package com.ykq.qualifier;

/**
 * @ClassName User
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/11
 * @Version v1.0.0
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
