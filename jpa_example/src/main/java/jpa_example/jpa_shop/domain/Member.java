package jpa_example.jpa_shop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIPCODE")
    private String zipcode;

    /** 양방향 관계 맞출려면
     * @OneToMany(mappedBy = "member")
     * private List<Order> orders = new ArrayList<>();
     */

}
