package udemy.xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class XMLJAVXB {

	public static void main(String[] args) {

		XmlMapper mapper = new XmlMapper();
		
		mapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
		
		
		mapper.registerModule(new JaxbAnnotationModule());
		
		try {
			System.out.println(mapper.writeValueAsString(new XML()));
		try {
		XML xml = mapper.readValue("<xml attrebute=\"attrebute value\"><name>Magnus</name><name2>magnus kolla läget</name2><name3/><name4/><attribute2/></xml>", XML.class);
			
		System.out.println("attrebute: "+ xml.getAttribute1());
			System.out.println("prop1"+xml.getProperty1());
			System.out.println("prop2"+ xml.getProperty2());
			System.out.println("prop3"+ xml.getProperty3());
			System.out.println("prop4"+ xml.getProperty31());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
