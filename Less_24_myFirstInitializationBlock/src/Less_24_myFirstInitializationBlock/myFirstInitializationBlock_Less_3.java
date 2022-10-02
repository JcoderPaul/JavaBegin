package Less_24_myFirstInitializationBlock;

public class myFirstInitializationBlock_Less_3 {
    public static void main(String[] args) {
        System.out.println("Start maim method of myFirstInitializationBlock_Less_3 ");
        TestOutputStaticBlock tosb = new TestOutputStaticBlock();

    }
}

class TestOutputStaticBlock{
    String str = "All ok!";
    {
        System.out.println(str);
    }
    static int i = 0;
    static {
        System.out.println(i);
    }
    {i += 1;
        System.out.println(i);}

    public TestOutputStaticBlock() {
        System.out.println("The constructor works");
    }
}