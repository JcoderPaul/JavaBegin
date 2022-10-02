public class myFirstRecursion {
    public static void main(String[] args) {
        myFirstRecursion mRec = new myFirstRecursion();
        mRec.myRecMeth(1,10);

    }

    void myRecMeth(int start,int finish){
        start++;
        if (start <= finish){
            myRecMeth(start,finish);
            System.out.println("Рекурсируем " + start + " шаг");
        }
    }
}
