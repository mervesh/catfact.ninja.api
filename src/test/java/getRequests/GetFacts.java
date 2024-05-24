package getRequests;

import io.restassured.response.Response;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import baseUrl.CatfactsApiBaseUrl;
import pojoDatas.GetFactResponse;
import pojoDatas.GetFactsResponse;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class GetFacts extends CatfactsApiBaseUrl {
    private static Logger logger;

    @BeforeClass
    public static void setup() {
        PropertyConfigurator.configure("log4j.properties");
        logger = Logger.getLogger(GetFacts.class);
    }


    @Test
    public void getRandomFact() {
        specification.pathParam("factPath", "fact");
        logger.info("Set the URL for a random fact");

        Response response = given().spec(specification).when().get("/{factPath}");
        logger.info("Send the GET request for a random fact");

        response.then().statusCode(200);
        logger.info("Asserted the status code is 200");

        GetFactResponse factResponse = response.as(GetFactResponse.class);
        assertNotNull(factResponse);
        logger.info("Asserted the response body is not empty");
    }

    @Test
    public void getFacts() {
        specification.pathParam("factsPath", "facts");
        logger.info("Set the URL for facts");

        Response response = given().spec(specification).when().get("/{factsPath}");
        logger.info("Send the GET request for facts");

        response.then().statusCode(200);
        logger.info("Asserted the status code is 200");

        GetFactsResponse factsResponse = response.as(GetFactsResponse.class);
        assertNotNull(factsResponse);
        logger.info("Asserted the response body is not empty");
    }


}
