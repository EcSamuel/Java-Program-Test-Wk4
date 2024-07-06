import java.util.Arrays;

public class ethanTest {
    public static void main(String[] args) {
        // 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3,9,23,64,2,8,28,93};
        // a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
        System.out.println(ages[ages.length-1]-ages[0]);
        // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
        int[] ages2 = new int[9];
        // i. Make sure that there are 9 elements of type int in this new array.
        ages2[0] = 1;
        ages2[1] = 1;
        ages2[2] = 3;
        ages2[3] = 5;
        ages2[4] = 9;
        ages2[5] = 13;
        ages2[6] = 18;
        ages2[7] = 24;
        ages2[8] = 33;
        // ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
        System.out.println(ages2[ages2.length-1]-ages2[0]);
        // iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
        System.out.println(ages2[ages.length-1]-ages2[0]);
        // I'll note that the "ages.length-1" is not a typo. I wasn't sure how to properly express that other than that ages is a different length, which shows it dynamically?
        // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        int sum =0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum /ages.length;
        System.out.println("Ages Average: " + average);
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }
        double nameLengthAvg = (double) totalLength / names.length;
        System.out.println("Average Name Length: " +nameLengthAvg);
// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        String listaNames = "";
        for (String name : names) {
            listaNames += name + ", ";
        }
        System.out.println(listaNames);
        // 3. How do you access the last element of any array?
            System.out.println("arr[arr.length-1]");
        // 4. How do you access the first element of any array?
            System.out.println("arr[0]");
        // 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        System.out.println(Arrays.toString(nameLengths));
        // 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int nameLengthsSum = 0;
        for (int length : nameLengths) {
            nameLengthsSum += length;
        }
        System.out.println("Sum of all name lengths: " + nameLengthsSum);
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
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    private static boolean isSumGreaterThan100(int[] arr) {
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return arrSum > 100;
    }
    // 10. Write a method that takes an array of double and returns the average of all the elements in the array.
    private static double calculateAverage(double[] amounts) {
        double sum = 0.00;
        for (double amount : amounts) {
            sum += amount;
        }
        return sum / amounts.length;
    }
    // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    private static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
        double arr1Avg = calculateAverage(arr1);
        double arr2Avg = calculateAverage(arr2);
        return arr1Avg > arr2Avg;
    }
    // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside == true && moneyInPocket > 10.50;
    }
}
