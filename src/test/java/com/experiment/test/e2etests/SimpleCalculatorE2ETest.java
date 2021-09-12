package com.experiment.test.e2etests;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.experiment.test.testbase.ProvideIntsForAddition;
import com.experiment.test.testbase.ProvideIntsForDivision;
import com.experiment.test.testbase.ProvideIntsForMultiplication;
import com.experiment.test.testbase.ProvideIntsForSubtraction;
import com.experiment.test.model.InputEntity;
import com.experiment.test.model.OutputEntity;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleCalculatorE2ETest {
	private String BASE_URL = "http://localhost:8081";
	
	public SimpleCalculatorE2ETest() throws IOException {
		try {
		java.io.InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("app.properties");
		java.util.Properties properties = new Properties();
		properties.load(inputStream);
		BASE_URL = properties.getProperty("app.url");
		}
		catch(Exception e) {
		FileInputStream inputStream =  new FileInputStream("src/test/resources/app.properties");
		java.util.Properties properties = new Properties();
		properties.load(inputStream);
		BASE_URL = properties.getProperty("app.url");
		}
	}
	
	@ParameterizedTest
	@ArgumentsSource(ProvideIntsForAddition.class)
	public void testAdd(long a,long b, long c) throws Exception {
		String endpoint = "/addition";
		InputEntity entity = new InputEntity();
		entity.setA(a);
		entity.setB(b);
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
	    request.body(entity);
	    Response response = request.post(endpoint);
		assertEquals(response.getStatusCode(),200);
		long answer = response.getBody().as(OutputEntity.class).getAnswer();
		assertEquals(c,answer);
	}
	
	@ParameterizedTest
	@ArgumentsSource(ProvideIntsForSubtraction.class)
	public void testSubtraction(long a,long b, long c) throws Exception {
		String endpoint = "/subtraction";
		InputEntity entity = new InputEntity();
		entity.setA(a);
		entity.setB(b);
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
	    request.body(entity);
	    Response response = request.post(endpoint);
		assertEquals(response.getStatusCode(),200);
		long answer = response.getBody().as(OutputEntity.class).getAnswer();
		assertEquals(c,answer);
	}
	
	@ParameterizedTest
	@ArgumentsSource(ProvideIntsForMultiplication.class)
	public void testMultiplication(long a,long b, long c) throws Exception {
		String endpoint = "/multiplication";
		InputEntity entity = new InputEntity();
		entity.setA(a);
		entity.setB(b);
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
	    request.body(entity);
	    Response response = request.post(endpoint);
		assertEquals(response.getStatusCode(),200);
		long answer = response.getBody().as(OutputEntity.class).getAnswer();
		assertEquals(c,answer);
	}
	
	@ParameterizedTest
	@ArgumentsSource(ProvideIntsForDivision.class)
	public void testDivision(long a,long b, long c) throws Exception {
		String endpoint = "/division";
		InputEntity entity = new InputEntity();
		entity.setA(a);
		entity.setB(b);
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
	    request.body(entity);
	    Response response = request.post(endpoint);
		assertEquals(response.getStatusCode(),200);
		long answer = response.getBody().as(OutputEntity.class).getAnswer();
		assertEquals(c,answer);
	}
	
	@Test
	public void testDivideByeroError() throws Exception {
		String endpoint = "/division";
		InputEntity entity = new InputEntity();
		entity.setA(10);
		entity.setB(0);
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
	    request.body(entity);
	    Response response = request.post(endpoint);
		assertEquals(response.getStatusCode(),500);
	}
	
}
