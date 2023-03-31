
public class Package {

    private String description;
    private int weight;
    private String zone;

    public int getWeight() {
        return weight;
    }

    public String getZone() {
        return zone;
    }

    public String getDescription() {
        return description;
    }

    public Package(String description, int weight, String zone){
        this.description = description;
        this.weight = weight;
        this.zone = zone;
    }
}
