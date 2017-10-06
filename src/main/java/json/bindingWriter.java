package json;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class bindingWriter {

	public static void main(String[] args){
	
		
		ObjectMapper mapper = new ObjectMapper();
		
		stu stu = new stu();
		
		stu.setId(1234);
		stu.setName("Magnus");
		stu.setLastName("leray");
stu stu2 = new stu();
		
		stu2.setId(1);
		stu2.setName("Magnus2");
		stu2.setLastName("leray2");
		
	try {
		System.out.println(mapper.writeValueAsString(stu));
		
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stu));
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		Map<String, Object> mapJson = new LinkedHashMap<String, Object>();
		
		
		mapJson.put("key1", 1);
		mapJson.put("key2", 22);
		mapJson.put("key3", 333);
		mapJson.put("booleanTrue", true);
		mapJson.put("booleanFalse", false);
		mapJson.put("array", new String[]{"1","2","3"});
		mapJson.put("arratOfObjects", new stu[]{stu, stu2});
		
		
		mapJson.put("nestedObjekt", stu);
		mapJson.put("integer", 1);
		mapJson.put("valueNull", null);
		mapJson.put("list", Arrays.asList(1,2,3,4,5));
		mapJson.put("date", LocalDateTime.now().toString());
		
		try {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapJson));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src\\main\\resources\\jsonMap.json"), mapJson);
		} catch (JsonGenerationException e) {
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
