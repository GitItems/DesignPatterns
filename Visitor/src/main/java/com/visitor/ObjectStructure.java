package com.visitor;

import com.visitor.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor
 * @ClassName: ObjectStructure
 * @Author: MrChen
 * @Date: 2020/10/26 18:32
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    public void attach(Person element){
        elements.add(element);
    }

    public void detach(Person element){
        elements.remove(element);
    }
    public void display(Action action){
        for (Person element : elements) {
            element.accept(action);
        }
    }
}
