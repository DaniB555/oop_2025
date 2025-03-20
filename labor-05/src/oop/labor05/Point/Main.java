    package oop.labor05.Point;

    import oop.labor05.Point.model.Course;
    import oop.labor05.Point.model.Student;

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Course> courses = readCourses("lab05_Courses.csv");
            for (Course c : courses){
                System.out.println(c);
            }
            ArrayList<Student> students=readStudents("lab05_Students.csv");
            for (Student s : students){
                System.out.println(s);
            }
        }
            private static ArrayList<Course> readCourses(String filename){
                ArrayList<Course> courses = new ArrayList<>();
                try {
                    Scanner scanner = new Scanner(new File(filename));
                        while(scanner.hasNextLine()){
                            String line= scanner.nextLine();
                            String[] array = line.split(",");
                            int numHours = Integer.parseInt(array[2].trim());
                            Course course = new Course(array[0].trim(),array[1].trim(),numHours);
                            courses.add(course);
                        }

                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }
                return courses;
            }
        private static ArrayList<Student> readStudents(String filename){
            ArrayList<Student> students = new ArrayList<>();
            try {
                Scanner scanner = new Scanner(new File(filename));
                while(scanner.hasNextLine()){
                    String line= scanner.nextLine();
                    if (line.isEmpty()){
                        continue;
                    }
                    String[] array = line.split(",");
                    Student student = new Student(array[0].trim(),array[1].trim(),array[2]);
                    students.add(student);
                }

            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
            return students;
        }

    }
