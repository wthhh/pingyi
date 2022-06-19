package com.linkstudio.entity;

import java.util.Date;

public class MemberRating {
    private Integer id;

    private String stuIdRated;

    private String stuIdRating;
    private String schoolName;
    private String branchName;

    private String score;

    private Short isBest;

    private Short isWorst;

    private Short isContact;

    private Date time;
    private  Short iden ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuIdRated() {
        return stuIdRated;
    }

    public void setStuIdRated(String stuIdRated) {
        this.stuIdRated = stuIdRated;
    }

    public String getStuIdRating() {
        return stuIdRating;
    }

    public void setStuIdRating(String stuIdRating) {
        this.stuIdRating = stuIdRating;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Short getIsBest() {
        return isBest;
    }

    public void setIsBest(Short isBest) {
        this.isBest = isBest;
    }

    public Short getIsWorst() {
        return isWorst;
    }

    public void setIsWorst(Short isWorst) {
        this.isWorst = isWorst;
    }

    public Short getIsContact() {
        return isContact;
    }

    public void setIsContact(Short isContact) {
        this.isContact = isContact;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Short getIden() {
        return iden;
    }

    public void setIden(Short iden) {
        this.iden = iden;
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