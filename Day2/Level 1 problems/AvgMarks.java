
public class AvgMarks {
    public static void main(String[] args) {
        int math = 94;
        int physics = 95;
        int chemistry = 96;
        int total = math + physics + chemistry;
        int numberOfSubjects = 3;
        double average = (double) total / numberOfSubjects;
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
