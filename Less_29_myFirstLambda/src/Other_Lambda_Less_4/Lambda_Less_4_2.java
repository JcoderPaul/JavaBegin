package Other_Lambda_Less_4;

public class Lambda_Less_4_2 {
    public static void main(String[] args) {
        StrangeCalculator str_calc = new StrangeCalculator();
        str_calc.calculate(4, 8, new GetBackInt() {
            @Override
            public int doSomethingForRes() {
                int int_1 = str_calc.getInt_1();
                int int_2 = str_calc.getInt_2();
                return int_1 + int_2;
            }
        });
        System.out.println("---------------------------------------------------------------------");
        int int_1 = 6;
        int int_2 = 8;
        str_calc.calculate(int_1,int_2,() ->{return int_1 - int_2;});
    }
}

interface GetBackInt{
    int doSomethingForRes(); // Метод без аргументов
}

class StrangeCalculator{
    int int_1;
    int int_2;
    void calculate(int int_1, int int_2, GetBackInt gbn){
        this.int_1 = int_1;
        this.int_2 = int_2;
        System.out.println(gbn.doSomethingForRes());
    }

    public int getInt_1() {
        return int_1;
    }

    public void setInt_1(int int_1) {
        this.int_1 = int_1;
    }

    public int getInt_2() {
        return int_2;
    }

    public void setInt_2(int int_2) {
        this.int_2 = int_2;
    }
}