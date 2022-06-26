package application;

import entities.Competitors;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class JungleRun {

    private static final int MINIMUM_AGE = 18;
    private static final Double MINIMUM_VALUE_AGE = 1300.00;
    private static final double MAXIMUM_VALUE_AGE = 1500.00;
    private static final double MINIMUM_MEDIUM_VALUE_AGE = 2000.00;
    private static final double MAXIMUM_MEDIUM_VALUE_AGE = 2300.00;
    private static final double MAXIMUM_ADVANCED_VALUE_AGE = 2800.00;

    public static void main(String[] args) {

        // Input number of participants
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of runners:");

        int number_runners = sc.nextInt();
        List<Competitors> list = new ArrayList<>();

        for (int i = 0; i < number_runners; i++) {

            int participant_number = i + 1;
            System.out.println("Participant #: " + participant_number);
            System.out.println("Category: ");
            System.out.print("1 - small | 2 - medium | 3 - advanced: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter RG data: ");
            int document = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Phone number: XX-12345 6789: ");
            String phone_number = sc.nextLine();

            System.out.print("Enter Emergency Phone number: XX-12345 6789: ");
            String phone_emergency = sc.nextLine();

            System.out.println("Enter blood group: 'A | AB | O': ");
            String blood_group = sc.nextLine();

            if (choice == 3 && age > MINIMUM_AGE) {
                System.out.println("Enrollment is not allowed for minors under 18 years old. for this category");
                continue;
            }

            Double valuePremium = getPremiumValue(choice, age);

            list.add(new Competitors(name, age, document, phone_number, phone_emergency, blood_group, valuePremium));

        }

        System.out.println("List of participants and registration fees.");
        for (Competitors competitors : list) {
            System.out.println(competitors);
        }

        sc.close();

    }


    public static double getPremiumValue(int choice, int age) {

        Double valuePremium = null;

        switch (choice) {
            case 1:
                valuePremium = age < MINIMUM_AGE ? MINIMUM_VALUE_AGE : MAXIMUM_VALUE_AGE;
                break;
            case 2:
                valuePremium = age < MINIMUM_AGE ? MINIMUM_MEDIUM_VALUE_AGE : MAXIMUM_MEDIUM_VALUE_AGE;
                break;
            case 3:
                valuePremium = MAXIMUM_ADVANCED_VALUE_AGE;
                break;
        }

        return valuePremium;
    }


}
