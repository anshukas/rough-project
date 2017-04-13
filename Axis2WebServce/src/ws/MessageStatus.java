package ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "messageStatus")
@XmlEnum
public enum MessageStatus {

    INFO,
    WARNING,
    ERROR;
    
    MessageStatus(){}

    public String value() {
        return name();
    }

    public static MessageStatus fromValue(String v) {
        return valueOf(v);
    }

}
