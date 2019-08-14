package com.jueee.example03;

import java.util.Date;

public class Monkey implements Cloneable {
    // 身高
    private int height;
    // 体重
    private int weight;
    // 生日
    private Date birthDate;
    // 金箍棒
    private GoldRingedStaff staff;

    /**
     * 构造函数
     */
    public Monkey() {
        this.birthDate = new Date();
        this.staff = new GoldRingedStaff();
    }

    /**
     * 克隆方法
     */
    public Object clone() {
        Monkey temp = null;
        try {
            temp = (Monkey)super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            return temp;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }

}
