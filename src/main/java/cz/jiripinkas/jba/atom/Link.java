package cz.jiripinkas.jba.atom;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Link {

    @XmlAttribute
    private String rel;

    @XmlAttribute
    private String href;

}
