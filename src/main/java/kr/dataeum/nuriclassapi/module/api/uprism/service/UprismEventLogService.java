package kr.dataeum.nuriclassapi.module.api.uprism.service;

import kr.dataeum.nuriclassapi.module.ApiResult;
import kr.dataeum.nuriclassapi.module.api.uprism.auth.ApiAuthorization;
import kr.dataeum.nuriclassapi.module.api.uprism.ApiSender;
import kr.dataeum.nuriclassapi.module.cfr.lctr.service.impl.PartcptLogMapper;
import kr.dataeum.nuriclassapi.module.system.partcpt.service.ProgrsRltmLctrService;
import kr.dataeum.nuriclassapi.module.system.partcpt.service.ProgrsRltmLctr;
import kr.dataeum.nuriclassapi.module.cfr.lctr.service.impl.PartcptInfoMapper;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UprismEventLogService {

    private final ApiSender apiSender;
    private final ApiAuthorization apiAuthorization;

    private final ProgrsRltmLctrService progrsRltmLctrService;

    private final PartcptInfoMapper partcptInfoMapper;
    private final PartcptLogMapper partcptLogMapper;

    public void insertUprismEventLog() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); // 오늘날짜로부터 -1
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String yesterDay = df.format(calendar.getTime());

        ProgrsRltmLctr progrsRltmLctr = new ProgrsRltmLctr();
//        progrsRltmLctr.setLctrProgrsDe(yesterDay);
        progrsRltmLctr.setLctrProgrsDe("20220420"); //test

        List<ProgrsRltmLctr> progrsRltmLctrlist = progrsRltmLctrService.selectProgrsRltmLctrList(progrsRltmLctr);
        JSONObject jsonObj  = apiAuthorization.getAccessToken();
        String accessToken = jsonObj.get("access_token").toString();

        List<List> tempList = new ArrayList<>();
        List<UserLog> lctrUserLogList = new ArrayList<>();
        if(progrsRltmLctrlist.size() > 0) {
            int index = 0;
            for(ProgrsRltmLctr prl : progrsRltmLctrlist) {
//                ApiResult apiResult = apiSender.sendGet( "v1/userlogs/roomid/"+prl.getRoomId(), accessToken);//유프리즘 userLogs api사용
                ApiResult apiResult = apiSender.sendGet( "v1/userlogs/roomid/37700BCB-00C5-409C-8746-BBC7C8B68CD7", accessToken);//test
                List<UserLog> userLogList = apiResult.getResponse().get("data");

                for(UserLog userLog : userLogList) {
                    userLog.setLctrId(prl.getLctrId());
                }

                if (index % 10 == 0 && index != 0) {
                    tempList.add(lctrUserLogList);

                    lctrUserLogList = new ArrayList<>();
                    lctrUserLogList.addAll(userLogList);
                } else {
                    lctrUserLogList.addAll(userLogList);
                }

                index ++;
            }

            System.out.println("[Result1] " + tempList);
            System.out.println("[Result2] " + lctrUserLogList);

//            for (int i = 0; i < tempList.size(); i++) {
//                partcptLogMapper.insertUserLog(tempList.get(i));
//                partcptInfoMapper.insertUpdatePartcptInfo();
//                partcptLogMapper.deletePartcptLog();
//            }

//            partcptLogMapper.insertUserLog(lctrUserLogList);
//            partcptInfoMapper.insertUpdatePartcptInfo();
//            partcptLogMapper.deletePartcptLog();
        }
    }

}
