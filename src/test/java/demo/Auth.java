//package demo;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.specification.RequestSpecification;
//import org.testng.annotations.Test;
//
//public class Auth {
//
//    @Test
//    public void getData() {
//        RequestSpecification httpRequest = RestAssured.given();
//        Response res = httpRequest.get("https://postman-echo.com/basic-auth");
//        ResponseBody body = res.body();
//        //Converting the response body to string
//        String rbdy = body.asString();
//        System.out.println("Data from the GET API- " + rbdy);
//    }
//}
//
package demo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Auth {

    @Test
    public void getData() {
        RequestSpecification httpRequest = RestAssured.given().auth().basic("postman", "password");
        Response res = httpRequest.get("http://ims.grandgroupbd.com/dashboard");
        ResponseBody body = res.body();
        //Converting the response body to string
        String rbdy = body.asString();
        System.out.println("Data from the GET API- "+rbdy);
    }
}