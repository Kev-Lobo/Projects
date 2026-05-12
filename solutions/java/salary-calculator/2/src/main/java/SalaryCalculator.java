public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped<5 ? 1.0 : (1.0 - (15.0/100.0));
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold == 0 ? 0 : productsSold <20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finlSalry= 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finlSalry<2000.0 ? finlSalry : 2000.0;
    } 
}
