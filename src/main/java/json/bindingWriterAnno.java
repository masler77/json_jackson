package json;

import java.awt.Frame;
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

public class bindingWriterAnno {

	public static void main(String[] args){
	
		
		ObjectMapper mapper = new ObjectMapper();
		lecture le = new lecture();

		le.setId(123);
		le.setName("kungkula");
		le.setNameLine2("goldenState");
		le.setDesc("hur kommer det att gå för mig nu på UC??");
//		le.setPa(false);
		le.fragor.add("hur kommer det att gå?");
		le.fragor.add("nu gick dert t");
		
		
		
	
		
		le.setPa(true);

		
		try {
		System.out.println(	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(le));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
//	{
//		  "name" : "kungkula",
//		  "desc" : "hur kommer det att gå för mig nu på UC??",
//		  "id" : 123,
//		  "pa" : true,
//		  "fragor" : [ "hur kommer det att gå?", "nu gick dert t" ],
//		  "nameLine2" : "goldenState"
//		}

	
}
