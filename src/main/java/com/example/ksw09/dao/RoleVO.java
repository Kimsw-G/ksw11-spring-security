package com.example.ksw09.dao;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "rno")
@ToString
public class RoleVO {
    private Long rno;

    private String roleName;
}
