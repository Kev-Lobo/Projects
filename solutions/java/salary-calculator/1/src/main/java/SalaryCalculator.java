public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped < 5){
            return 1.0;
        }else{
            return 1.0 - (15.0/100.0);
        }
    }

    public int bonusMultiplier(int productsSold) {
        if(productsSold < 20){
            return 10;
        }else if(productsSold == 0) {
            return 0;
        }else{
            return 13;
        }
        // for each sold product 10 units , if 20 or more 13 units
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        
        double finlSalry= 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        if(finlSalry<2000.0){
            return finlSalry;
        }else{
            return 2000.0;
        }
    } 
}
