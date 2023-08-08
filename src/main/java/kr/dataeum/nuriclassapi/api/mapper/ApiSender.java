package kr.dataeum.nuriclassapi.api.mapper;

import org.json.simple.parser.JSONParser;
import org.json.simple.*;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Component("apiSender")
public class ApiSender {

    private String uprismAddress = "https://gne.uprism.io:31443/";

    public JSONObject sendGet(String method, String path, String token) {
        JSONObject jsonResult = null;

        try {
            URL url = new URL(uprismAddress + path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setConnectTimeout(5000); //서버에 연결되는 Timeout 시간 설정
            con.setReadTimeout(5000); // InputStream 읽어 오는 Timeout 시간 설정
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            con.setRequestProperty("Authorization", "Bearer " + token);
            con.setRequestProperty("Accept", "*");
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod(method);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String inputLine;
            String result = "";

            while((inputLine = in.readLine()) != null) { // response 출력
                result += inputLine;
            }
            JSONParser parser = new JSONParser();
            jsonResult = (JSONObject) parser.parse(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonResult;
    }

}
