import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ExamData {
    private String studentName;
    private double testScore;
    public ExamData(String name, double score){
        this.studentName = name;
        this.testScore = score;
    }

    public double getTestScore(){
        return this.testScore;
    }



    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<ExamData>();
        data.add(new ExamData("George", 91.3));
        data.add(new ExamData("Tom", 88.9));
        data.add(new ExamData("Rick", 80));
        data.add(new ExamData("Harold", 90.8));
        data.add(new ExamData("Ignatius", 60.9));
        data.add(new ExamData("Anna", 77));
        data.add(new ExamData("Sussan", 87.3));
        data.add(new ExamData("Phil", 99.1));
        data.add(new ExamData("Alex", 84));

    //4)  Use DoubleSummaryStatistics to output to the console the top test score,
        // lowest test score, and average among all test scores in a given list.

        DoubleSummaryStatistics stat = data.stream()
                .map((s) -> s.getTestScore())
                .collect(Collectors.summarizingDouble((d)-> (Double)d));
        System.out.println("Top Test score: " +stat.getMax());
        System.out.println("Lowest Test score: " +stat.getMin());
        System.out.printf("Average: %.2f" , stat.getAverage());
    }
}
