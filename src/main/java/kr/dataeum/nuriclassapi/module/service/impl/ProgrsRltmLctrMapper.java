package kr.dataeum.nuriclassapi.module.service.impl;

import kr.dataeum.nuriclassapi.module.ProgrsRltmLctr;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface ProgrsRltmLctrMapper {

    List<ProgrsRltmLctr> selectProgrsRltmLctrList(ProgrsRltmLctr searchVO) throws Exception;

}
