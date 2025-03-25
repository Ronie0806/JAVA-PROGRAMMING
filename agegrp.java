import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[10];

        // Accepting array values (ages)
        System.out.println("Enter the ages of 10 people:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Counting people in different age groups
        int lessThan18 = 0;
        int between18and60 = 0;
        int above60 = 0;

        for (int age : ages) {
            if (age < 18) {
                lessThan18++;
            } else if (age >= 18 && age <= 60) {
                between18and60++;
            } else if (age > 60) {
                above60++;
            }
        }

        // Displaying the results
        System.out.println("\nNumber of people in different age groups:");
        System.out.println("Less than 18: " + lessThan18);
        System.out.println("Between 18 and 60: " + between18and60);
        System.out.println("Above 60: " + above60);
    }
}