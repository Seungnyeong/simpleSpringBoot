package com.nlp.starter.demo.entity;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;

    @Column(length = 20, nullable = true)
    private String name;

    @Column(length = 10, nullable = true)
    private String det;

    @Column(length = 80, nullable = true)
    private String addr;

    @Column(length = 20, nullable = true)
    private String tel;

    @Builder
    public Users(String name, String det, String tel, String addr){
        this.name = name;
        this.det = det;
        this.tel = tel;
        this.addr = addr;
    }
}
