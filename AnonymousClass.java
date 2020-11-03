abstract class Vehicle{
	abstract void milage();
	abstract void cost();
}
public class AnonymousClass {

	public static void main(String[] args) {
		
		Vehicle car=new Vehicle() {
			void milage() {
				System.out.println("Milage of the car is 18km");
			}
			void cost() {
				System.out.println("Cost of the car is 35lakhs");
			}
		};
		Vehicle bike=new Vehicle() {
			void milage() {
				System.out.println("Milage of the bike is 15km");
			}
			void cost() {
				System.out.println("Cost of the bike is 6ok");
			}
		};
		car.milage();
		car.cost();
		bike.milage();
		bike.cost();
	}

}
