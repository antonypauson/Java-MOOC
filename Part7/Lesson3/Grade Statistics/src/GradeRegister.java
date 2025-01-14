import java.lang.reflect.Array;
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }


    public void addPoints(int point) {
        if (point <= 100 && point >= 0) {
            this.points.add(point);
        }

        if (point >= 50 && point <= 100) {
            this.passingPoints.add(point);
        }
    }

    public double findAverage(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;

        for (Integer point : points) {
            count++;
            sum += point;
        }

        return (double) sum / count;
    }

    public ArrayList<Integer> allPoints() {
        return points;
    }

    public ArrayList<Integer> passingPoints() {
        return passingPoints;
    }

    public double findPassPercentage() {
        int noOfPassed = passingPoints.size();
        int noOfParticipants = points.size();

        return 100 * ((double) noOfPassed / noOfParticipants);
    }
}
