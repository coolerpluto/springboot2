package com.fan.bean;

public class Person {
    private Integer id;
    private String name;
    private Dog dogPet;

    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public Dog getDogPet() {
        return dogPet;
    }

    public void setDogPet(Dog dogPet) {
        this.dogPet = dogPet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dogPet=" + dogPet +
                '}';
    }
}
