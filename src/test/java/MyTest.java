import com.itqf.MyMaven;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description:
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2020/9/21
 * @Time: 上午10:16
 */
public class MyTest {





    @After  // @Test  修饰的方法后执行
    public  void after(){
        System.out.println("after");
    }


    @Test   //常用   测试修饰的方法   通过绿颜色   有异常：红颜色
    public  void testMyMaven(){
        MyMaven myMaven = new MyMaven();
       String result =  myMaven.sayHi("maven");
        System.out.println(result);

    }


    // @Test  修饰的方法前执行
    @Before
    public  void init(){
        System.out.println("init");
    }

}
