package kr.dataeum.nuriclassapi.api.web;

import kr.dataeum.nuriclassapi.common.controller.CommonDefaultController;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/whaleon")
public class ApiWhaleonController extends CommonDefaultController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiWhaleonController.class);

}
