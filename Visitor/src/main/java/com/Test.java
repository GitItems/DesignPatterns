package com;

import com.visitor.ObjectStructure;
import com.visitor.children.Amativeness;
import com.visitor.children.Failing;
import com.visitor.children.Success;
import com.visitor.entity.children.Man;
import com.visitor.entity.children.Woman;

/**
 * @ProjectName: Visitor
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/26 18:23
 */
public class Test {

    public static void main(String[] args) {

        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success success = new Success();
        o.display(success);

        Failing failing = new Failing();
        o.display(failing);

        Amativeness amativeness = new Amativeness();
        o.display(amativeness);
    }
}
