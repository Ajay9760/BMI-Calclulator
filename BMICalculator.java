public class BMICalculator {

    double weightInPo;
    double WeightInKi;
    double HeightInInches;
    double HeightInMetres;


    public BMICalculator() {
        this.weightInPo = 180;
        this.WeightInKi = 78;
        this.HeightInInches = 80;
        this.HeightInMetres = 1.78;
    }

    public double calculateBmiImperial(double weightInPo, double HeightInInches) {
        this.weightInPo=weightInPo;
        this.HeightInInches=HeightInInches;
        return (this.weightInPo * 703) / (this.HeightInInches * this.HeightInInches);

    }

    public double calculateBmiMetric(double WeightInKi, double HeightInMetres) {
        this.WeightInKi=WeightInKi;
        this.HeightInMetres=HeightInMetres;
        return (this.WeightInKi) / (HeightInMetres *HeightInMetres);
    }

    public String getBMICategory(double bmi) {

        if (bmi < 18.5) {
            return "UnderWeight";
        } else if (bmi < 25 && bmi > 18.5) {
            return "Normal Weight";
        }else if (bmi < 30 && bmi > 25){
            return "Overweight";
        }else{
            return "Obese";
    }
}

}
