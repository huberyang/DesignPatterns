package com.hy.memento;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class TbRow {

    private String name;
    private String age;
    private char sex;

    public TbRow(String name, String age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Backup backup(){
        BackupManagr.backup=new Backup(name,age,sex);
        return BackupManagr.backup;
    }

    public void rowback(){
        this.name=BackupManagr.backup.getName();
        this.age=BackupManagr.backup.getAge();
        this.sex=BackupManagr.backup.getSex();
    }

    public void displayRow(){
        System.out.println("Name: "+name+" Age: "+age+" sex: "+sex);
    }
}
