package kr.dataeum.nuriclassapi.module.cfr.lctr.service.impl;

import kr.dataeum.nuriclassapi.module.api.uprism.service.UserLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface PartcptLogMapper {

    void insertUserLog(List<UserLog> list) throws Exception;

    void deletePartcptLog() throws Exception;

}
