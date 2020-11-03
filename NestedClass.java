class Univ
{
void circular()
{
System.out.println("Exams are going to start");
}
class Dep{
void examPapers()
{
System.out.println("Exam papers will be issued");
}
}
class NestedClass{
public static void main(String args[])
{
Univ jntuh=new Univ();
jntuh.circular();
Univ.Dep ece=new Univ().new Dep();
ece.examPapers();
}
}