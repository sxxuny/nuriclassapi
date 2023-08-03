package kr.dataeum.nuriclassapi.api.mapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64.Encoder;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("apiAuthorization")
public class ApiAuthorization {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiAuthorization.class);

    private String uprismAddress = "https://gne.uprism.io:31443/";
    private String uprismClientKey = "7dada4a2-792a-4846-9b0c-09c4e5ca2440";
    private String uprismClientSecret = "08e82964-d8f7-405c-9f02-fe7d0bcd52bd";

    public JSONObject getAccessToken() {
        JSONObject jsonResult = null;
        Map<String, Object> params = new HashMap<>();
        params.put("grant_type", "client_credentials");
        try {
            URL url = new URL(uprismAddress + "oauth/token");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            Encoder encoder = Base64.getEncoder();
            StringBuilder postData = new StringBuilder();
            for(Map.Entry<String,Object> param : params.entrySet()) {
                if(postData.length() != 0) postData.append('&');
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }

            con.setConnectTimeout(5000); //서버에 연결되는 Timeout 시간 설정
            con.setReadTimeout(5000); // InputStream 읽어 오는 Timeout 시간 설정
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            con.setRequestProperty("Authorization", "Basic " + encoder.encodeToString((uprismClientKey + ":" + uprismClientSecret).getBytes("UTF-8")));
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("POST");
            con.getOutputStream().write(postData.toString().getBytes());

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String inputLine, result = "";
            while((inputLine = in.readLine()) != null) { // response 출력
                result += inputLine;
            }
            //TODO
//            JSONParser parser = new JSONParser();
//            jsonResult = (JSONObject) parser.parse(result);
        } catch (Exception e) {
            LOGGER.error("access_token 생성중 에러발생");
            e.printStackTrace();
        }
        return jsonResult;
    }

}

