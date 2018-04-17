package com.zhouhaoo.spring.service;

import com.zhouhaoo.spring.domain.Skills;

import java.util.List;

public interface UserService {
    List<Skills> skillData();

    Skills skillData(int skillID) throws Exception;
}
