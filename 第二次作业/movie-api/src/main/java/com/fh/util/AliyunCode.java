package com.fh.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class AliyunCode {

 public static boolean sendSms(String phone, String code) {
  boolean success=false;
  try {
  DefaultProfile profile = DefaultProfile.getProfile("", "", "");
  IAcsClient client = new DefaultAcsClient(profile);
  CommonRequest request = new CommonRequest();
  request.setMethod(MethodType.POST);
  request.setDomain("");
  request.setVersion("2017-05-25");
  request.setAction("SendSms");
  request.putQueryParameter("", "");
  request.putQueryParameter("PhoneNumbers", phone);
  request.putQueryParameter("SignName", "");
  request.putQueryParameter("TemplateCode", "");
  request.putQueryParameter("TemplateParam", "{\"code\":" + code + "}");
   CommonResponse response = client.getCommonResponse(request);
   String data = response.getData();
   JSONObject jsonObject = JSON.parseObject(data);
   String responseCode = (String) jsonObject.get("Code");
   if(responseCode.equals("OK")){
    success = true;
   }
  } catch (ServerException e) {
   e.printStackTrace();
  } catch (ClientException e) {
   e.printStackTrace();
  }
  return success;
 }
}
