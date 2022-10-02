package Less_27_myOwnException;

public class Less_27_myOwnException_Less_1 {
    public static void main(String[] args) {
        Less_27_myOwnException_Less_1 less_test = new Less_27_myOwnException_Less_1();
        try {
            less_test.raceCondition(160,30,50);
        } catch (EngineOverheatedException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void raceCondition(int speed, int distance, int temperature) throws EngineOverheatedException {
        if(speed > 120 && temperature > 34){
            throw new EngineOverheatedException("Слишком высокая температура "
                                                + temperature + " и скорость " + speed );
        }
        if (speed > 100 && temperature > 40 && distance > 120){
            throw new TheWheelHasGoneBadException("Слишком тяжелые условия гонки");
        }
        System.out.println("Вы добрались до финиша!");
    }
}
/* Наши исключения являются обычными классами наследниками супер-класса Exception
(над которым есть еще два предка).
*/
class EngineOverheatedException extends Exception {
    public EngineOverheatedException() {
    }
    public EngineOverheatedException(String message) {
        super(message);
    }
}
/* Класс RuntimeException является наследником Exception, но при этом среда разработки
не заставляет нас специальным образом обрабатывать или декларировать наше исключение
в сигнатуре метода в котором оно может вылететь.
*/
class TheWheelHasGoneBadException extends RuntimeException {
    public TheWheelHasGoneBadException() {
    }
    public TheWheelHasGoneBadException(String message) {
        super(message);
    }
}
