import java.util.Scanner;
import java.util.TreeSet;

public class BrandMenu extends Menu {
    Scanner scanner = new Scanner(System.in);

    public BrandMenu() {
        super("Marka Menüsü");
    }

    @Override
    public boolean onMenu() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Markalarımız");
            System.out.println("------------");
            Brand brand = new Brand();
            brand.brand();
            System.out.println("0- Üst menü");
            int select = scanner.nextInt();
            switch (select) {
                case 0:
                    showMenu = false;
                    break;
            }

        }

        return true;
    }

}


