package cz.jiripinkas.jba.entity;

import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "news_item")
@Data
public class NewsItem {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 500)
    private String title;

    @Column(name = "short_description", length = 500)
    private String shortDescription;

    @Column(length = Integer.MAX_VALUE)
    @Lob
    private String description;

    @Column(name = "published_date")
    private Date publishedDate;

    @Column(name = "short_name", length = 500, unique = true)
    private String shortName;

    public String getFormattedPuslihedDate() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(publishedDate);
    }

}
