import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradesBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
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

    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        register.addGradesBasedOnPoints(93);
        register.addGradesBasedOnPoints(91);
        register.addGradesBasedOnPoints(92);
        register.addGradesBasedOnPoints(88);

        System.out.println(register.averageOfGrades());
    }

}
