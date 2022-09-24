package com.godcoder.myhome.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data       // lombok을 이용하여 getter / setter 없이 사용가능
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ATUO는 3가지 중 알아서 선택해줌
    private Long id;
    private String title;
    private String content;

}
