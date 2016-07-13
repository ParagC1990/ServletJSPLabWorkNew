
public class Main {

	public static void main(String[] args) {
	
		Photographer[] camArray = {new ParentCam(), new SecurityCam(), new SelfieCam()};
		
		for (int i = 0; i < camArray.length; i++) {
			camArray[i].prepareScene();
			System.out.println(camArray[i].takePhotograph());
		}

	}

}
