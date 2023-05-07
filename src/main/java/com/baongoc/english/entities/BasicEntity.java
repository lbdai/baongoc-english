package com.baongoc.english.entities;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;


import java.sql.Date;

@Getter
@Setter
public class BasicEntity {
    @Column(name= "created_date")
    private Date createDate;
    @Column(name= "created_by")
    private String createBy;
    @Column(name= "modify_by")
    private String modifyBy;
    @Column(name= "modify_date")
    private Date modifyDate;
}
