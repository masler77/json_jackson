package json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class deserializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassLoader classloader = deserializer.class.getClassLoader();
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			UdemyJson udemyJson = mapper.readValue(new File(classloader.getResource("udemyJson").getFile()), UdemyJson.class);
		//	UdemyJson udemyJson = mapper.readValue(new File(classloader.getResource("/json/src/main/resources/udemyJson").getFile()),UdemyJson.class);
			
			System.out.println(udemyJson.getId());
			System.out.println(udemyJson.getKey1());
			System.out.println(udemyJson.getKey2());
			System.out.println(udemyJson.getDate());
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
