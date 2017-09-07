package cz.jiripinkas.jba.rss;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rss")
@Data
public class TRss {

    @XmlElement(name = "channel")
    List<TRssChannel> channels;

}
