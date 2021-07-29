package study.test.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue
    @Column(name= "member_id")
    private Long id;

    private String username;

    private int age;

    public Member(Long id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}
