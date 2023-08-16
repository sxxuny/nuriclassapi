package kr.dataeum.nuriclassapi.module.service;

import kr.dataeum.nuriclassapi.module.ProgrsRltmLctr;
import kr.dataeum.nuriclassapi.module.service.impl.ProgrsRltmLctrMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProgrsRltmLctrService {

    private final ProgrsRltmLctrMapper progrsRltmLctrMapper;

    public List<ProgrsRltmLctr> selectProgrsRltmLctrList(ProgrsRltmLctr searchVO) throws Exception {
        return progrsRltmLctrMapper.selectProgrsRltmLctrList(searchVO);
    }

}
