public class TestClass1 extends TestClass{
    static {
        System.out.println(4444444);
    }

    {
        System.out.println(5555555);
    }
    int i = cccc();

    TestClass1(){
        System.out.println(6666666);
    }

    int cccc(){
        System.out.println(777777);
        return 1;
    }
}
