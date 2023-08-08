package kr.dataeum.nuriclassapi.api.dto.cfr.lctr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrseWhaleonEventLog {
    private String partcptInfoId;//참가정보Id
    private String progrmId;//프로그램ID
    private String adhrncUserId;//유저ID
    private String adhrncUserNm;//유저명
    private String partcptDe;//참가일
    private String partcptTime;//참가시간
    private String endTime;//종료시간
}
