package kr.dataeum.nuriclassapi.api.web;

import kr.dataeum.nuriclassapi.common.controller.CommonDefaultController;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/uprism")
public class ApiUprismController extends CommonDefaultController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiUprismController.class);

    /**
     * roomId 로 회의에 접속한 리스트를 조회해오는 API
     * @return
     */
//    @RequestMapping(value = "/getConfUserLogList.json")
//    @ResponseBody
//    public JSONObject getConfUserLogList(@RequestParam(name = "roomId", required = true) String roomId) {
//        JSONObject accessToken = apiAuthorization.getAccessToken();
//        JSONObject result = apiSender.sendGet("GET", "v1/userlogs/roomid/"+roomId, (String) accessToken.get("access_token"));
//        return result;
//    }

}
