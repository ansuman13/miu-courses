public abstract class Provider {

    protected String name;

    public Provider(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateCost(Package p);

    public abstract double calculateCost(Package p, Sender s);

}
