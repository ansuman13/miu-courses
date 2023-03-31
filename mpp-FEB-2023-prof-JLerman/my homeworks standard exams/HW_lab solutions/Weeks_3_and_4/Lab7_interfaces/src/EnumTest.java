public class EnumTest {

    Day day;

    public static void printDay(Day day){
        switch (day){
            case FRIDAY:
                System.out.println("it's friday");
                break;
            case MONDAY:
                System.out.println("it's Monday");
                break;
            case TUESDAY:
                System.out.println("it's Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("its Wednesday");
                break;
            case THURSDAY:
                System.out.println("it's Thursday");
                break;
            case SATURDAY:
                System.out.println("it's Saturday");
                break;
        }
    }


    public static void main(String[] args) {
        EnumTest a = new EnumTest();
        EnumTest.printDay(Day.SATURDAY);

    }
}
