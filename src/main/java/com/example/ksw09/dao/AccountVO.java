package com.example.ksw09.dao;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of="uid") // 이건 무엇?
@ToString
public class AccountVO {

//    @Id // 이건 왜 안 됨?

    private Long id;

    private String uid;
    private String upw;
}
