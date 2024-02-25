package inheritance;
//Extending classes in single level i.e. child-->parent
public class SingleLevelInheritance extends ParentClass{
	
	int b = 100;
	
	public void singleLevelInheritanceClassMethod() {
		System.out.println("I am a method of SingleLevelInheritance class");
	}
	
	public static void main(String[] args) {
		
		SingleLevelInheritance obj = new SingleLevelInheritance();
		obj.parentClassMethod();
		obj.singleLevelInheritanceClassMethod();
	}
}
