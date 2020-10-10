package com.facetory.leifen.chilren;

import com.facetory.leifen.IFactory;
import com.facetory.leifen.LeiFeng;

/**
 * @ProjectName: Facetory
 * @Package: com.facetory.leifen.chilren
 * @ClassName: VolunteerFactory
 * @Author: MrChen
 * @Date: 2020/10/10 10:32
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
