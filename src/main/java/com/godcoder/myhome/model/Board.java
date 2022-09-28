package com.godcoder.myhome.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data       // lombok을 이용하여 getter / setter 없이 사용가능
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY는 자동적으로 auto increase 시켜줌
    private Long id;
    @NotNull
    @Size(min=2, max=30)
    private String title;
    private String content;

}
