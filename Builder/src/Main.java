
public class Main {

	public static void main(String[] args) {
		Target.Builder target = Target.Builder.factory();
		//target.setfName("Parag");
		target.setlName("Chaudhari");
		target.setAge(25);
		target.setEducation("Graduate");
		target.setGender("Male");
		try{
		System.out.println(target.build());
		}catch(NullPointerException e){
			System.out.println("Object not created");
		}
	}

}
