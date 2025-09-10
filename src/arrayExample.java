import java.util.*;

public class arrayExample {

    public static void arrayEX() {

        int[] fourFours = {4, 4, 4, 4};
        int[] fiveFives = {5, 5, 5, 5, 5};
        int[] sixSixes = {6,6,6}; //NOT ACTUALLY 6 SIXES :(
        System.out.println(Arrays.toString(fourFours));
        System.out.println(Arrays.toString(fiveFives));
        System.out.println(Arrays.toString(sixSixes));
        //if I want to make six sixes be six sixes long, I have to make a new array for it and overwrite the original one
        sixSixes = new int[6]; //this removes the old data!
        System.out.println(Arrays.toString(sixSixes));
        for (int i = 0; i < 6; i++) {sixSixes[i] = 6;}
        System.out.println(Arrays.toString(sixSixes));


        ArrayList<Integer> resizeMe = new ArrayList<Integer>();
        resizeMe.add(1);
        resizeMe.add(2);
        resizeMe.add(3);
        for (Integer integer : resizeMe) {
            System.out.println(integer);
        }

    }

    static List<Student> students = new ArrayList<>();

    public static void StudentListMaker(Scanner sc) {
        Random rand = new Random();
        String[] names = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
        for (String name : names) {
            students.add(new Student(name, rand.nextInt(0, 100) + 1));
        }
        students.sort(Comparator.comparingInt(Student::grade));
        int total=0;
        for (Student student : students) {total+=student.grade();}
        int median = total/students.size();

        System.out.println("total: "+total+", Median: "+median+", high score: " + students.getLast().name()+", class dunce: " + students.getFirst().name());

        System.out.println("full List and grades (* = above median)");
        for (Student student : students) {
            System.out.println(student.name() +", " + student.grade() + ", " + grader(student.grade()));
            if(student.grade()>median){System.out.print("*");}
        }
        //temp implement
        searcher(sc);

    }
    private static String grader(int score){
        String res;
        if(score >= 80){res = "A";}
        else if(score >= 70){res = "B";}
        else if(score >= 60) {res = "C";}
        else if(score >= 50) {res = "D";}
        else if(score >= 40) {res = "E";}
        else                 {res = "F";}
        return res;
    }

    private static void searcher(Scanner sc) {
        System.out.println("input name to search.");
        String name = sc.next();
        boolean found = false;
        for (Student student : students) {
            if (student.name().equalsIgnoreCase(name)) {
                System.out.printf("your student scored: " + student.grade() +". GOODBYE NOW.");
                found = true;
                break;
            }
        }
        if(!found)System.out.println("NO MATCHES. GOODBYE NOW.");
    }
}

record Student(String name, int grade){}
