package cz.jiripinkas.jba.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Column(name = "short_name")
    private String shortName;

    @OneToMany(mappedBy = "category")
    private List<Blog> blogs;

    @Transient
    private int blogCount;


}
