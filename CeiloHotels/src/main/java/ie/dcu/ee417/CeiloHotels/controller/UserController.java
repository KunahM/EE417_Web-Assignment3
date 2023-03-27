package ie.dcu.ee417.CeiloHotels.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ie.dcu.ee417.CeiloHotels.entities.Users;

@RestController
public class UserController {
	
	private JSONParser jsonParser = new JSONParser();

	@GetMapping("/users")
	  String getUsers() throws ParseException {
		JSONArray jsonArray = new JSONArray();
		try {
			Object obj = jsonParser.parse(new FileReader("C://Users/Kunah/OneDrive/Documents/Dublin City University/Assignment/Web Application Development/Web App/Kunah/CeiloHotels/src/main/resources/users.json"));
			jsonArray = (JSONArray) obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray.toJSONString();
	  }
	
	@GetMapping("/users/{email}")
	  String getUser(@PathVariable String email) throws ParseException {
		JSONArray jsonArray = new JSONArray();
		try {
			Object obj = jsonParser.parse(new FileReader("C://Users/Kunah/OneDrive/Documents/Dublin City University/Assignment/Web Application Development/Web App/Kunah/CeiloHotels/src/main/resources/feedback.json"));
			jsonArray = (JSONArray) obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonArray.toJSONString());
		JSONObject thisob = new JSONObject();
		for(Object ob : jsonArray) {
			JSONObject myJSONObject = (JSONObject) ob;
			System.out.println(myJSONObject.toJSONString());
			if(myJSONObject.get("Email").toString().equals(email))
				thisob = myJSONObject;
		}
		return thisob.toJSONString();
	  }
	
	@SuppressWarnings("unchecked")
	@PostMapping("/users")
	  String newEmployee(@RequestBody Users newUser) throws ParseException {
		System.out.println("Received a POST for " + newUser.getFirstName());
		JSONArray jsonArray = new JSONArray();
		try {
			Object obj = jsonParser.parse(new FileReader("C://Users/Kunah/OneDrive/Documents/Dublin City University/Assignment/Web Application Development/Web App/Kunah/CeiloHotels/src/main/resources/users.json"));
			jsonArray = (JSONArray) obj;

			System.out.println(jsonArray);

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("FirstName", newUser.getFirstName());
			jsonObject.put("LastName", newUser.getSurname());
			jsonObject.put("Email", newUser.getEmail());
			jsonObject.put("ContactNumber", newUser.getoutput());
			jsonObject.put("Destination", newUser.getDestination());
			jsonObject.put("Roomtype", newUser.getRoomtype());
			jsonObject.put("Guest", newUser.getGuest());
			jsonObject.put("Country", newUser.getCountry());
			jsonObject.put("Address", newUser.getAddress());
			jsonObject.put("Address2", newUser.getAddress2());
			jsonObject.put("Zip", newUser.getZip());
			jsonObject.put("Password", newUser.getPassword());

			jsonArray.add(jsonObject);

			FileWriter file1 = new FileWriter("C://Users/Kunah/OneDrive/Documents/Dublin City University/Assignment/Web Application Development/Web App/Kunah/CeiloHotels/src/main/resources/users.json");
			file1.write(jsonArray.toJSONString());
			file1.flush();
			file1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray.toJSONString();
	  }
}
