package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

import java.util.*;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        initSetup();
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            showMenu();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 0:
                    exit = true;
                    System.out.println("Good bye!");
                    break;
                case 1:
                    clearConsole();
                    storeMenu(sc);
                    break;
                case 2:
                    clearConsole();
                    updateStoreMenu(sc);
                    break;
                case 3:
                    clearConsole();
                    cartMenu(sc);
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid option, please choose again");
                    break;
            }
        }
        sc.close();
    }

    public static void clearConsole() {
        for (int i = 0; i < 30; i++) System.out.println();
    }

    public static void initSetup() {
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f));
        store.addMedia(new Book("Clean Code", "Programming", 20.0f));
        store.addMedia(new CompactDisc("1989", "Pop", 15.5f, "Jack Antonoff", 12, "Taylor Swift"));
        clearConsole();
    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("-------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenu(Scanner sc) {
        boolean back = false;
        while (!back) {
            store.displayStore();
            System.out.println("Store Options:");
            System.out.println("1. See media details");
            System.out.println("2. Add media to cart");
            System.out.println("3. Play media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");
            int option = sc.nextInt(); sc.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    System.out.print("Enter title: ");
                    String titleDetail = sc.nextLine();
                    Media mediaDetail = store.search(titleDetail);
                    if (mediaDetail != null) {
                        System.out.println(mediaDetail);
                        mediaDetailsMenu(sc, mediaDetail);
                    } else System.out.println("*MEDIA NOT FOUND*");
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    String titleAdd = sc.nextLine();
                    Media mediaAdd = store.search(titleAdd);
                    if (mediaAdd != null) cart.addMedia(mediaAdd);
                    else System.out.println("*MEDIA NOT FOUND*");
                    break;
                case 3:
                    System.out.print("Enter title: ");
                    String titlePlay = sc.nextLine();
                    Media mediaPlay = store.search(titlePlay);
                    if (mediaPlay != null && mediaPlay instanceof Playable) ((Playable) mediaPlay).play();
                    else System.out.println("This media cannot be played.");
                    break;
                case 4:
                    cart.displayCart();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void mediaDetailsMenu(Scanner sc, Media media) {
        boolean back = false;
        while (!back) {
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");
            int option = sc.nextInt(); sc.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof Playable) ((Playable) media).play();
                    else System.out.println("This media cannot be played.");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void cartMenu(Scanner sc) {
        boolean back = false;
        while (!back) {
            cart.displayCart();
            System.out.println("Cart Options:");
            System.out.println("1. Filter in cart");
            System.out.println("2. Sort cart");
            System.out.println("3. Remove media");
            System.out.println("4. Play media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");
            int option = sc.nextInt(); sc.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    System.out.print("Filter by (1) ID or (2) Title: ");
                    int filter = sc.nextInt(); sc.nextLine();
                    if (filter == 1) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        cart.filterById(id);
                    } else if (filter == 2) {
                        System.out.print("Enter title: ");
                        String keyword = sc.nextLine();
                        cart.filterByTitle(keyword);
                    }
                    break;
                case 2:
                    System.out.print("Sort by (1) Title then Cost or (2) Cost then Title: ");
                    int sort = sc.nextInt();
                    if (sort == 1) cart.sortByTitleCost();
                    else if (sort == 2) cart.sortByCostTitle();
                    break;
                case 3:
                    System.out.print("Enter title to remove: ");
                    String titleRemove = sc.nextLine();
                    cart.removeByTitle(titleRemove);
                    break;
                case 4:
                    System.out.print("Enter title to play: ");
                    String titleToPlay = sc.nextLine();
                    Media media = cart.findByTitle(titleToPlay);
                    if (media instanceof Playable) ((Playable) media).play();
                    else System.out.println("This media cannot be played.");
                    break;
                case 5:
                    cart.clear();
                    System.out.println("Order placed successfully!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void updateStoreMenu(Scanner sc) {
        System.out.println("Update Store feature not implemented in this version.");
    }
}