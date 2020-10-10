import entity.Girl;
import proxy.child.Proxy;

/**
 * @ProjectName: Gifts
 * @Package: PACKAGE_NAME
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/9 17:39
 */
public class Test {

    public static void main(String[] args) {

        Girl girl = new Girl();
        girl.setName("美眉");

        Proxy proxy = new Proxy(girl);
        proxy.gifts();

    }
}
