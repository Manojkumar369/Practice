package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	public void get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpclient=HttpClients.createDefault();//create connection with API
		HttpGet httpget=new HttpGet(url);//HTTP GET request with URL
		CloseableHttpResponse closeablehttpresponse=httpclient.execute(httpget);//hit GET request
		
		//status code
		int code=closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("status code"+code);
		
		//json body
		String responsebody=EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");
		JSONObject jsonbody=new JSONObject(responsebody);
		
		Header[] allheaders=closeablehttpresponse.getAllHeaders();
		HashMap<String,String> headers=new HashMap<String,String>();
		for(Header head:allheaders)
		{
			headers.put(head.getName(),head.getValue());
		}
		System.out.println("all headers"+headers);
		
	}
	
	

}
