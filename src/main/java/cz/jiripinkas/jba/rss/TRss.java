package cz.jiripinkas.jba.rss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rss")
public class TRss {

    @XmlElement(name = "channel")
    List<TRssChannel> channels;

    public List<TRssChannel> getChannels() {
        return channels;
    }

    public void setChannels(List<TRssChannel> channels) {
        this.channels = channels;
    }
}
