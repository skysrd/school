package Skysrd.school.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Subject {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Builder
    public Subject(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Subject() {

    }
}
