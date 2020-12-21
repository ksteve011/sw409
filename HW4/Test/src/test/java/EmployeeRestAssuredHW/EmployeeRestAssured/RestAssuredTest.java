package EmployeeRestAssuredHW.EmployeeRestAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {

	@Test
	void testcreateEmployee() {
	RestAssured.baseURI="http://localhost:8080/api/v1/employees";
	RequestSpecification httprequest = RestAssured.given();
	JSONObject requestpara = new JSONObject();
	requestpara.put("emp_name","Ben Hunter");
	requestpara.put("emp_id", 4);
	requestpara.put("emp_title","IT Support");
	httprequest.header("Content-Type", "application/json");
	httprequest.body(requestpara.toJSONString());
	Response httpresponse = httprequest.request(Method.POST);
	int statusCode = httpresponse.statusCode();
	Assert.assertEquals(statusCode, 200);
	}
	
	
	@Test
	void testdeleteEmployee() {
	RestAssured.baseURI="http://localhost:8080/api/v1/employees";
	RequestSpecification httprequest = RestAssured.given();
	Response httpresponse = httprequest.request(Method.DELETE);
	String res = httpresponse.getBody().asString();
	System.out.println("Response is " + res);
	int statusCode = httpresponse.statusCode();
	Assert.assertEquals(statusCode, 200);
	}
}
