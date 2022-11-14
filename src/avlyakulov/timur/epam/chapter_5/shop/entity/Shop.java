package avlyakulov.timur.epam.chapter_5.shop.entity;

import java.util.Arrays;
import java.util.Date;

/*
Создать класс Shop с внутренним классом, с помощью объектов которого
можно хранить информацию об отделах, товарах и услугах.
 */
public class Shop {
    private String name;
    private String address;
    private DepartmentInTheStore[] checkHistory;
    private int current;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        checkHistory = new DepartmentInTheStore[3];
    }

    public void addToCheckHistoryNewCheck(DepartmentInTheStore check) {
        if (current == checkHistory.length) {
            DepartmentInTheStore[] checkHistory1 = new DepartmentInTheStore[checkHistory.length];
            System.arraycopy(checkHistory,0,checkHistory1,0,checkHistory.length);
            checkHistory = checkHistory1;
        }
        checkHistory[current] = check;
        ++current;
    }

    public class DepartmentInTheStore {
        private TypeOfDepartment typeOfDepartment;
        private Date dateOfPurchase;
        private String[] products;
        private int[] prices;
        private String[] basket;
        private int check;


        public DepartmentInTheStore(TypeOfDepartment typeOfDepartment) {
            dateOfPurchase = new Date();
            this.typeOfDepartment = typeOfDepartment;
            switch (typeOfDepartment) {
                case SWEETS -> {
                    products = new String[]{"Cookies", "Candies"};
                    prices = new int[]{4, 6};
                }
                case BEVERAGES -> {
                    products = new String[]{"Water", "Soda"};
                    prices = new int[]{2, 4};
                }
                case VEGETABLES -> {
                    products = new String[]{"Cucumber", "Onion"};
                    prices = new int[]{3, 2};
                }
                case FRUITS -> {
                    products = new String[]{"Apples", "Bananas"};
                    prices = new int[]{1, 3};
                }
                case FISH -> {
                    products = new String[]{"Catfish", "Carp"};
                    prices = new int[]{10, 12};
                }
                case MEAT -> {
                    products = new String[]{"Chicken", "Beef"};
                    prices = new int[]{6, 8};
                }
                case BREAD -> {
                    products = new String[]{"Bun", "Loaf of Bread"};
                    prices = new int[]{1, 3};
                }
                default -> System.out.println("It doesn't work correctly");
            }
        }

        public void addToBasketAndToCheckProduct(String nameProduct) {
            int i = 0;
            for (int j = 0; j < products.length; j++) {
                if (products[j].equals(nameProduct)) {
                    basket[i] = nameProduct;
                    ++i;
                    check += prices[j];
                }
            }
        }

        @Override
        public String toString() {
            return "Фіскальний чек {" +
                    "basket=" + Arrays.toString(basket) +
                    ", check=" + check +
                    ", date of your purchase=" + dateOfPurchase +
                    '}' + '\n';
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name of Shop='" + name + '\'' +
                ", address='" + address + '\'' +
                ", checkHistory='" + Arrays.toString(checkHistory) + '\'' +
                '}';
    }
}