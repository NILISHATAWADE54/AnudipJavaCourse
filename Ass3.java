package oops;
abstract class Vaccine{
	int age;
	String nationality;
	boolean firstDoseTaken=false;
	public Vaccine(int age,String nationality) {
		this.age=age;
		this.nationality=nationality;
	}
	public void fristDose() {
		if(nationality.equalsIgnoreCase("Indian")&&age>18) {
			System.out.println("first dose taken successfully!.please pay 250rs");
		}
		else {
			System.out.println("you are not eligible for first dose!");
		}
	}
	public void SecondDose() {
		if(firstDoseTaken) {
			System.out.println("Second dose taken Successfully!");
		}
		else {
			System.out.println("you are not eligible for Second dose!");
		}
	}
	public abstract void boosterDose();
		
}
class VaccinationSuccessful extends Vaccine{

	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
		// TODO Auto-generated constructor stub
	}
	public void boosterDose() {
		if(firstDoseTaken) {
			System.out.println("booster dose taken Successfully!");
		}
		else {
			System.out.println("you are not eligible!,pls complete your first and second dose");
		}
	}
	
}

public class Ass3 {

	public static void main(String[] args) {
		Vaccine us=new VaccinationSuccessful(20,"indian");
		us.fristDose();
		us.SecondDose();
		us.boosterDose();

	}

}
