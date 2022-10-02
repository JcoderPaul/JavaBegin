package Less_6_myFinalVar.MyClasses;

import Less_6_myFinalVar.ENUM.CoolingSystem;
import Less_6_myFinalVar.ENUM.EngineType;

public class EngineFactory {
    final CoolingSystem engineCoolingSystem;
    EngineType engineType;

    public EngineFactory(CoolingSystem engineCoolingSystem) {
        this.engineCoolingSystem = engineCoolingSystem;
        final String manufacturingFirm = "Typhoon Ltd.";
        if (engineCoolingSystem == CoolingSystem.AIRCOOLING){
            this.engineType = EngineType.V4;
        } else
        if (engineCoolingSystem == CoolingSystem.WATERCOOLING) {
            this.engineType = EngineType.V8;
        } else
        if (engineCoolingSystem == CoolingSystem.SPECIALCOOLING) {
            this.engineType = EngineType.V12;
        }
        System.out.println("Manufacturing firm: " + manufacturingFirm);
    }

    public EngineFactory(EngineType engineType) {
        this.engineType = engineType;
        // Добавляем константу внутрь конструктора.
        final String manufacturingFirm = "Lada Company";
        if (engineType == EngineType.V10 || engineType == EngineType.V10) {
            engineCoolingSystem = CoolingSystem.SPECIALCOOLING;
        } else
        if (engineType == EngineType.V6 || engineType == EngineType.V8) {
            engineCoolingSystem = CoolingSystem.WATERCOOLING;
        } else {
            engineCoolingSystem = CoolingSystem.AIRCOOLING;
        }
        System.out.println("Manufacturing firm: " + manufacturingFirm);
    }

    public void noiseTest(int speed){
        // В методе тоже может содержаться своя константа.
        final int noiseCorrector = 10;
        // Вот такой код уже не работает -> noiseCorrector = 20;
        // т.к. константа задана.
        System.out.println("Noise volume -> " + speed * 10);
    }

    @Override
    public String toString() {
        return "EngineFactory make { " +
                " engineCoolingSystem = " + engineCoolingSystem +
                ", engineType = " + engineType +
                '}';
    }
}
