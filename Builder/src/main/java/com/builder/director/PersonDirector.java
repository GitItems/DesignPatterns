package com.builder.director;

import com.builder.PersonBuilder;

/**
 * @ProjectName: Builder
 * @Package: com.builder.director
 * @ClassName: PersonDirector
 * @Author: MrChen
 * @Date: 2020/10/12 15:10
 * 指挥者
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder processBuilder){
        this.personBuilder = processBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
