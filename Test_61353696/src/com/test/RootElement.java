package com.test;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rootelem")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class RootElement  implements Serializable {
	public RootElement() {
		// TODO Auto-generated constructor stub
	}
	public RootElement(Data data) {
		this.data = data;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4952878672289731408L;
	Data data;

	public Data getData() {
		return data;
	}

	@XmlElement
	public void setData(Data data) {
		this.data = data;
	}
	
}
