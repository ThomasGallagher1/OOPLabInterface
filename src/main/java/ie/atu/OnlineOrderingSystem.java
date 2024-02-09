package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args){
        MenuItem[] menuItems = new MenuItem[]
                {
                        new Burger("Classic Burger",7.99,"Beef patty, lettuce, tomato, cheese"),
                        new Pizza("Margherita Pizza", 10.99, "Tomato Sauce, mozzarella"),
                        new Salad("Caesar Salad", 5.99, "Romaine lettuce, croutons, Caesar dressing"),
                        new Dessert("Brownie", 3.99, "Chocolate Brownie, Vanilla Ice Cream, Chocolate Sauce"),
                };
        for (MenuItem menuItem : menuItems){
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println("Price: " + menuItem.getPrice());
            System.out.println("\n");
        }

        double totalCost = 0;
        for(MenuItem menuItem : menuItems)
        {
            totalCost = menuItem.getPrice() + totalCost;
        }
        System.out.println("Total Cost: " + totalCost);
    }
}
