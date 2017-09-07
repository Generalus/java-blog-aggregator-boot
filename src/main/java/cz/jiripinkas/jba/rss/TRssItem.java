package cz.jiripinkas.jba.rss;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TRssItem {

    private String title;

    private String description;

    private String pubDate;

    private String link;

    @XmlElement(namespace = "http://rssnamespace.org/feedburner/ext/1.0")
    private String origLink;

    @XmlElement(namespace = "http://purl.org/rss/1.0/modules/content/")
    private String encoded;

}
