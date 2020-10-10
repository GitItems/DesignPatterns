package proxy.child;

import entity.Girl;
import proxy.Gifts;
import proxy.child.Pursuer;

/**
 * @ProjectName: Proxy
 * @Package: proxy
 * @ClassName: Proxy
 * @Author: MrChen
 * @Date: 2020/10/9 17:47
 */
public class Proxy implements Gifts {

    private Pursuer pursuer;

    public Proxy(Girl girl){
        this.pursuer = new Pursuer(girl);
    }

    @Override
    public void gifts() {
        if (pursuer != null) {
            pursuer.gifts();
        }
    }
}
