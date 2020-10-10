package proxy.child;

import entity.Girl;
import proxy.Gifts;

/**
 * @ProjectName: Gifts
 * @Package: Gifts.child
 * @ClassName: Pursuer
 * @Author: MrChen
 * @Date: 2020/10/9 17:45
 */
public class Pursuer implements Gifts {

    private Girl girl;

    public Pursuer(Girl girl){
        this.girl = girl;
    }

    @Override
    public void gifts() {
        System.out.println( girl.getName() + ",送你礼物!");
    }
}
