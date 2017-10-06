package json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class treeModelRead {
	public static void main(String[] args) {

		ClassLoader classLoader = treeModelRead.class.getClassLoader();
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		
	try {
		
		JsonNode root = mapper.readTree(new File(classLoader.getResource("jsonMap.json").getFile()));
      //JsonNode root = mapper.readTree(new File(classLoader.getResource("jsonMap.json").getFile()));
		
		JsonNode key1Node = root.get("key1");
		String key1Value = key1Node.asText();
		System.out.println(key1Value);
		
		JsonNode key2Node = root.get("key2");
		String key2Value = key2Node.asText();
		System.out.println(key2Value);
		
		JsonNode array = root.get("array");
		System.out.println("Isarray " + array.isArray());
		for (JsonNode jsonNode : array) {
			System.out.println("value:" + jsonNode.asText());
		}
		
		JsonNode arratOfObjects = root.get("arratOfObjects");
		System.out.println("IsArray " + arratOfObjects.isArray());
		for (JsonNode jsonNode : arratOfObjects) {
			System.out.println("id: "+ jsonNode.get("id").asText());
			System.out.println("Namn "+ jsonNode.get("name").asText());
			System.out.println("Efternamn "+ jsonNode.get("lastName").asText());
		}
		
	System.out.println("-----------------------------");	
		JsonNode nestedObject = root.get("nestedObjekt");
		System.out.println("nestedObject "+ nestedObject.isObject());
		
		for (JsonNode jsonNode : nestedObject) {
			System.out.println(jsonNode.asText());
		}
		System.out.println("-----------------------------");	
		System.out.println(nestedObject.get("id").asText());
		System.out.println(nestedObject.get("name").asText());
		
		String valueArray = array.asText();
		System.out.println(valueArray);
		
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	}
}
