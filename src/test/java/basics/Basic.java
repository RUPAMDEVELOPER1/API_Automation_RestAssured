package basics;

import Payloads.bodyPayload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basic {
    public static void main(String[] args) {
            bodyPayload payload = new bodyPayload();

            //Post a adress and validating status code 200 asn scope as app and storing the place id form the response

            RestAssured.baseURI="https://rahulshettyacademy.com";
           String response =  given().log().all().queryParam("key","qaclick123").header("Content-type","application/json")
                    .body(payload.addPlace())
                    .when().post("maps/api/place/add/json")
                    .then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();

        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id");
        System.out.println("the place id is "+placeId);


        //put (update the place with place id stored from the response of the post methode and validating the details
        given().log().all().queryParam("key","qaclick123").header("Content-type","application/json")
                .body(payload.updatePlace(placeId)).when().put("maps/api/place/add/json").then().log().all();

        //get (get the adress with the place id and check weather what you upadted correctly updated or not
        String adressFromGet = given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeId)
                .when().get("maps/api/place/add/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath jsonPath = new JsonPath(adressFromGet);
        String adressfromget = jsonPath.getString("address");
        System.out.println("my changed adress is :");
    }
}
