package kr.dataeum.nuriclassapi.module;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RltmLctrPartcptInfo {
    private String partcptInfoId;//참가정보Id
    private String lctrId;//강연Id
    private String uprismId;//유프리즘ID
    private String adhrncUserId;//유저ID
    private String adhrncUserNm;//유저명
    private String partcptDe;//참가일
    private String partcptTime;//참가시간
    private String endTime;//종료시간
    private String progTime;//머문시간
}
