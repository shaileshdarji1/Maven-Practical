import dao.ItemDao;
import model.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Insert Item Data");
            System.out.println("2.Delete Data");
            System.out.println("3.Display Data");


            System.out.print("Select Option:");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("Enter item id:");
                int id = scanner.nextInt();
                System.out.println("Enter Item Name:");
                String name = scanner.next();
                System.out.println("Enter Item Price:");
                int price = scanner.nextInt();
                Item item = new Item(id, name, price);
                boolean i = ItemDao.insertItemToDB(item);
                if (i == true) {
                    System.out.println("Item successfully Added");
                } else {
                    System.out.println("Something went wrong!");
                }
            } else if (a == 2) {
                System.out.println("Enter item id:");
                int id = scanner.nextInt();
                boolean d = ItemDao.deleteItem(id);

                if (d == true) {
                    System.out.println("Item successfully Deleted");
                } else {
                    System.out.println("Something went wrong!");
                }
            } else if (a == 3) {
                ItemDao.showItem();
            }

        }


    }
}
