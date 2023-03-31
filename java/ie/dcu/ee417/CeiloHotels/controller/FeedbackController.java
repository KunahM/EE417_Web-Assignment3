package ie.dcu.ee417.CeiloHotels.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ie.dcu.ee417.CeiloHotels.entities.Feedback;

@RestController
public class FeedbackController {

	
	private JSONParser jsonParser = new JSONParser();

	@GetMapping("/feedback")
	String getUsers() throws ParseException {
		JSONArray jsonArray = new JSONArray();
		try {
			Object obj = jsonParser.parse(new FileReader("C://Users/Kunah/OneDrive/Documents/Dublin City University/Assignment/Web Application Development/Web App/Kunah/CeiloHotels/src/main/resources/feedback.json"));
			jsonArray = (JSONArray) obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray.toJSONString();
	}
}
