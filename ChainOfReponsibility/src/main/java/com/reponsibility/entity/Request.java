package com.reponsibility.entity;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility.entity
 * @ClassName: Request
 * @Author: MrChen
 * @Date: 2020/10/23 8:50
 */
public class Request {

    private String type;

    private String content;

    private int number;

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
