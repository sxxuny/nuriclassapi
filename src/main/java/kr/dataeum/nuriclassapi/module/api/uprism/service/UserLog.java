package kr.dataeum.nuriclassapi.module.api.uprism.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLog {
    private String progTime;
    private String logDate;
    private String endDate;
    private String name;
    private String userId;
    private String startDate;

    private String lctrId;//log insert시 입력
}
