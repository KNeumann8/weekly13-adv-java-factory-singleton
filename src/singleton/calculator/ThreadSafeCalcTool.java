package singleton.calculator;

public class ThreadSafeCalcTool {

    private volatile static ThreadSafeCalcTool instance;

    private static int totalBMICalculated;
    private static int numberOfCalculations;

    private ThreadSafeCalcTool(){
        totalBMICalculated = 0;
        numberOfCalculations = 0;
    }

    public static ThreadSafeCalcTool getInstance(){
        if(instance==null){
            synchronized (ThreadSafeCalcTool.class){
                if(instance==null){
                    instance = new ThreadSafeCalcTool();
                }
            }
        }
        return instance;
    }

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
