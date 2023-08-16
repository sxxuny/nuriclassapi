package kr.dataeum.nuriclassapi.api;

import kr.dataeum.nuriclassapi.module.ApiResult;
import kr.dataeum.nuriclassapi.common.controller.CommonDefaultController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ApiController extends CommonDefaultController {

    @PostMapping("/get/message")
    @ResponseBody
    public ApiResult returnMassage() {
        ApiResult result = new ApiResult();

        result.put("result", "it works");
        result.setSuccess(true);

        return result;
    }
}
