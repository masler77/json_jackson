package json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class udemyDeserializer extends JsonDeserializer<UdemyJson>{

	@Override
	public UdemyJson deserialize(JsonParser JsonParser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		
		ObjectCodec codec = JsonParser.getCodec();
		JsonNode root = codec.readTree(JsonParser);
		
		UdemyJson udemyJson = new UdemyJson();
		udemyJson.setId(Long.valueOf(root.get("udemyjson id").asText().replace("customPrefix", "")));
		udemyJson.setKey1(root.get("udemyjson key1").asText());
		udemyJson.setKey2(root.get("udemyjson key1").asText());
		
		
		return udemyJson;
	}
	

}
