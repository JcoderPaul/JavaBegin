package Less_6_myFinalVar;

import Less_6_myFinalVar.ENUM.CoolingSystem;
import Less_6_myFinalVar.ENUM.EngineType;
import Less_6_myFinalVar.MyClasses.EngineFactory;

public class EngineFinalApp {
    public static void main(String[] args) {
        EngineFactory myEngineFirst = new EngineFactory(CoolingSystem.SPECIALCOOLING);
        System.out.println(myEngineFirst);
        myEngineFirst.noiseTest(10);
        EngineFactory mySecondEngine = new EngineFactory(EngineType.V6);
        System.out.println(mySecondEngine);
        mySecondEngine.noiseTest(40);
    }
}
