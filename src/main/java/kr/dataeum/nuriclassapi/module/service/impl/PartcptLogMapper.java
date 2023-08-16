package kr.dataeum.nuriclassapi.module.service.impl;

import kr.dataeum.nuriclassapi.module.uprism.UserLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface PartcptLogMapper {

    void insertUserLog(List<UserLog> list) throws Exception;

    void deletePartcptLog() throws Exception;

}
