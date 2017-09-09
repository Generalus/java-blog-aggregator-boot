package cz.jiripinkas.jba.dto;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class ItemDto {

    private int id;

    private boolean enabled;

    private String title;

    private String description;

    private String link;

    private Date savedDate;

    private BlogDto blog;

    private int clickCount;

    private int likeCount;

    private int dislikeCount;

    private int twitterRetweetCount;

    private int facebookShareCount;

    private int linkedinShareCount;

    private int displayLikeCount;

    public String getSavedDateString() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(savedDate);
    }

}
