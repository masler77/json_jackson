package schemaValidering;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

public class JsonSchemaGenerator {

	public static void main(String[] args) {
	
		ObjectMapper mapper =new ObjectMapper();
		
		SchemaFactoryWrapper wrapper = new SchemaFactoryWrapper();
		
		try {
			mapper.acceptJsonFormatVisitor(mapper.constructType(lectureSchema.class), wrapper);
			com.fasterxml.jackson.module.jsonSchema.JsonSchema jsonSchema = wrapper.finalSchema();
			
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  

}}
