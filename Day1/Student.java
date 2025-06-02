public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printdetails() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Grade:" + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 18, 92.5);
        Student s2 = new Student("Priya", 19, 89.0);
        s1.printdetails();
        s2.printdetails();

    }
}