package kr.dataeum.nuriclassapi.module.system.partcpt.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProgrsRltmLctr {
    private String lctrProgrsDe;//수업한 날짜
    private String roomId;//유프리즘 방번호
    private String lctrId;
}
