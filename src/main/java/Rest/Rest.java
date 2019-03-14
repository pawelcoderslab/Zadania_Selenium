package Rest;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Rest {


    public Rest() {

    }


    @Test
    public void highestUserId() {

        Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/posts/");
        String respMessage = resp.asString();
        int code = resp.getStatusCode();
        JsonPath jPath = new JsonPath(respMessage.toString());
        //jPath.prettyPrint();
        int userId = jPath.get("userId.max()");

        //Nie wiedziałem czy ten test ma zwracać wartość jako return czy po prostu wydrukować
        System.out.println("Max userId " + userId);
        Assert.assertEquals(code, 200);
        System.out.println(code);

    }

    @Test
    public int highestIdForUser(int userId) {
        Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/posts?userId=" + userId);
        String respMessage = resp.asString();
        int code = resp.getStatusCode();
        JsonPath jPath = new JsonPath(respMessage.toString());
        //jPath.prettyPrint();
        int id = jPath.get("id.max()");

        System.out.println("Max id " + id);
        Assert.assertEquals(code, 200);
        System.out.println(code);
        return id;

    }


    @Test
    public void RegistrationSuccessful(int postId) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("postId", postId);
        requestParams.put("id", "1000");
        requestParams.put("name", "Pawel");
        requestParams.put("email", "p@gmail.com");
        requestParams.put("body", "Spoko");


        request.body(requestParams.toJSONString());
        Response response = request.post("/comments");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);
        if (statusCode == 201) {
            System.out.println("Added new item");
        }

    }
}
