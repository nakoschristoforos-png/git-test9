package Practice.Projects;


    import java.util.ArrayList;
import java.util.Scanner;

    public class AdventureGame {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> inventory = new ArrayList<>();
            int health = 100;

            System.out.println("Καλώς ήρθες στο Adventure Game!");
            System.out.println("Πώς σε λένε, ήρωα;");
            String playerName = scanner.nextLine();

            System.out.println("Χαίρε, " + playerName + "! Η περιπέτεια ξεκινά...");

            boolean gameOver = false;

            while (!gameOver) {
                System.out.println("\nΥγεία: " + health);
                System.out.println("Inventory: " + inventory);
                System.out.println("\nΒρίσκεσαι σε ένα σκοτεινό δάσος. Τι θα κάνεις;");
                System.out.println("1. Πήγαινε δεξιά");
                System.out.println("2. Πήγαινε αριστερά");
                System.out.println("3. Δες inventory");
                System.out.println("4. Βγες από το παιχνίδι");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Πήγες δεξιά και συνάντησες έναν γίγαντα!");
                        health -= 20;
                        System.out.println("Ο γίγαντας σε χτύπησε! Χάλασες 20 υγεία.");
                        if (health <= 0) {
                            System.out.println("Έχασες όλη σου την υγεία. Παιχνίδι Τέλος!");
                            gameOver = true;
                        }
                        break;

                    case "2":
                        System.out.println("Πήγες αριστερά και βρήκες ένα μικρό χωριό.");
                        System.out.println("Βρήκες ένα μικρό φιαλίδιο υγείας!");
                        inventory.add("Health Potion");
                        break;

                    case "3":
                        System.out.println("Inventory σου: " + inventory);
                        if (inventory.contains("Health Potion")) {
                            System.out.println("Θέλεις να χρησιμοποιήσεις ένα Health Potion; (ναι/όχι)");
                            String usePotion = scanner.nextLine();
                            if (usePotion.equalsIgnoreCase("ναι")) {
                                health += 30;
                                inventory.remove("Health Potion");
                                System.out.println("Χρησιμοποίησες Health Potion! +30 υγεία.");
                            }
                        }
                        break;

                    case "4":
                        System.out.println("Έφυγες από το παιχνίδι. Αντίο!");
                        gameOver = true;
                        break;

                    default:
                        System.out.println("Μη έγκυρη επιλογή. Δοκίμασε ξανά.");
                }
            }

            scanner.close();
        }
    }


