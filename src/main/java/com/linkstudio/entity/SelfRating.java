package com.linkstudio.entity;

import java.util.Date;

public class SelfRating {
    private Integer id;

    private String stuId;

    private Integer scoreQ1;

    private Integer scoreQ2;

    private Integer scoreQ3;

    private Integer scoreQ4;

    private Integer scoreQ5;


    private Date time;

    private String branchName;

    private String schoolName;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Integer getScoreQ1() {
        return scoreQ1;
    }

    public void setScoreQ1(Integer scoreQ1) {
        this.scoreQ1 = scoreQ1;
    }

    public Integer getScoreQ2() {
        return scoreQ2;
    }

    public void setScoreQ2(Integer scoreQ2) {
        this.scoreQ2 = scoreQ2;
    }

    public Integer getScoreQ3() {
        return scoreQ3;
    }

    public void setScoreQ3(Integer scoreQ3) {
        this.scoreQ3 = scoreQ3;
    }

    public Integer getScoreQ4() {
        return scoreQ4;
    }

    public void setScoreQ4(Integer scoreQ4) {
        this.scoreQ4 = scoreQ4;
    }

    public Integer getScoreQ5() {
        return scoreQ5;
    }

    public void setScoreQ5(Integer scoreQ5) {
        this.scoreQ5 = scoreQ5;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}