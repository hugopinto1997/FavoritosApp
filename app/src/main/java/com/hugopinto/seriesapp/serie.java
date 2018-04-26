package com.hugopinto.seriesapp;

import java.io.Serializable;

public class serie implements Serializable {
    private String name;
    private String caps;
    private int img;
    private String desc;
    private boolean check;


    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }


    public serie(String name, String caps, int img, String desc, boolean check) {
        this.name = name;
        this.caps = caps;
        this.img = img;
        this.desc = desc;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaps() {
        return caps;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
