public class Main {

    public static void main(String[] args) {
        double salary = calculateGrossYearlySalary(40, 50, 7);
        System.out.println(salary);
    }

    public static double calculateGrossYearlySalary(double weeklyHours,
                                                    double hourlyWage,
                                                    int vacationDays){
        if (weeklyHours < 0){
            return -1;
        }
        if (hourlyWage < 0){
            return -1;
        }
        return weeklyHours * hourlyWage * 52 - (vacationDays * 8 * hourlyWage);
    }
}
