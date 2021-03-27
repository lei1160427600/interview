package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaolei
 * @Title: TestInvocationHandler
 * @ProjectName interview
 * @Description: TODO
 * @date 4/3/20209:09 PM
 */
public class TestInvocationHandler implements InvocationHandler {

    private Object target;

    public TestInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=============before");
        Object object = method.invoke(target, args);
        System.out.println("=============after");
        return object;
    }
}
