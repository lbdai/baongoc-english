package com.baongoc.english.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Vocabulary")
public class Vocabulary extends BasicEntity {
    @Column(name= "vocabulary")
    private String vocabulary;
    @Column(name= "meaning")
    private String meaning;
    @Column(name= "description")
    private String description;
    @Column(name= "imageLink")
    private String imageLink;

}
