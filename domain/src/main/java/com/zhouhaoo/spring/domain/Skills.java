package com.zhouhaoo.spring.domain;

import java.io.Serializable;

public class Skills implements Serializable {
    private Integer skillid;

    private String skillname;

    private String skilltype;

    private static final long serialVersionUID = 1L;

    public Integer getSkillid() {
        return skillid;
    }

    public void setSkillid(Integer skillid) {
        this.skillid = skillid;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname == null ? null : skillname.trim();
    }

    public String getSkilltype() {
        return skilltype;
    }

    public void setSkilltype(String skilltype) {
        this.skilltype = skilltype == null ? null : skilltype.trim();
    }
}