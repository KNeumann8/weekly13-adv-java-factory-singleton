package singleton.calculator;

public enum EnumCalcTool {

    INSTANCE;

    private int totalBMICalculated = 0;
    private int numberOfCalculations = 0;

    public double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }

    public double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }

}
