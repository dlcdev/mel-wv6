package application;

import entities.Competitors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppJungleRun {

    private static final int MINIMUM_AGE = 18;

    public static void main(String[] args) {

        boolean switchedOn = true;
        List<Competitors> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int participantNumber = 0;

        while (switchedOn) {
            // Input number of participants
            System.out.print("Number of runners: ");
            int numberRunners = sc.nextInt();

            for (int i = 0; i < numberRunners; i++) {

                participantNumber += 1;
                System.out.println("Participant #: " + participantNumber);
                System.out.println("Category: ");
                System.out.print("1 - small | 2 - medium | 3 - advanced: ");
                int choice = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter name: ");
                String name = sc.nextLine();

                if (Competitors.isParticipantExists(name, list)) {
                    // Check that existing competitors
                    continue;
                }

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                if (choice == 3 && age < MINIMUM_AGE) {
                    System.out.println("Enrollment is not allowed for minors under 18 years old. for this category");
                    continue;
                }

                System.out.print("Enter RG data: ");
                int document = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Phone number: XX-12345 6789: ");
                String phoneNumber = sc.nextLine();

                System.out.print("Enter Emergency Phone number: XX-12345 6789: ");
                String phoneEmergency = sc.nextLine();

                System.out.println("Enter blood group: 'A | AB | O': ");
                String bloodGroup = sc.nextLine();

                Double valueFee = Competitors.getTheRegistrationFee(choice, age, MINIMUM_AGE);

                list.add(new Competitors(
                        participantNumber,
                        name,
                        age,
                        document,
                        phoneNumber,
                        phoneEmergency,
                        bloodGroup,
                        valueFee
                ));

            }


            getListParticipant(list);

            System.out.println("Close program | 'y' - yes | 'n' -no");
            System.out.println("Remove participant: 'r': ");
            char choice = sc.next().charAt(0);
            switchedOn = accessMenu(choice, switchedOn, list, sc);


        }

        sc.close();

    }

    private static boolean accessMenu(char choice, boolean switchedOn, List<Competitors> list, Scanner sc) {
        if (choice == 'y' || choice == 'Y') {
            switchedOn = false;
            System.out.println("Finish the program!");
        } else if (choice == 'r' || choice == 'R') {
            getListParticipant(list);
            System.out.println("Enter number to remove:");
            int numberRemove = sc.nextInt();
            if (!list.isEmpty())
                list.remove((numberRemove - 1));
            System.out.println("Success remove!");
        }
        return switchedOn;
    }

    private static void getListParticipant(List<Competitors> list) {
        System.out.println("List of participants and registration fees.");
        for (Competitors comp : list) {
            System.out.println(comp);
        }
    }


}
