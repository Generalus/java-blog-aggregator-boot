package cz.jiripinkas.jba.entity;

import cz.jiripinkas.jba.annotation.UniqueBlog;
import cz.jiripinkas.jba.annotation.UniqueShortName;
import cz.jiripinkas.jba.util.MyUtil;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Blog {

    @Id
    @GeneratedValue
    private Integer id;

    @Lob
    @Column(length = Integer.MAX_VALUE, updatable = false)
    private byte[] icon;

    @UniqueBlog(message = "This blog already exists!")
    @Size(min = 1, message = "Invalid URL!")
    @URL(message = "Invalid URL!")
    @Column(length = 1000, unique = true)
    private String url;

    @Size(min = 1, message = "Name must be at least 1 character!")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.REMOVE)
    private List<Item> items;

    @UniqueShortName(message = "This short name already exists!")
    @NotNull
    @Size(min = 1, message = "Short name cannot be empty!")
    @Column(name = "short_name", unique = true)
    private String shortName;

    private String nick;

    @NotNull
    @Size(min = 1, message = "Homepage cannot be empty!")
    @URL(message = "Invalid URL!")
    @Column(name = "homepage")
    private String homepageUrl;

    @Column(name = "last_check_status", updatable = false)
    private Boolean lastCheckStatus;

    /**
     * Date when was some item added.
     */
    @Column(name = "last_indexed_date", updatable = false)
    private Date lastIndexedDate;

    @Lob
    @Column(name = "last_check_error_text", length = Integer.MAX_VALUE, updatable = false)
    private String lastCheckErrorText;

    @Column(name = "last_check_error_count", updatable = false)
    private Integer lastCheckErrorCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private Boolean aggregator;

    @Column(name = "min_reddit_ups")
    private Integer minRedditUps;

    @Column(updatable = false)
    private Integer popularity;

    private Boolean archived;

    public String getPublicName() {
        return MyUtil.getPublicName(nick, name, false);
    }

}
