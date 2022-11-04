package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class BearerToken {
	@Test
	public void bearerToken()
	{
		 
		 baseURI="https://api.github.com";
		 JSONObject object = new JSONObject();
		 object.put("name","Basic");
		 
		 given().auth().oauth2("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")
		 .body(object).contentType(ContentType.JSON)
		 .when().post("/user/repos")
		 .then().log().all();
		 
	

	}
}
