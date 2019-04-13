import javax.swing.plaf.ViewportUI;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CalculatorHandler implements InvocationHandler {

    private Object obj; //被代理类

    public CalculatorHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("in calculatorhandler, before invocation");

        Object ret = method.invoke(obj, args);  //执行被代理类方法

        System.out.println("in calculationhandler, after invocation");
        return ret;
    }


    public static void main(String[] args) {
        HashMap<Integer,Integer> yyy = new HashMap<>();
        Collection<Integer> cccc = new ArrayList<>();
        for (Integer cc : cccc){

        }
        System.out.println(cc());
        ProtectionDomain cc = CalculatorHandler.class.getProtectionDomain();
        CalculatorImpl calculatorImpl = new CalculatorImpl();//被代理类
        CalculatorHandler calculatorHandler = new CalculatorHandler(calculatorImpl);
        Calculator calculator = (Calculator) Proxy.newProxyInstance(calculatorImpl.getClass().getClassLoader(), calculatorImpl.getClass().getInterfaces(), calculatorHandler);
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.minus(1, 2));
    }

    public static int cc() {
        int i = 0;
        try {
            int j = i / 0;
            return i = i + 1;
        } catch (Exception ex) {
            return i = i + 2;
        } finally {
            return i = i + 4;
        }
    }
}