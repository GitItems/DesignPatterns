package com.template;

/**
 * @ProjectName: Template
 * @Package: com.template
 * @ClassName: TestPaper
 * @Author: MrChen
 * @Date: 2020/10/10 16:49
 */
public abstract class TestPaper {

    public void testQuestion1(){

        System.out.println("杨过得到, 后来给了郭靖, 炼成倚天剑、屠龙刀的玄铁可能是 [] \n a.球磨铸铁\tb.马口铁\tc.高速合金钢\td.碳素纤维");
        System.out.println("答案: " + answer1());
    }

    protected abstract String answer1();


    public void testQuestion2(){

        System.out.println("杨过、程英、陆无双铲除了情花, 造成 [] \n a.使这种植物不能再害人\tb.使一种珍惜物种灭绝\tc.破坏了那个生物圈的生态平衡\td.造成该地区沙漠化");
        System.out.println("答案: " + answer2());
    }

    protected abstract String answer2();


}
