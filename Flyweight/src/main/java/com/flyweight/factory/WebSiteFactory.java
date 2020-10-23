package com.flyweight.factory;

import com.flyweight.WebSite;
import com.flyweight.children.website.ConcreteWebsite;

import java.util.Hashtable;

/**
 * @ProjectName: Flyweight
 * @Package: com.flyweight.factory
 * @ClassName: WebSiteFactory
 * @Author: MrChen
 * @Date: 2020/10/23 17:06
 */
public class WebSiteFactory {

    private Hashtable flyweights = new Hashtable();

    public WebSite getWebSiteCategory(String key){

        if (!flyweights.containsKey(key)){
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return (WebSite) flyweights.get(key);
    }

    public int getWebSiteCount(){
        return flyweights.size();
    }
}
