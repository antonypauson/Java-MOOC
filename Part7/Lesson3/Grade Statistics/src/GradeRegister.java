import java.lang.reflect.Array;
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private int[] grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new int[]{0, 0, 0, 0, 0, 0};
    }


    public void addPoints(int point) {
        if (point <= 100 && point >= 0) {
            this.points.add(point);
        }

        if (point >= 50 && point <= 100) {
            this.passingPoints.add(point);
        }

        convertToGrade(point);
    }

    private void convertToGrade(int point) {
        if (point < 50) {
            grades[5]++;
        } else if (point < 60) {
            grades[4]++;
        } else if (point < 70) {
            grades[3]++;
        } else if (point < 80) {
            grades[2]++;
        } else if (point < 90) {
            grades[1]++;
        } else {
            grades[0]++;
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

    public int[] getGrades() {
        return grades;
    }

    public double findPassPercentage() {
        int noOfPassed = passingPoints.size();
        int noOfParticipants = points.size();

        return 100 * ((double) noOfPassed / noOfParticipants);
    }
}
