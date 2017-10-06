package json;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serializerWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UdemyJson udemyJson = new UdemyJson();
		udemyJson.setId(1223);
		udemyJson.setKey1("test1 kommer det att gå?");
		udemyJson.setKey2("nu har jag snart lärt mig Json :-)");
		udemyJson.setDate(new Date());
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyJson));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
