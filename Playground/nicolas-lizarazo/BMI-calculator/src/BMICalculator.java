
public class BMICalculator {
    private static final BMIValues[] BMI_VALUES = new BMIValues[]{
            new BMIValues("Underweight", 0, 18.4),
            new BMIValues("Normal weight", 18.5, 24.9),
            new BMIValues("Overweight", 25.0, 29.9),
            new BMIValues("Obesity Class I", 30.0, 34.9),
            new BMIValues("Obesity Class II", 35.0, 39.9),
            new BMIValues("Obesity Class III", 40.0, Double.MAX_VALUE)};

    public BMICalculator() {
    }

    public String calculateBMI(double height, double weight) {
        if (height < 0 || weight < 0) throw new Error("Negative values are not allowed");
        double heightSquared = Math.pow(height, 2);
        double BMIValue = weight / heightSquared;
        return findClassification(BMIValue);
    }

    private String findClassification(double BMIValue) {
        int i = 0;
        while (i < BMI_VALUES.length) {
            if ( BMI_VALUES[i].getMaxValue() >= BMIValue ) return BMI_VALUES[i].getClassificationWeight();
            i++;
        }
        throw new Error("Value not found");
    }
}