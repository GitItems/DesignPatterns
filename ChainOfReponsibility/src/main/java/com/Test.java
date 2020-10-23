package com;

import com.reponsibility.Handler;
import com.reponsibility.children.ConcreteHandler1;
import com.reponsibility.children.ConcreteHandler2;
import com.reponsibility.children.manager.CommonManager;
import com.reponsibility.children.manager.GeneralManager;
import com.reponsibility.children.manager.MajordomoManager;
import com.reponsibility.entity.Request;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/22 17:38
 */
public class Test {

    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("经理");
        MajordomoManager zongjian = new MajordomoManager("总监");
        GeneralManager zhongjingli = new GeneralManager("总经理");
        jinli.setSuperior(zongjian);
        jinli.setSuperior(zhongjingli);

        Request request = new Request();
        request.setType("请假");
        request.setContent("小菜感冒不太舒服请假");
        request.setNumber(2);
        jinli.requestApplications(request);

        Request request2 = new Request();
        request2.setType("请假");
        request2.setContent("小菜出去旅游");
        request2.setNumber(8);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setType("加薪");
        request3.setContent("小菜申请加薪");
        request3.setNumber(500);
        jinli.requestApplications(request3);


    }
}
