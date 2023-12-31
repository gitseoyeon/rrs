package com.seoyeon.review.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name = "test")
@Entity
public class TestEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;

    public TestEntity(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    // 엔티티는 빈 생성자도 있어야함
    public TestEntity(){
    }

    public void changeNameAndAge(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}
