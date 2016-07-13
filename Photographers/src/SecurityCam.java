
public class SecurityCam implements Photographer {

	public void prepareScene() {
		System.out.println("Continously scanning suspicious activity at the entrance ");
	}

	public String takePhotograph() {
		
		return "Suspicious activity video frame ";
	}

}
