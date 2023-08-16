package kr.dataeum.nuriclassapi.module.api.whaleon.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Whaleon {
    private String lctrProgrsDe;//수업한 날짜
    private String roomId;//유프리즘 방번호
    private String lctrId;

    private String contentId;
    private String hostId;
    private String title;
}
