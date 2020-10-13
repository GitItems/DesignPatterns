package com;

import com.builder.PersonBuilder;
import com.builder.children.PersonFat;
import com.builder.children.PersonThin;
import com.builder.director.PersonDirector;

/**
 * @ProjectName: Builder
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/12 14:33
 */
public class Test {

    public static void main(String[] args) {

        PersonDirector personDirector = new PersonDirector(new PersonThin());
        personDirector.createPerson();
    }
}
