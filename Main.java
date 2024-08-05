import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a Menu:");
        System.out.println("1. Beef");
        System.out.println("2. Pork");
        System.out.println("3. Chicken");
        System.out.println("4. Salad");
        System.out.println("5. Refreshments");
        System.out.println("6. Chips");
        System.out.println("7. Combo");

    int menu = scanner.nextInt();

    if (menu >= 1 && menu <= 7){
    switch (menu) {

        case 1:
            System.out.println("Beef menu");
            System.out.println("1. Beef stew");
            System.out.println("2. Beef steak");
            System.out.println("3. Cow heels");
            System.out.println("4. Skopo");
            System.out.println("5. Muhodi");
            System.out.println("6. Oxtail");
            int beef = scanner.nextInt();
            if (beef >= 1 && beef <= 6) {
                switch (beef) {
                    case 1:
                        System.out.println("Beef stew");
                        System.out.println("1. Beef stew with pap R70");
                        System.out.println("2. Beef stew with extra pap R100");
                        System.out.println("3. Beef stew with rice R50");
                        System.out.println("4. Beef stew with Rolls R45");
                        System.out.println("5. Beef stew R35");
                        int Stew = scanner.nextInt();
                        if (Stew >= 1 && Stew <= 5) {
                            switch (Stew) {
                                case 1:
                                    System.out.println("Beef stew with pap R70");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Beef stew with extra pap R100");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 &&option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Beef stew with rice R50");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option1 = scanner.nextInt();
                                    if (option1 >=1 && option1 <= 3) {
                                        switch (option1) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Beef stew with Rolls R45");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option2 = scanner.nextInt();
                                    if (option2 >= 1 && option2 <= 3) {
                                        switch (option2) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Beef stew R35");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option3 = scanner.nextInt();
                                    if (option3 >= 1 && option3 <= 3) {
                                        switch (option3) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }

                        break;
                    case 2:
                        System.out.println("Beef steak");
                        System.out.println("1. Beef steak with pap R80");
                        System.out.println("2. Beef steak with extra pap R110");
                        System.out.println("3. Beef steak with rice R60");
                        System.out.println("4. Beef steak with Rolls R55");
                        System.out.println("5. Beef steak R45");
                        int steak = scanner.nextInt();
                        if (steak >= 1 && steak <= 5) {
                            switch (steak) {
                                case 1:
                                    System.out.println("Beef steak with pap R80");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >=1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Beef steak with extra pap R110");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Beef steak with rice R60");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option1 = scanner.nextInt();
                                    if (option1 >= 1 && option1 <= 3) {
                                        switch (option1) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Beef steak with Rolls R55");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option2 = scanner.nextInt();
                                    if (option2 >= 1 && option2 <= 3) {
                                        switch (option2) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Beef steak R45");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option3 = scanner.nextInt();
                                    if (option3 >= 1 && option3 <= 3) {
                                        switch (option3) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 3:
                        System.out.println("Cow heels");
                        System.out.println("1. Cow heels with pap R50");
                        System.out.println("2. Cow heels with extra pap R60");
                        System.out.println("3. Cow heels R35");
                        int heels = scanner.nextInt();
                        if (heels >= 1 && heels <= 3) {
                            switch (heels) {
                                case 1:
                                    System.out.println("Cow heels with pap R50");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Cow heels with extra pap R60");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Cow heels R35");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option1 = scanner.nextInt();
                                    if (option1 >= 1 && option1 <= 3) {
                                        switch (option1) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 4:
                        System.out.println("Skopo");
                        System.out.println("1. Skopo with pap R40");
                        System.out.println("2. Skopo R30");
                        int Skopo = scanner.nextInt();
                        if (Skopo >= 1 && Skopo <= 2) {
                            switch (Skopo) {
                                case 1:
                                    System.out.println("Skopo with pap R40");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Skopo R30");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 5:
                        System.out.println("Muhodi");
                        System.out.println("1. Muhodi with pap R45");
                        System.out.println("2. Muhodi R35");
                        int Muhodi = scanner.nextInt();
                        if (Muhodi >= 1 && Muhodi <= 2) {
                            switch (Muhodi) {
                                case 1:
                                    System.out.println("Muhodi with pap R45");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Muhodi R35");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 6:
                        System.out.println("Oxtail");
                        System.out.println("1. Oxtail with pap R150");
                        System.out.println("2. Oxtail R135");
                        int Oxtail = scanner.nextInt();
                        if (Oxtail >= 1 && Oxtail <= 2) {
                            switch (Oxtail) {
                                case 1:
                                    System.out.println("Oxtail with pap R150");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Oxtail R135");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("2. Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("3. Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
            }
            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }
            break;
        case 2:
            System.out.println("Pork menu");
            System.out.println("1. Pork steak R65");
            System.out.println("2. Pork Rips R170");
            System.out.println("3. Pork ADOBO R100");
            System.out.println("4. Pork Pochero R70");
            System.out.println("5. Pork Menudo R105");
            int Pork = scanner.nextInt();
            if (Pork >= 1 && Pork <= 5) {
                switch (Pork) {
                    case 1:
                        System.out.println("Pork steak Menu");
                        System.out.println("1. Pork steak with pap R75");
                        System.out.println("2. Pork steak R65");

                        int steakPork = scanner.nextInt();
                        if (steakPork >= 1 && steakPork <= 2) {
                            switch (steakPork) {
                                case 1:
                                    System.out.println("Pork steak with pap");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pork steak");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }

                        break;
                    case 2:
                        System.out.println("Pork Rips Menu");
                        System.out.println("1. Pork Rips with pap R180");
                        System.out.println("2. Pork Rips rice R190");
                        System.out.println("3. Pork Rips with Rolls R200");
                        System.out.println("4. Pork Rips R170");
                        int Rips = scanner.nextInt();
                        if (Rips >= 1 && Rips <= 4) {
                            switch (Rips) {
                                case 1:
                                    System.out.println("Pork Rips with pap");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pork Rips rice");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Pork Rips with Rolls");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option1 = scanner.nextInt();
                                    if (option1 >= 1 && option1 <= 3) {
                                        switch (option1) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Pork Rips");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option2 = scanner.nextInt();
                                    if (option2 >= 1 && option2 <= 3) {
                                        switch (option2) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 3:
                        System.out.println("Pork ADOBO Menu");
                        System.out.println("1. Pork ADOBO with pap R110");
                        System.out.println("2. Pork ADOBO with Rice R120");
                        System.out.println("3. Pork ADOBO R100");
                        int ADOBO = scanner.nextInt();
                        if (ADOBO >= 1 && ADOBO <= 3) {
                            switch (ADOBO) {
                                case 1:
                                    System.out.println("Pork ADOBO with pap");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pork ADOBO with Rice");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Pork ADOBO");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option1 = scanner.nextInt();
                                    if (option1 >= 1 && option1 <= 3) {
                                        switch (option1) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 4:
                        System.out.println("Pork Pochero");
                        System.out.println("1. Pork Pochero pap R80");
                        System.out.println("2. Pork Pochero R70");
                        int Pochero = scanner.nextInt();
                        if (Pochero >= 1 && Pochero <= 2) {
                            switch (Pochero) {
                                case 1:
                                    System.out.println("Pork Pochero with pap");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pork Pochero");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                    case 5:
                        System.out.println("Pork Menudo");
                        System.out.println("1. Pork Menudo with pap R155");
                        System.out.println("2. Pork Menudo R105");
                        int Menudo = scanner.nextInt();
                        if (Menudo >= 1 && Menudo <= 2) {
                            switch (Menudo) {
                                case 1:
                                    System.out.println("Pork Menudo with pap");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int options = scanner.nextInt();
                                    if (options >= 1 && options <= 3) {
                                        switch (options) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pork Menudo");
                                    System.out.println("1. Take Away");
                                    System.out.println("2. Eat in");
                                    System.out.println("3. Delivery");
                                    int option = scanner.nextInt();
                                    if (option >= 1 && option <= 3) {
                                        switch (option) {
                                            case 1:
                                                System.out.println("Take Away");
                                                System.out.println("Please enter payment details");
                                                int payment = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 2:
                                                System.out.println("Eat in");
                                                System.out.println("Please enter payment details");
                                                int payment1 = scanner.nextInt();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                            case 3:
                                                System.out.println("Delivery");
                                                System.out.println("Please enter payment details");
                                                int payment2 = scanner.nextInt();
                                                System.out.print("Please enter delivery address: ");
                                                String address = scanner.next();
                                                System.out.println("Your order will be ready in 15 minutes");
                                                break;
                                        }
                                    }else {
                                        System.out.println("Invalid choice. Please verify the menu an check again!");
                                    }
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;
                }
            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }
            break;
        case 3:
            System.out.println("Chicken Menu");
            System.out.println("1. Full chicken R80");
            System.out.println("2. Full chicken with pap R100");
            System.out.println("3. Half chicken R45");
            System.out.println("4. Half chicken with pap R60");

            int chicken = scanner.nextInt();
            if (chicken >= 1 && chicken <= 4){
                switch (chicken){
                    case 1:
                        System.out.println("Full chicken");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");
                        System.out.println("3. Delivery");
                        int option = scanner.nextInt();
                        if (option >= 1 && option <= 3) {
                            switch (option) {
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 3:
                                    System.out.println("Delivery");
                                    System.out.println("Please enter payment details");
                                    int payment2 = scanner.nextInt();
                                    System.out.print("Please enter delivery address: ");
                                    String address = scanner.next();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }
                        break;

                    case 2:
                        System.out.println("Full chicken with pap");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");
                        System.out.println("3. Delivery");
                        int options = scanner.nextInt();
                        if (options >= 1 && options <= 3) {
                            switch (options) {
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 3:
                                    System.out.println("Delivery");
                                    System.out.println("Please enter payment details");
                                    int payment2 = scanner.nextInt();
                                    System.out.print("Please enter delivery address: ");
                                    String address = scanner.next();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                    case 3:
                        System.out.println("Half chicken");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");
                        System.out.println("3. Delivery");
                        int option1 = scanner.nextInt();
                        if (option1 >= 1 && option1 <= 3) {
                            switch (option1) {
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 3:
                                    System.out.println("Delivery");
                                    System.out.println("Please enter payment details");
                                    int payment2 = scanner.nextInt();
                                    System.out.print("Please enter delivery address: ");
                                    String address = scanner.next();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                    case 4:
                        System.out.println("Half chicken with pap R60");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");
                        System.out.println("3. Delivery");
                        int option2 = scanner.nextInt();
                        if (option2 >= 1 && option2 <= 3) {
                            switch (option2) {
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 3:
                                    System.out.println("Delivery");
                                    System.out.println("Please enter payment details");
                                    int payment2 = scanner.nextInt();
                                    System.out.print("Please enter delivery address: ");
                                    String address = scanner.next();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;
                }
            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }
            break;
        case 4:
            System.out.println("Salad Menu");
            System.out.println("1. Beetnik R13.99");
            System.out.println("2. Orchard R15.99");
            System.out.println("3. Caesar R15.99");
            System.out.println("4. Be Will R12.99");
            System.out.println("5. CowBoy R13.00");

            int Salad = scanner.nextInt();
            if (Salad >= 1 && Salad <= 5){
                switch (Salad){
                    case 1:
                        System.out.println("Beetnik");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");

                        int option = scanner.nextInt();
                        if (option >= 1 && option <= 2){
                            switch (option){
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                    case 2:
                        System.out.println("Orchard");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");

                        int options = scanner.nextInt();
                        if (options >= 1 && options <= 2){
                            switch (options){
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                    case 3:
                        System.out.println("Caesar");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");

                        int options1 = scanner.nextInt();
                        if (options1 >= 1 && options1 <= 2){
                            switch (options1){
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                    case 4:
                        System.out.println("Be Will");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");

                        int options2 = scanner.nextInt();
                        if (options2 >= 1 && options2 <= 2){
                            switch (options2){
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                    case 5:
                        System.out.println("CowBoy");
                        System.out.println("1. Take Away");
                        System.out.println("2. Eat in");

                        int options3 = scanner.nextInt();
                        if (options3 >= 1 && options3 <= 2){
                            switch (options3){
                                case 1:
                                    System.out.println("Take Away");
                                    System.out.println("Please enter payment details");
                                    int payment = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                                case 2:
                                    System.out.println("Eat in");
                                    System.out.println("Please enter payment details");
                                    int payment1 = scanner.nextInt();
                                    System.out.println("Your order will be ready in 15 minutes");
                                    break;
                            }
                        }else {
                            System.out.println("Invalid choice. Please verify the menu an check again!");
                        }break;

                }
            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }
            break;
        case 5:
            System.out.println("Refreshments Menu");
            System.out.println("1. Cola zero/Light in can R19");
            System.out.println("2. Cola in can R23");
            System.out.println("3. Sprite R23");
            System.out.println("4. Tonic water per can R17");
            System.out.println("5. Fanta R23");

            int drinks = scanner.nextInt();
            if (drinks >= 1 && drinks <= 5){
                switch (drinks){
                    case 1:
                        System.out.println("Cola zero/Light in can");
                        System.out.println("Please enter payment details");
                        int payment = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 2:
                        System.out.println("Cola in can");
                        System.out.println("Please enter payment details");
                        int payment1 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 3:
                        System.out.println("Sprite");
                        System.out.println("Please enter payment details");
                        int payment2 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 4:
                        System.out.println("Tonic water per can");
                        System.out.println("Please enter payment details");
                        int payment3 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 5:
                        System.out.println("Fanta");
                        System.out.println("Please enter payment details");
                        int payment4 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;
                }
            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }

            break;
        case 6:
            System.out.println("Chips Menu");
            System.out.println("1. Junior chips R18.50");
            System.out.println("2. Regular chips R25");
            System.out.println("3. Medium chips R32.50");
            System.out.println("4. Large chips R48");
            System.out.println("5. Jumbo chips R62");

            int chips = scanner.nextInt();
            if (chips >= 1 && chips <= 5){
                switch (chips){

                    case 1:
                        System.out.println("Junior chips");
                        System.out.println("Please enter payment details");
                        int payment = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 2:
                        System.out.println("Regular chips");
                        System.out.println("Please enter payment details");
                        int payments = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 3:
                        System.out.println("Medium chips");
                        System.out.println("Please enter payment details");
                        int payment1 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 4:
                        System.out.println("Large chips");
                        System.out.println("Please enter payment details");
                        int payment2 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 5:
                        System.out.println("Jumbo chips");
                        System.out.println("Please enter payment details");
                        int payment3 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;
                }

            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }

            break;
        case 7:
            System.out.println("Combo Menu");
            System.out.println("1. Pork steak & wors R80");
            System.out.println("2. Pork steak, half Chicken & beef steak R250");
            System.out.println("3. Pork steak, full chicken, Wors, beef steak & Jumbo chips + 2L cola R650");
            System.out.println("4. Half chicken, Wors, Beef steak R310");
            System.out.println("5. Cow heels, Wors, Pork steak + extra Pap R270");

            int combo = scanner.nextInt();
            if (combo >=1 && combo <= 5){
                switch (combo){
                    case 1:
                        System.out.println("Pork steak & wors Combo");
                        System.out.println("Please enter payment details");
                        int payment = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 2:
                        System.out.println("Pork steak, half Chicken & beef steak combo");
                        System.out.println("Please enter payment details");
                        int payment2 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 3:
                        System.out.println("Pork steak, full chicken, Wors, beef steak & Jumbo chips + 2L cola Combo");
                        System.out.println("Please enter payment details");
                        int payment3 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 4:
                        System.out.println("Half chicken, Wors, Beef steak Combo");
                        System.out.println("Please enter payment details");
                        int payment4 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;

                    case 5:
                        System.out.println("Cow heels, Wors, Pork steak + extra Pap Combo");
                        System.out.println("Please enter payment details");
                        int payment5 = scanner.nextInt();
                        System.out.println("Your order will be ready in 15 minutes");
                        break;
                }
            }else {
                System.out.println("Invalid choice. Please verify the menu an check again!");
            }
            
            break;
    }
    }else {
            System.out.println("Invalid choice. Please verify the menu an check again!");
    }
    }
}