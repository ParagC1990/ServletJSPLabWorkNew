
public class Target {
	private String fName ;
	private String lName;
	private int age;
	private String education;
	private String gender;
	private Target(Builder builder){
		fName = builder.fName;
		lName = builder.lName;
		age = builder.age;
		education = builder.education;
		gender = builder.gender;
		
	}
	public  static class Builder{
		private String fName ;
		private String lName;
		private int age;
		private String education;
		private String gender;
		
		public Builder(){
			
		}
		
		public void setfName(String name){
			fName = name;
		}
		public void setlName(String name){
			lName = name;
		}
		public void setAge(int val){
			age = val;
		}
		public void setGender(String name){
			gender = name;
		}
		public void setEducation(String name){
			education = name;
		}
		private boolean Validate(){
			
				try {
					if(fName == null || lName == null )
					throw new NameNotFoundException("Both Names Required");
				} catch (NameNotFoundException e) {
					
					e.printStackTrace();
					return false;
				}
			
				try { if(age < 25)
					throw new UnderAgeException("Age should be above 25");
				} catch (UnderAgeException e) {
					
					e.printStackTrace();
					return false;
				}
			 return true;
		}
		public Target build(){
			
			if(Validate())
			
			return new Target(this);
			else return null;
			
		}
		public static Builder factory(){
			return new Builder();
		}
	}
	@Override
	public String toString() {
		return "Target [fName=" + fName + ", lName=" + lName + ", age=" + age + ", education=" + education + ", gender="
				+ gender + "]";
	}
	
	
}
