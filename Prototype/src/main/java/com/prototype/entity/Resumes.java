package com.prototype.entity;

import com.prototype.IPrototype;

/**
 * @ProjectName: Prototype
 * @Package: com.prototype.entity
 * @ClassName: Resumes
 * @Author: MrChen
 * @Date: 2020/10/10 14:41
 */
public class Resumes implements IPrototype {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resumes(String name){
        this.name = name;
    }


    public void setPersonalInfo(String sex, String age){

        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company){

        this.timeArea = timeArea;
        this.company = company;
    }

    public void display(){
        System.out.println(name + sex + age);
        System.out.println("工作经历: " + timeArea + company);
    }


    /**
     * @Param: []
     * @Return: com.prototype.entity.Prototype
     * @Author: we
     * @Date: 2020/10/10 14:35
     * 通过clone 可手动添加引用类型，避免直接复制引用地址导致引用类型为null
     */
    @Override
    public Resumes cloneNew() {

        Resumes resumes = new Resumes(this.name);
        resumes.company = this.company;
        resumes.timeArea = this.timeArea;
        resumes.sex = this.sex;
        resumes.age = this.age;
        return resumes;
    }
}
