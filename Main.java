package mypage; 
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(101);
        s.setName("Ashikur");
        s.setCgpa(3.5);   
        s.setCgpa(5.0);   

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());
    }
}
