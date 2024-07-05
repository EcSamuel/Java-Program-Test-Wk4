public class ethanTest {
    public static void main(String[] args, int[] num) {
        // 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3,9,23,64,2,8,28,93};
        // a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
        System.out.print(ages[ages.length-1]-ages[0]);
        // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
        int[] ages2 = new int[9];
        // i. Make sure that there are 9 elements of type int in this new array.

        // ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
        System.out.print(ages2[ages2.length-1]-ages2[0]);
        // iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

        // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        System.out.print("This will be zero as written if done over ages2");
        int sum =0;
        for (int age : ages) {
            sum += age;
        }

        double average = (double) sum /ages.length;

        System.out.println("Ages Average: " + average);
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        for (String name : names) {
            int length = name.length();
            System.out.println(length);
        }
// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        String listaNames = "";
        for (String name : names) {
            listaNames += name + ", ";
        }
        System.out.println(listaNames);
// 3. How do you access the last element of any array?
    // arr[arr.length-1]
// 4. How do you access the first element of any array?
    // arr[0]
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
    }
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
    for (int length : nameLengths) {
        System.out.println(length);
    }
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    public static String repeatWord(String word, int n) {
        String concatWord = "";
        for (int i = 0; i < n; i++) {
            concatWord += word;
        }
        return concatWord;
    }
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

// 10. Write a method that takes an array of double and returns the average of all the elements in the array.

// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        private boolean weighValues(double[] arr1, double[] arr2) {
            double arr1Avg= 0.00;
            for (double value : arr1) {
                arr1Avg+= value;
            }
            arr1Avg /= arr1.length;
            double arr2Avg= 0.00;
            for (double value : arr2) {
                arr2Avg+= value;
            }
            arr2Avg/= arr2.length;
            if ( arr1 > arr2) {
                return true;
            }
        }
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        private boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
            if (isHotOutside == true && moneyInPocket > 10.50) {
                return true;
            }
        }
    }
}
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
public class FinancialCalculator {
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
