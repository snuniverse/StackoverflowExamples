package com.test;
import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestXML {

	public static void main(String[] args) {
		try {

			File file = new File("D:\\PROJECTS\\StackOverflow\\Test\\src\\XMLData.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(RootElement.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			RootElement rootEl = (RootElement) jaxbUnmarshaller.unmarshal(file);
			
			JAXBContext jaxbContextData = JAXBContext.newInstance(Data.class);
			Marshaller jaxbMarshaller = jaxbContextData.createMarshaller();

			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			StringWriter out=new StringWriter();
			jaxbMarshaller.marshal(rootEl.getData(), out);
			System.out.println(out);

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

	}

}
