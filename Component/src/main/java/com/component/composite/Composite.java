package com.component.composite;

import com.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Component
 * @Package: com.component.composite
 * @ClassName: Composite
 * @Author: MrChen
 * @Date: 2020/10/15 10:50
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);

        for (Component component:
             children) {
            component.display(depth + 2);
        }
    }
}
