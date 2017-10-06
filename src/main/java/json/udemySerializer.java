package json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class udemySerializer extends JsonSerializer<UdemyJson>{

	@Override
	public void serialize(UdemyJson udemyJson, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
		
		
		jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
		
		jsonGenerator.writeStartObject();
		
		jsonGenerator.writeFieldName("cusom serialized");
		jsonGenerator.writeString("My Sting json");
		
		jsonGenerator.writeStringField("id", "customPrefix "+ udemyJson.getId());
		jsonGenerator.writeStringField("key1", "customPrefix "+ udemyJson.getKey1());
		jsonGenerator.writeStringField("key2", "customPrefix "+ udemyJson.getKey2());
		jsonGenerator.writeStringField("date", "customPrefix "+ udemyJson.getDate());
		
		
		
		
		jsonGenerator.writeEndObject();
		
		
	}

	
	
	

	
}
