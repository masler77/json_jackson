package json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class treeModelWriter {
	public static void main(String[] args) {


		ClassLoader classLoader = treeModelWriter.class.getClassLoader();



		ObjectMapper mapper = new ObjectMapper();



		try {
			JsonNode root = mapper.readTree(new File(classLoader.getResource("jsonMap.json").getFile()));
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
			
			System.out.println("----------------------------------");
			((ObjectNode)root).remove("array");
			((ObjectNode)root).putArray("new array");
			((ObjectNode)root).withArray("new array").add(12341234);
			((ObjectNode)root).withArray("new array").add(123412222);
			System.out.println("-----------------3333-----------------");
			ArrayNode arrayNode = ((ObjectNode)root).withArray("list");
			System.out.println(arrayNode);
			System.out.println("----------------------------------");
			
			
			
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}