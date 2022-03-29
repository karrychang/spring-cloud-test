package com.cjt.cloud.rest;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class TestHttpClient {
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            try{
                HttpGet httpGet = new HttpGet("http://localhost:9000/router");
                CloseableHttpResponse response = httpClient.execute(httpGet);
                list.add(EntityUtils.toString(response.getEntity()));
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
        ;list.forEach(s -> System.out.println(s));
    }
}
