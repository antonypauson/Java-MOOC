import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.points = new ArrayList<>();
    }


    public void addPoints(int point) {
        if (point <= 100 && point >= 50) {
            this.points.add(point);
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
}
