public class BMIValues {
    private String classificationWeight;
    private double minValue;
    private double maxValue;

    public BMIValues(String classificationWeight, double minValue, double maxValue) {
        this.classificationWeight = classificationWeight;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getClassificationWeight() {
        return classificationWeight;
    }

    public void setClassificationWeight(String nameIMC) {
        this.classificationWeight = nameIMC;
    }

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
}
