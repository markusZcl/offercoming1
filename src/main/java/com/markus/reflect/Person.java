package com.markus.reflect;

/**
 * Author:markusZhang
 * degree of proficiency:
 * Date:Create in 2020/4/18 22:04
 */
public class Person {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;

    public Person() {
        this.id = -1;
        this.name = "默认构造器";
        this.gender = "太监";
        this.age = -1;
    }

    public Person(Integer id, String name, String gender, Integer age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
