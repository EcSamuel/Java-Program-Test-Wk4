public class problem13 {
    public static void main(String[] args) {
        double[] income = {1000.00, 1500.00, 2000.00, 1200.00, 1800.00, 2200.00, 1300.00, 1700.00};
        double[] expenses = {800.00, 1200.00, 1500.00, 900.00};

        double totalIncome = calculateTotal(income);
        double totalExpenses = calculateTotal(expenses);

        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpenses);

        proceedsAfterPayments(totalIncome, totalExpenses);
    }

    private static double calculateTotal(double[] amounts) {
        double total = 0.00;
        for (double amount : amounts) {
            total += amount;
        }
        return total;
    }

    private static void proceedsAfterPayments(double totalIncome, double totalExpenses) {
        if (totalIncome > totalExpenses) {
            double profit = totalIncome - totalExpenses;
            System.out.println("You have a profit of $" + profit);
        } else {
            double loss = totalExpenses - totalIncome;
            System.out.println("You have a loss of $" + loss);
        }
    }
}
// the above is probably a very poor way of demonstrating the concept of a true business budget well since we're storing generic income and expenses in an array.
