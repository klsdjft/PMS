package com.springmvc.entity;

public class TeacherInfo {
    private Integer tnumber;

    private String tname;

    private String tidentity;

    public Integer getTnumber() {
        return tnumber;
    }

    public void setTnumber(Integer tnumber) {
        this.tnumber = tnumber;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTidentity() {
        return tidentity;
    }

    public void setTidentity(String tidentity) {
        this.tidentity = tidentity;
    }
}