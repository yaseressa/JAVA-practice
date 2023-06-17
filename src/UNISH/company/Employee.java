package UNISH.company;

public class Employee {
    public int BaseSalary;
    public int HourlyRate;

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0){
            throw new IllegalArgumentException("out of salarybound");
        }
        this.BaseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return HourlyRate;
    }
}
