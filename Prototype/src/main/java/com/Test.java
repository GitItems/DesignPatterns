package com;

import com.prototype.entity.Prototype;
import com.prototype.entity.Resumes;

import java.util.HashMap;

/**
 * @ProjectName: Prototype
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/10 14:31
 */
public class Test {

    public static void main(String[] args) {
        Resumes resumesA = new Resumes("菜菜");
        resumesA.setPersonalInfo("男","25");
        resumesA.setWorkExperience("2018-2020", "NN企业");


        Resumes resumesB = resumesA.cloneNew();
        resumesB.setWorkExperience("2000-2020","NN公司");

        Resumes resumesC = resumesB.cloneNew();
        resumesC.setPersonalInfo("男", "23");

        resumesA.display();
        resumesB.display();
        resumesC.display();
    }
}
