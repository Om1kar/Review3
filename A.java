package Review3;

public class A {
    int sub1;
    int sub2;
    int sub3;
    int totalMarks;
    A() {
        sub1 = 76;
        sub2 = 85;
        sub3 = 65;
        totalMarks = sub1+sub2+sub3;
    }
}
class B extends A {
    int s1;
    int s2;
    int s3;
    int totalMarks2;

    B() {
        s1 = 76;
        s2 = 85;
        s3 = 93;
        totalMarks2 = s1 + s2 + s3;
    }
int totalpercentage(){
        return (totalMarks + totalMarks2)*100/600;
        }
}
class Percentage
{
    static B b = new B();
    public static void main(String[] args) {
        System.out.println("Marks in Theory Subjects="+ b.totalMarks);
        System.out.println("Marks in Sports Subjects="+ b.totalMarks2);
        System.out.println("Total Percentage of Student="+ b.totalpercentage()+"%");
    }
}
