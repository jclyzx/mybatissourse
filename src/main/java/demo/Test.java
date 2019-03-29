package demo;

import java.lang.reflect.Proxy;


import demo.poxy.Foo;
import demo.poxy.MyInvocationHandler;


public class Test {
 
 
    public static void main(String[] args) throws Exception {
 
        //设置saveGeneratedFiles值为true生成class字节码到文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
 
        
//        Class<?> proxyClass = Proxy.getProxyClass(Foo.class.getClassLoader(), new Class[]{Foo.class});
//        Foo f = (Foo) proxyClass.getConstructor(InvocationHandler.class).newInstance(new MyInvocationHandler());
//        f.test();
        
        
        Foo f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[] { Foo.class }, new MyInvocationHandler());
        f.test();
    }

}


 