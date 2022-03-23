//in this project i used the factory design pattern the student class implements the students interface
//we override method to the parent class. we are using factory design pattern to create the 3 student objects

//bibliography: https://www.chegg.com/homework-help/questions-and-answers/using-java-interface-implement-write-code-needed-create-3-student-objects-student-object-d-q55332067?trackid=68456b940feb&strackid=0bfa764e2bae
//creating interface as interface
interface StudentInterface {

//creating a void function that does not return including required variables.
void describe (int student_id, String name, int noOfCourses, String[] courses, int[] course_levels);
}

//student class with the student interface
public class students implements StudentInterface{

@Override
//declaring student method in this function
public void describe(int student_id, String name, int noOfCourses, String[] courses, int[] course_levels){
//student details,classes and level
System.out.println("Student " + student_id + ": " + name + ":-");
//printing courses in a for loop to print all 3 courses
for(int i = 0;i<noOfCourses;i++){
System.out.println("Registered for the " + courses[i] + " - ");
//printing levels in a for loop to print all 3 levels
for(int j=0;j<course_levels[i];j++){
System.out.println("Completed level " + (j + 1));
    }
}
}
//Main method
public static void main(String[] args){
//array list for courses and key dictionary as the value

String[] courses1 = new String[]{"Software Engineering"};
//int array
int[] course_levels1 = new int[]{1};

String[] courses2 = new String[]{"Web Development", "Software Engineering"};
int[] course_levels2 = new int[]{3,0};

String[] courses3 = new String[]{"Web Development", "Software Engineering"};
int[] course_levels3 = new int[]{3,1};

//student objects with names and variable with their courses,level. 3 three student objects
students stud1 = new students();
stud1.describe(1, "Susan Smith", courses1.length, courses1, course_levels1);

students stud2 = new students();
stud2.describe(2, "Michael Jackson", courses2.length, courses2, course_levels2);

students stud3 = new students();
stud3.describe(3, "Saoirse Ronan", courses3.length, courses3, course_levels3);

}
}