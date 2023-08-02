package kr.dataeum.nuriclassapi.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UprismEventLogService {

    public void insertUprismEventLog() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String yesterDay = df.format(calendar.getTime());
    }

}
