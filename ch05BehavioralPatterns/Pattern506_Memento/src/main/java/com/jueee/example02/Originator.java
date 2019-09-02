package com.jueee.example02;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;


/**
 * 发起者类（持有被备份数据类）
 */
public class Originator {

    // 内部状态
    private String province;
    private String city;
    private String postCode;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    //创建一个备忘录
    public Memento createMemento(){
        try {
            return new Memento(BeanUtils.describe(this));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //从备忘录回复
    public void  backFromMemento(Memento memento){
        try {
            BeanUtils.populate(this, memento.getHashMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    
    
    @Override
    public String toString() {
        return "Originator [province=" + province + ", city=" + city + ", postCode=" + postCode + "]";
    }
}
