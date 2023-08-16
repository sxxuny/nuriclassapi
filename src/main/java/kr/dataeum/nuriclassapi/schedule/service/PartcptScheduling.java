package kr.dataeum.nuriclassapi.schedule.service;

import kr.dataeum.nuriclassapi.module.api.uprism.service.UprismEventLogService;
import kr.dataeum.nuriclassapi.module.api.whaleon.service.WhaleonEventLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class PartcptScheduling {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartcptScheduling.class);

    private final UprismEventLogService uprismEventLogService;
    private final WhaleonEventLogService whaleonEventLogService;

    /**
     * 유프리즘 방에 참가했던 정보 API로 가져오기
     * 매일 오전 1시에 전날 DTN_PROGRS_RLTM_LCTR에 쌓인 회의방 로그만 가져온다
     */
//    @Scheduled(cron = "0/60 * * * * *")
    @Scheduled(cron = "0 0 2 * * *")
    public void updatePartcptLog() throws Exception {
        uprismEventLogService.insertUprismEventLog();
//        whaleonEventLogService.insertWhaleonEventLog();
    }

}
