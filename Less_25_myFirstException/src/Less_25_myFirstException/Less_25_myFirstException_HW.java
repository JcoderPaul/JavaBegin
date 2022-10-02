package Less_25_myFirstException;

public class Less_25_myFirstException_HW {
    public static void main(String[] args) {
        Tiger tiger_1 = new Tiger();
        tiger_1.eat("meat");
        try{
            tiger_1.drink("water");
            try{
                tiger_1.drink("Russian vodka");
            } catch (NotWaterException nwexep){
                System.out.println(nwexep.getMessage());
            } catch (Exception exp){
                System.out.println(exp.getMessage());
            } finally {
                System.out.println("Inner finally block worked");
            }
            // Тут тоже последовательность важна (наследники -> родители)
        }catch (RuntimeException rex){
            System.out.println(rex.getMessage());
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
class Tiger {
    public void eat(String food) throws NotMeatException {
        if(!food.equals("meat")){
            throw new NotMeatException("Tiger do not eat " + food);
        }
        System.out.println("Tiger likes meat");
    }
    /*
    Метод способен выбросить исключение NotWaterException, которое стоит ниже
    по иерархии исключений, чем Exception, а значит в блоках try-catch может
    находиться раньше родителя в мультикэтчах.
    */
    public void drink(String liquid) throws NotWaterException {
        if(!liquid.equals("water")){
            throw new NotMeatException("Tiger do not drink " + liquid);
        }
        System.out.println("Tiger likes water");
    }
}

// Наш класс исключение наледует RuntimeException
class NotMeatException extends RuntimeException{
    public NotMeatException(String food) {
        super(food);
    }
}
// Наш класс исключение наледует Exception
class NotWaterException extends Exception{
    public NotWaterException(String liquid) {
        super(liquid);
    }
}