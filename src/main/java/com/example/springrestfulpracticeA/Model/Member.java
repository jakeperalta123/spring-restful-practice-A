package com.example.springrestfulpracticeA.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
public class Member {
    private int Id;
    private String name;

    public Member(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }
}
