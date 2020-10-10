package com;

import com.decorate.Person;
import com.decorate.child.Jeans;
import com.decorate.child.Pants;
import com.decorate.child.Shoes;
import com.decorate.child.TShirt;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ProjectName: Facetory
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/9/27 17:12
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person("彭于晏");

        System.out.println("第一种装扮:");
        Pants pants = new Pants();
        TShirt tshirt = new TShirt();
        Jeans jeans = new Jeans();
        Shoes shoes = new Shoes();

        pants.decorate(person);
        tshirt.decorate(pants);
        jeans.decorate(tshirt);
        shoes.decorate(jeans);

        shoes.show();

    }
}
