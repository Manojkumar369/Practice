package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.Util.Util;
import com.qa.client.RestClient;

public class Apitest extends BaseTest {
	BaseTest bt;
	RestClient rc;
	String serviceURL;
	String apiURL;
	String URI;
	CloseableHttpResponse closeablehttpresponse;
	
	@BeforeMethod
	public void setup()
	{
		bt=new BaseTest();
		serviceURL=prop.getProperty("serviceURL");
		apiURL=prop.getProperty("apiURL");
		URI=serviceURL+apiURL;
		
	}
	
	@Test
	public void getApiTest() throws ClientProtocolException, IOException {
		rc=new RestClient();
		closeablehttpresponse=rc.get(URI);
		int statuscode=closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("statuscode is "+statuscode);
		Assert.assertEquals(statuscode,RESPONSE_STATUS_CODE_200);
	}
	
	@Test
	public void getApiresponseTest() throws ClientProtocolException, IOException {
		
		closeablehttpresponse=rc.get(URI);
		String Jsonobject=EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		JSONObject Jsonresponse=new JSONObject(Jsonobject);
		System.out.println("json body response "+Jsonresponse);		
		String per_page=Util.getValueByJPath(Jsonresponse, "/per_page");
		Assert.assertEquals(Integer.parseInt(per_page), 12);		
	}
	
	@Test
	public void getApiArrayresponseTest() throws ClientProtocolException, IOException {
		closeablehttpresponse=rc.get(URI);
		String jsonobject=EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		JSONObject jsonresponse=new JSONObject(jsonobject);
		System.out.println("json body "+jsonresponse);
		String lastname=Util.getValueByJPath(jsonresponse, "/data[0]/last_name");
		String id=Util.getValueByJPath(jsonresponse, "/data[0]/id");
		String avatar=Util.getValueByJPath(jsonresponse, "/data[0]/avatar");
		String firstname=Util.getValueByJPath(jsonresponse, "/data[0]/first_name");
		System.out.println(lastname+firstname+id+avatar);
		Assert.assertEquals(lastname,"xxx");
	}
	
	@Test
	public void getApiHeadersTest() throws ClientProtocolException, IOException {
		Header[] headers=closeablehttpresponse.getAllHeaders();
		HashMap<String,String> headermap=new HashMap<String,String>();
		for(Header head:headers) {
		headermap.put(head.getName(),head.getValue());	
		}
		System.out.println("all headers "+headermap);
		rc.get(URI,headermap);
	}

}
