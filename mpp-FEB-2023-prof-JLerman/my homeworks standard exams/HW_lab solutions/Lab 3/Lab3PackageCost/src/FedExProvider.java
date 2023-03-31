public class FedExProvider extends Provider {

    public FedExProvider(String name) {
        super(name);
    }

    @Override
    public double calculateCost(Package p) {
        String zone = p.getZone();
        double rate;
        if (zone.equals("IA") || zone.equals("MT") || zone.equals("OR") || zone.equals("CA")) {
            rate = 0.35;
        } else if (zone.equals("TX") || zone.equals("UT")) {
            rate = 0.30;
        } else if (zone.equals("FL") || zone.equals("MA") || zone.equals("OH")) {
            rate = 0.55;
        } else {
            rate = 0.43;
        }
        return rate * p.getWeight();
    }

    @Override
    public double calculateCost(Package p, Sender s) {
        double initialCost = calculateCost(p);
        double discount = s.getDiscountPercentage()/100 * initialCost;
        return initialCost - discount;
    }
}
