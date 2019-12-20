package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {
	
	TestBase testbase;
	RestClient restclient;
	String URL;
	@BeforeMethod
	public void setup() {
	
		testbase=new TestBase();
		String serviceURL=prop.getProperty("serviceURL");
		String apiURL=prop.getProperty("ApiURL");
		URL=serviceURL+apiURL;//   https://reqres.in + /api/users		
	}
	
	@Test
	public void getApiTest() throws ClientProtocolException, IOException
	{
		restclient=new RestClient();
		restclient.get(URL);
		
	}

}
