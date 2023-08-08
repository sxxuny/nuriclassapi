package kr.dataeum.nuriclassapi.api.service.cfr.lctr;

import kr.dataeum.nuriclassapi.api.dto.system.partcpt.ProgrsRltmLctr;
import kr.dataeum.nuriclassapi.api.mapper.cfr.lctr.PartcptLogMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@RequiredArgsConstructor
public class PartcptLogService {

    private final PartcptLogMapper partcptLogMapper;

    public void insertPartcptLog() throws Exception {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); // 오늘날짜로부터 -1
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String yesterDay = df.format(calendar.getTime());

        ProgrsRltmLctr progrsRltmLctr = new ProgrsRltmLctr();
        progrsRltmLctr.setLctrProgrsDe(yesterDay);

    }

}
