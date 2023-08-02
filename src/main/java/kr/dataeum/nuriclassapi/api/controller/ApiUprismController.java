package kr.dataeum.nuriclassapi.api.controller;

import kr.dataeum.nuriclassapi.common.controller.CommonDefaultController;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/uprism")
public class ApiUprismController extends CommonDefaultController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiUprismController.class);

//    @RequestMapping(value = "/getConfUserLogList.json")
//    @ResponseBody
//    public JSONObject getConfUserLogList(@RequestParam(name = "roomId", required = true) String roomId) {
//    }

}
