public class Main {

    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(100,.2,.08);
        System.out.println(groupTotalMealCost);

        double individualMealPrice = groupTotalMealCost / 5;
        System.out.println(individualMealPrice);
    }

}
