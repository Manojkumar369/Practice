package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	CloseableHttpResponse closeablehttpresponse;
	CloseableHttpClient httpclient;
	HttpGet httpget;
	
	public CloseableHttpResponse get(String URL) throws ClientProtocolException, IOException {
		httpclient=HttpClients.createDefault();
		httpget=new HttpGet(URL);
		closeablehttpresponse=httpclient.execute(httpget);
		return closeablehttpresponse;
	}
	
	public CloseableHttpResponse get(String URL,HashMap<String,String> headermap) throws ClientProtocolException,IOException {
		httpclient=HttpClients.createDefault();
		httpget=new HttpGet(URL);
		
		for(Entry<String, String> entry:headermap.entrySet()) {
			httpget.addHeader(entry.getKey(),entry.getValue());
		}
		closeablehttpresponse=httpclient.execute(httpget);
		return closeablehttpresponse;
	}

}
