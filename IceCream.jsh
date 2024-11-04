import java.util.Scanner;
void calculateIceCreamPrice() {
        int vanillaPrice = 56;
        int chocolatePrice = 34;
        int strawberryPrice = 12;
        int conePrice = 100;
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
        String flavour = scanner.nextLine();
    
        int scoopPrice = 0;
        switch (flavour) {
                case "v":
                    scoopPrice = vanillaPrice;
                    break;
                case "c":
                    scoopPrice = chocolatePrice;
                    break;
                case "s":
                    scoopPrice = strawberryPrice;
                    break;
                default:
                    System.out.println("We don't have that flavour.");
                    return;
        }
    
        System.out.println("How many scoops would you like?");
        int scoops = scanner.nextInt();
    
        if (scoops < 1) {
                System.out.println("We don't sell just a cone.");
        } else if (scoops > 3) {
                System.out.println("That's too many scoops to fit in a cone.");
        } else {
                int totalPriceInPence = conePrice + (scoopPrice * scoops);
                double totalPriceInPounds = totalPriceInPence / 100.0;
                System.out.printf("That will be %.2f pounds please.%n", totalPriceInPounds);
        }
}
calculateIceCreamPrice();