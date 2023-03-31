final public class ImmutableClass {

    // RGB value validator
    final private int r;
    final private int g;
    final private int b;
    final private String name;

    private void check(int r, int g, int b) {
        if (r > 255 || g > 255 || b > 255 || r < 0 || g < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
    }

    public ImmutableClass(int r, int g, int b, String name){
       check(r,g,b);
       this.r = r;
       this.g = g;
       this.b =b;
       this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass a = new ImmutableClass(1,2,3,"black");
        System.out.println(a.getName());
    }
}


