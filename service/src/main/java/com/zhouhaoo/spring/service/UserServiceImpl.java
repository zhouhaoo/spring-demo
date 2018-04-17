package com.zhouhaoo.spring.service;

import com.zhouhaoo.spring.dao.SkillsMapper;
import com.zhouhaoo.spring.domain.Skills;
import com.zhouhaoo.spring.domain.SkillsExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service层  负责调用dao层，拼装数据，然后返回给controller层。
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    SkillsMapper mSkillsMapper;

    /**
     * 一次方法的调用，就是一次事务。
     */
    @Override
    public List<Skills> skillData() {
        SkillsExample example = new SkillsExample();
        example.createCriteria().andSkillnameEqualTo("sdsd");
        return mSkillsMapper.selectByExample(example);
    }

    @Override
    public Skills skillData(int skillID) throws Exception {
        Skills skills = mSkillsMapper.selectByPrimaryKey(skillID);
        skills.setSkillname("一次修改后的");
        mSkillsMapper.updateByPrimaryKey(skills);
        Skills dto = getExampleByDto(skills);
        return skills;
    }

    public <T> T getExampleByDto(Skills dto) {
        return (T) dto;
    }
}
