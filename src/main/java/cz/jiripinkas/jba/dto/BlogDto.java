package cz.jiripinkas.jba.dto;

import cz.jiripinkas.jba.util.MyUtil;
import lombok.Data;

@Data
public class BlogDto {

    private String name;

    private String nick;

    private String shortName;

    private int id;

    private CategoryDto category;

    public String getPublicName() {
        return MyUtil.getPublicName(nick, name, true);
    }

}
