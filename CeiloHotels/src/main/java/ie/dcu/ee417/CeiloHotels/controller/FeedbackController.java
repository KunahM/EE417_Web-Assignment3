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
			Object obj = jsonParser.parse(new FileReader("/Users/deepakbhat/Dump/git/hrishi/Snapbite/src/main/resources/feedback.json"));
			jsonArray = (JSONArray) obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray.toJSONString();
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/feedback")
	JSONObject newEmployee(@RequestBody Feedback newUser) throws ParseException {
		JSONArray jsonArray = new JSONArray();
		try {
			Object obj = jsonParser.parse(new FileReader("/Users/deepakbhat/Dump/git/hrishi/Snapbite/src/main/resources/feedback.json"));
			jsonArray = (JSONArray) obj;

			System.out.println(jsonArray);

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("FirstName", newUser.getFirstName());
			jsonObject.put("LastName", newUser.getLastName());
			jsonObject.put("Email", newUser.getEmail());
			jsonObject.put("Message", newUser.getMessage());
			jsonObject.put("Subject", newUser.getSubject());

			jsonArray.add(jsonObject);

			FileWriter file1 = new FileWriter("/Users/deepakbhat/Dump/git/hrishi/Snapbite/src/main/resources/feedback.json");
			file1.write(jsonArray.toJSONString());
			file1.flush();
			file1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "SUCCESS");
		return jsonObject;
	}
}
