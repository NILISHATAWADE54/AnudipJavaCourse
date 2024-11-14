package oops;
class Hillstation{
	public void loc(){
		System.out.println("Location of hill station:");	
		}
	public void famousFor() {
		System.out.println("Famous for hill station attraction:");
	}
}
class Manali extends Hillstation{
	public void loc() {
		System.out.println("manali is located in Eastern side");
	}
	public void famousFor() {
		System.out.println("Manali is famous for its adventure spots,manali have a cold weather:");
	}
}
class Mushooriee extends Hillstation{
	public void loc() {
		System.out.println("Mushooriee is located in uttar pradesh" );
	}
	public void famousFor() {
		System.out.println("Mushooriee is famous for green graden or Ias Acadmey LBSANA:");
	}
}
class Gulmerg extends Hillstation{
	public void loc() {
		System.out.println("Gulmerg are located in jammu & kashmir:");
	}
	public void famousFor() {
		System.out.println("Gulmerg is famous for there winter weather:");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Hillstation h1=new Manali();
		Hillstation h2=new Mushooriee();
		Hillstation h3=new Gulmerg();
		h1.loc();
		h1.famousFor();
		h2.loc();
		h2.famousFor();
		h3.loc();
		h3.famousFor();
	}

}
