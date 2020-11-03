class Univ
{
void circular()
{
System.out.println("Exams are going to start");
}
class Dep{
int papers=50;
void examPapers()
{
System.out.println("Exam papers will be issued");
}
}
Dep ece=new Dep();
ece.exampPapers();
}
}

class NestedClass1{
public static void main(String args[])
{
Univ jntuh=new Univ();
jntuh.circular();

}
}