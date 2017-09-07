package cz.jiripinkas.jba.atom;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Entry {

    private String title;

    @XmlElement(name = "link")
    private List<Link> links;

    @XmlElement(namespace = "http://rssnamespace.org/feedburner/ext/1.0")
    private String origLink;

    private XMLGregorianCalendar updated;

    private XMLGregorianCalendar published;

    private String content;

    private String summary;

}
