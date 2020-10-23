package com.component.leaf;

import com.component.Component;

/**
 * @ProjectName: Component
 * @Package: com.component.leaf
 * @ClassName: Leaf
 * @Author: MrChen
 * @Date: 2020/10/15 10:47
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
