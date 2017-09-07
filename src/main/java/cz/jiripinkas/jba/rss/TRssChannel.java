package cz.jiripinkas.jba.rss;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TRssChannel {

    private String title;

    private String link;

    private String description;

    private String lastBuildDate;

    @XmlElement(name = "item")
    List<TRssItem> items;

}
