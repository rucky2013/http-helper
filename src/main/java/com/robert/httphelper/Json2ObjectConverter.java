package com.robert.httphelper;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Json2ObjectConverter extends AbstractConverter implements
		ResponseHandler<JSONObject> {

	public JSONObject handleResponse(HttpResponse response)
			throws ClientProtocolException, IOException {
		String str = resp2String(response);
		return JSON.parseObject(str);
	}

}
