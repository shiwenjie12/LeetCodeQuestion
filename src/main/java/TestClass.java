public class TestClass {
    static {
        System.out.println(11111);
    }

    {
        System.out.println(22222);
    }
    int cc = cccc1();

    TestClass()
    {
        System.out.println(333333);
    }

    int cccc1(){
        System.out.println(88888);
        return 1;
    }
}

