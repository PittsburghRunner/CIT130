/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancePractice;

/**
 *
 * @author christopher.eckles
 */
abstract class Student {

    String name;
    int id;
    int credits;
    boolean graduationStatus;

    Student() {

    }

    Student(String n, int i) {
        name = n;
        id = i;
    }

    abstract boolean canGraduate();
}

class HSStudent extends Student {

    int numPeriodsPerDay;
    String principalName;

    HSStudent(String n, int i) {
        super(n, i);
    }

    @Override
    boolean canGraduate() {
        return (credits >= 20);
    }

}

class CollegeStudent extends Student {

    String major;

    CollegeStudent(String n, int i) {
        super(n, i);
    }

    @Override
    boolean canGraduate() {
        return (credits >= 30);
    }
}

class GradStudent extends CollegeStudent {

    String advisorTopic;
    String thesisTopic;
    boolean thesisComplete;

    public GradStudent(String n, int i) {
        super(n, i);
    }

    @Override
    boolean canGraduate() {
        return (thesisComplete);
    }
}

public class SchoolLand {

    public static void main(String[] args) {
        Student highSchool = new HSStudent("Fredie", 1234);
        Student college = new CollegeStudent("Grant", 7890);
        Student grad = new GradStudent("Eric", 7890);

        highSchool.credits = 45;
        college.credits = 20;
//        GradStudent gradStudent = (GradStudent) grad;
//        
//        gradStudent.thesisComplete = true;

        ((GradStudent) grad).thesisComplete = true;
        
        System.out.println("Can " + grad.name + " graduate? " + (grad.canGraduate()?"Yes":"No way José!"));
        System.out.println("Can " + highSchool.name + " graduate? " + (highSchool.canGraduate()?"Yes":"No way José!"));
        System.out.println("Can " + college.name + " graduate? " + (college.canGraduate()?"Yes":"No way José!"));


    }

}
