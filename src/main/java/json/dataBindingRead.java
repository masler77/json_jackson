package json;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class dataBindingRead {

	public static void main(String[] args){
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		
		String stu = "{\"id\" : 1234,\"name\" : \"Magnus\",\"lastName\" : \"leray\" }";

		ClassLoader classLoader = dataBindingRead.class.getClassLoader();
		
		try {
			Map<String, Object> mapJson =	mapper.readValue(new File(classLoader.getResource("jsonMap.json").getFile()), 
					
					new TypeReference<Map<String,Object>>() {
					}
					);
			System.out.println(mapJson);
			
			for (Map.Entry<String, Object> entery : mapJson.entrySet()){
				System.out.println(entery.getKey() + " value:" + entery.getValue());
				
				
			}
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
		
		
		
//		try {
//		stu stu2 = 	mapper.readValue(stu, stu.class);
//		
//		System.out.println("name: "+ stu2.getId());
//		System.out.println("nameLast: "+ stu2.getLastName());
//	} catch (JsonParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (JsonMappingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
	}
		
}
