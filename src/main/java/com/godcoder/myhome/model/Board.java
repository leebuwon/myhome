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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ATUO는 3가지 중 알아서 선택해줌
    private Long id;
    @NotNull
    @Size(min=2, max=30)
    private String title;
    private String content;

}
