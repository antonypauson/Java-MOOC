import java.lang.reflect.Array;
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradesBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;

        for (int eachGrade : grades) {
            if (grade == eachGrade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }

    public double averageOfPoints() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return (double) sum / this.points.size();
    }



    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        register.addGradesBasedOnPoints(93);
        register.addGradesBasedOnPoints(91);
        register.addGradesBasedOnPoints(92);


        System.out.println(register.averageOfPoints());
        System.out.println(register.averageOfGrades());
    }

}
