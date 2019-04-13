public class CalculatorImpl implements Calculator {

    @Override
    public Integer add(Integer num1, Integer num2) {
        int ret = num1 + num2;
        System.out.println("in calculatorImpl, res: " + ret);
        return ret;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        int ret = num1 - num2;
        System.out.println("int calculatorImpl, res: " + ret);
        return ret;
    }

}
