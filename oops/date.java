import java.util.*;
class Student{
    String name;
    Integer age;
    Student(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public Integer getage(){
        return age;
    }
    public String toString(){
        return name+":"+age;
    }
}
class customsorting implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        int ncom=s1.getname().compareTo(s2.getname());
        int acom=s1.getage().compareTo(s2.getage());
        return ncom==0?acom:ncom;
    }
}
class date {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
      
        students.add(new Student("Ajay", 27));
        students.add(new Student("Sneha", 23));
        students.add(new Student("Simran", 37));
        students.add(new Student("Ankit", 22));
      	students.add(new Student("Anshul", 29));
      	students.add(new Student("Sneha", 22));
      
        System.out.println("Original List ");
        for (Student it : students) {
            System.out.println(it);
        }
      
      	System.out.println();

        Collections.sort(students, new customsorting());

        System.out.println("Sorted List");
        for (Student it : students) {
            System.out.println(it);
        }
        System.out.println();


    }
}