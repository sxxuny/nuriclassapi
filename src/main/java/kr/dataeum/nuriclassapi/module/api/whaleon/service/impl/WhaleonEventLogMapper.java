package kr.dataeum.nuriclassapi.module.api.whaleon.service.impl;

import kr.dataeum.nuriclassapi.module.api.whaleon.service.Whaleon;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface WhaleonEventLogMapper {

    List<Whaleon> selectWhaleonEventLogList(Whaleon searchVO) throws Exception;

}
