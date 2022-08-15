import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        HashMap<String, Integer> productsUsage = new HashMap<String, Integer>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < products.length; i++) {
            if (!productsUsage.containsKey(products[i])) {
                productsUsage.put(products[i], 0);
            }
            productsUsage.put(products[i], productsUsage.get(products[i]) + 1);
        }

        for (int i = 0; i < products.length; i++) {
            int usage = productsUsage.get(products[i]);
            if (usage == 1) {
                return products[i];
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
    }
}