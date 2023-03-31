

public class UPSProvider extends Provider {
    public UPSProvider(String name) {
        super(name);
    }
    @Override
    public double calculateCost(Package p) {
        return 0.45 * p.getWeight();
    }

    @Override
    public double calculateCost(Package p, Sender s) {
        double discountPercentage = s.getDiscountPercentage();
        double initialCost = 0.45 * p.getWeight();
        double totalDiscount = discountPercentage/100 * initialCost;
        return initialCost - totalDiscount;
    }
}
