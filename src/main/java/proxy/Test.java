package proxy;

import org.apache.commons.lang3.builder.ToStringExclude;

import java.lang.reflect.Proxy;

/**
 * @author xiaolei
 * @Title: Test
 * @ProjectName interview
 * @Description: TODO
 * @date 4/3/20209:18 PM
 */

public class Test {

    public static void main(String[] args){
        TestInvocationHandler testInvocationHandler = new TestInvocationHandler(new TargetProxy());
        Class[] classes = new Class[1];
        classes[0] = TargetProxyInterface.class;
        TargetProxyInterface proxyInstance = (TargetProxyInterface)Proxy.newProxyInstance(TargetProxyInterface.class.getClassLoader(), classes, testInvocationHandler);
        proxyInstance.test();
    }
}
