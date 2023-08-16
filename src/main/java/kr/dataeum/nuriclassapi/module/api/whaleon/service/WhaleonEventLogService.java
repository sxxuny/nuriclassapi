package kr.dataeum.nuriclassapi.module.api.whaleon.service;

import kr.dataeum.nuriclassapi.module.api.whaleon.service.impl.WhaleonEventLogMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@RequiredArgsConstructor
public class WhaleonEventLogService {

    private final WhaleonEventLogMapper whaleonEventLogMapper;

    public void inserWhaleonEventLog() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); // 오늘날짜로부터 -1
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String yesterDay = df.format(calendar.getTime());

        Whaleon whaleon = new Whaleon();
//        whaleon.setLctrProgrsDe(yesterDay);
        whaleon.setLctrProgrsDe("20230814"); //test

        List<Whaleon> list = whaleonEventLogMapper.selectWhaleonEventLogList(whaleon);

        //TODO
    }

}
