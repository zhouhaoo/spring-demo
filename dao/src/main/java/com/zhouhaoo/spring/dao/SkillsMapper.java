package com.zhouhaoo.spring.dao;

import com.zhouhaoo.spring.domain.Skills;
import com.zhouhaoo.spring.domain.SkillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SkillsMapper {
    int countByExample(SkillsExample example);

    int deleteByExample(SkillsExample example);

    int deleteByPrimaryKey(Integer skillid);

    int insert(Skills record);

    int insertSelective(Skills record);

    List<Skills> selectByExampleWithRowbounds(SkillsExample example, RowBounds rowBounds);

    List<Skills> selectByExample(SkillsExample example);

    Skills selectByPrimaryKey(Integer skillid);

    int updateByExampleSelective(@Param("record") Skills record, @Param("example") SkillsExample example);

    int updateByExample(@Param("record") Skills record, @Param("example") SkillsExample example);

    int updateByPrimaryKeySelective(Skills record);

    int updateByPrimaryKey(Skills record);
}