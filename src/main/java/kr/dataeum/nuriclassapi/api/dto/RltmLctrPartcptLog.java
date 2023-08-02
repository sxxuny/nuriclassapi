package kr.dataeum.nuriclassapi.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RltmLctrPartcptLog {

    private String logNo;//로그번호
    private String uprismId;//유프리즘ID
    private String name;//회원명
    private String startDate;//시작시점
    private String endDate;//종료시점
    private String logDate;//로그시점
    private String progTime;//머문시간(초)

    private String lctrId;


    public RltmLctrPartcptLog() {

    }

//    public RltmLctrPartcptLog(UserLog userLog) {
//        this.uprismId = userLog.getUserId();
//        this.name = userLog.getName();
//        this.startDate = userLog.getStartDate();
//        this.endDate = userLog.getEndDate();
//        this.logDate = userLog.getLogDate();
//        this.progTime = userLog.getProgTime();
//    }
}
