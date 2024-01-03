package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.name = "학생1";
        student1.age=11;
        student1.grade=5;

        Student student2= new Student();
        student2.name="학생2";
        student2.age=12;
        student2.grade=6;
        Student[] students= {student1,student2};
        for(int i=0;i< students.length;i++){
            System.out.println("이름: "+students[i].name+" 나이:"+students[i].age+" 학년 :"+students[i].grade);

        }
        for(int i=0;i< students.length;i++){
            Student s=students[i];
            System.out.println("이름: "+s.name+" 나이:"+s.age+" 학년 :"+s.grade);
        }
        for(Student s:students){
            System.out.println("이름: "+s.name+" 나이:"+s.age+" 학년 :"+s.grade);
        }


    }
}
