package Less_7_myRefArgMeth;

public class Gun {
    String modelName;
    double caliber;
    double rateOfFire;
    double weightWithoutCartridges;

    public Gun(String modelName, double caliber, double rateOfFire, double weightWithoutCartridges) {
        this.modelName = modelName;
        this.caliber = caliber;
        this.rateOfFire = rateOfFire;
        this.weightWithoutCartridges = weightWithoutCartridges;
    }

    public Gun() {
    }

    @Override
    public String toString() {
        return "Gun => { " +
                " modelName = '" + modelName + '\'' +
                ", caliber = " + caliber +
                ", rateOfFire = " + rateOfFire +
                ", weightWithoutCartridges = " + weightWithoutCartridges +
                '}';
    }
}
