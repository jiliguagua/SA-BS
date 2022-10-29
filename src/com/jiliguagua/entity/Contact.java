package com.jiliguagua.entity;

public class Contact {
    private int cNo;
    private String vName;
    private String cSex;
    private String dBirth;
    private String cPhone;
    private String vEmail;

    public Contact(String vName, String cSex, String dBirth, String cPhone, String vEmail) {
        this.vName = vName;
        this.cSex = cSex;
        this.dBirth = dBirth;
        this.cPhone = cPhone;
        this.vEmail = vEmail;
    }

    public Contact(int cNo, String vName, String cSex, String dBirth, String cPhone, String vEmail) {
        this.cNo = cNo;
        this.vName = vName;
        this.cSex = cSex;
        this.dBirth = dBirth;
        this.cPhone = cPhone;
        this.vEmail = vEmail;
    }

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex;
    }

    public String getdBirth() {
        return dBirth;
    }

    public void setdBirth(String dBirth) {
        this.dBirth = dBirth;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getvEmail() {
        return vEmail;
    }

    public void setvEmail(String vEmail) {
        this.vEmail = vEmail;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cNo=" + cNo +
                ", vName='" + vName + '\'' +
                ", cSex='" + cSex + '\'' +
                ", dBirth='" + dBirth + '\'' +
                ", cPhone='" + cPhone + '\'' +
                ", vEmail='" + vEmail + '\'' +
                '}';
    }
}
