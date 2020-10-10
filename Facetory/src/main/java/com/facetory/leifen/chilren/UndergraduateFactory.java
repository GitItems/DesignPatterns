package com.facetory.leifen.chilren;

import com.facetory.leifen.IFactory;
import com.facetory.leifen.LeiFeng;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.leifen.chilren
 * @ClassName: UndergraduateFactory
 * @Author: MrChen
 * @Date: 2020/10/10 10:31
 */
public class UndergraduateFactory implements IFactory  {
    @Override
    public LeiFeng createLeiFeng() {

        return new Undergraduate();
    }
}
