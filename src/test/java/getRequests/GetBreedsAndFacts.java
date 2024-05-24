package getRequests;

import io.restassured.response.Response;

import org.junit.Test;
import baseUrl.CatfactsApiBaseUrl;
import pojoDatas.GetBreedsResponse;
import pojoDatas.GetFactResponse;
import pojoDatas.GetFactsResponse;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class GetBreedsAndFacts extends CatfactsApiBaseUrl {

    @Test
    public  void getBreeds() {
        specification.pathParam("breedsPath","breeds");
        Response response= given().spec(specification).when().get("/{breedsPath}");
        response.then().statusCode(200);
        GetBreedsResponse breedsResponse = response.as(GetBreedsResponse.class);
        assertNotNull(breedsResponse);
    }

    @Test
    public  void getRandomFact() {
        specification.pathParam("factPath","fact");
        Response response= given().spec(specification).when().get("/{factPath}");
        response.then().statusCode(200);
        GetFactResponse factResponse = response.as(GetFactResponse.class);
        assertNotNull(factResponse);
    }

    @Test
    public  void getFacts() {
        specification.pathParam("factsPath","facts");
        Response response= given().spec(specification).when().get("/{factsPath}");
        response.then().statusCode(200);
        GetFactsResponse factResponse = response.as(GetFactsResponse.class);
        assertNotNull(factResponse);
    }


}
