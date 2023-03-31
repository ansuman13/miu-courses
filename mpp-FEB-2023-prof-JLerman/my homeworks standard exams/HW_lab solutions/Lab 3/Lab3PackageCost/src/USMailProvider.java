public class USMailProvider extends Provider {

    public USMailProvider(String name) {
        super(name);
    }


    @Override
    public double calculateCost(Package p) {
        int weight = p.getWeight();
        if(weight<=3){
            return 1;
        }
        else{
            return 0.55*weight;
        }
    }

    @Override
    public double calculateCost(Package p, Sender s) {
        double initialCost = calculateCost(p);
        double totalDiscount = s.getDiscountPercentage()/100 * initialCost;
        return initialCost - totalDiscount;
    }
}
