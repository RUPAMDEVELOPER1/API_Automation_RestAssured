package basics;

import Payloads.bodyPayload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basic {
    public static void main(String[] args) {
            bodyPayload payload = new bodyPayload();

            RestAssured.baseURI="https://rahulshettyacademy.com";
           String response =  given().log().all().queryParam("key","qaclick123").header("Content-type","application/json")
                    .body(payload.addPlace())
                    .when().post("maps/api/place/add/json")
                    .then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();

        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id");
        System.out.println("the place id is "+placeId);
    }
}
