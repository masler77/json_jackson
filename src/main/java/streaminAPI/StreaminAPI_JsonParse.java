package streaminAPI;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class StreaminAPI_JsonParse {

	public static void main(String[] args) {

		JsonFactory jsonFactory = new JsonFactory();

		ClassLoader classLoader = StreaminAPI_json_generator.class.getClassLoader();

		try {
			JsonParser jsonParser	= jsonFactory.createParser(new File(classLoader.getResource("jsonGenerator_uotput.json").getFile()));

			while(jsonParser.nextToken() != null){

				JsonToken token = jsonParser.getCurrentToken();

				//System.out.println(token);

				if(token.equals(JsonToken.FIELD_NAME)){

					String fieldName= jsonParser.getCurrentName();
					
					jsonParser.nextToken();
					
					if(fieldName.equals("Object")){
						while(jsonParser.nextToken() != token.END_OBJECT){
							
							String nameField = jsonParser.getCurrentName();
							jsonParser.nextToken();
							if(nameField.equals("id")){
								System.out.println("id: "+ jsonParser.getValueAsString());
							}else if(nameField.equals("name")){
								System.out.println("Name: "+ jsonParser.getValueAsString());
							}else if(nameField.equals("lastName")){
								System.out.println("lastName: "+ jsonParser.getValueAsString());
							}
						}
					}

				}
			}


		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
