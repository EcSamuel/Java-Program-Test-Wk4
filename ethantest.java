// import java.util.Arrays;
// import java.util.Scanner;

public class ethantest {
    public static void main(String[] args, int[] num) {
        int[] ages = {3,9,23,64,2,8,28,93};
        System.out.print(ages[ages.length-1]-ages[0]);
        int[] ages2 = new int[9];
        System.out.print(ages2[ages2.length-1]-ages2[0]);
        System.out.print("This will be zero as written if done over ages2");
        int sum =0;
        for (int age : ages) {
            sum += age;
        }
    }
    
}
