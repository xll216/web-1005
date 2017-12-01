/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class Test {

    private int i = getValue();
    private int j = 10;

    int getValue() {
        return j;
    }

    public static void main(String[] args) {
        System.out.println(new Test().i);
    }
}
