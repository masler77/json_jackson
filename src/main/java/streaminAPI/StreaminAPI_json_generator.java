package streaminAPI;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.stu;

public class StreaminAPI_json_generator {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		JsonFactory jsonFactory = new JsonFactory();

		try {
			JsonGenerator JsonGenerator = jsonFactory.createGenerator(System.out);

			JsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());

			JsonGenerator.setCodec(mapper);
			// börjar json skrivning dokument
			JsonGenerator.writeStartObject();

			JsonGenerator.writeFieldName("id");
			JsonGenerator.writeRawValue("1234");


			JsonGenerator.writeFieldName("name");
			JsonGenerator.writeRawValue("Magnus");

			JsonGenerator.writeStringField("test", "Master77");
//Skriva till object
			stu stu = new stu();
			stu.setId(345433);
			stu.setName("KalleAnka");
			stu.setLastName("AnkeBorg");

			JsonGenerator.writeObjectField("Object", stu);

			JsonGenerator.writeFieldName("Array");
			JsonGenerator.writeStartArray();
			JsonGenerator.writeString("MagnusArray");
			JsonGenerator.writeString("MagnusArray");


			JsonGenerator.writeEndArray();
			JsonGenerator.writeEndObject();
			JsonGenerator.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
