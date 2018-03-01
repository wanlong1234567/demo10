package com.jd.service;

import com.jd.domain.LearnResouce;

import java.util.List;
import java.util.Map;

/**
 * Created by wanlong on 2018/1/13.
 */

public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
}
