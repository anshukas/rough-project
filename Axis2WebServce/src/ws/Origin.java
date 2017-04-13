package ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="Origin")
@XmlEnum
public enum Origin {
	Marketing,
	Other;
	
	Origin(){}
	
	public String value() {
        return name();
    }

    public static Origin fromValue(String v) {
        return valueOf(v);
    }
}
