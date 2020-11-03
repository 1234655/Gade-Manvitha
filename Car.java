abstract class Car{
abstract void cost();
abstract void milage();
abstract void engine();
}


class NestedClass{
public static void main(String args[])
{
Car x=new Car()
{
void cost(){
System.out.println(" Audi cost is 50lakhs");
}
void mileage(){
System.out.println("Audi mileage is 17km");
}
void engine(){
System.out.println("Engine is in good condition");
};
x.cost();
x.mileage();
x.engine();
}
}