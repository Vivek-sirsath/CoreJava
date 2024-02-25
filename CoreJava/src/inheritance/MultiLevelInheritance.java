package inheritance;
//Extending classes in different levels i.e. child-->parent-->grandparent 
public class MultiLevelInheritance extends SingleLevelInheritance{
	
	int c = 100;
	
	public void multiLevelInheritanceClassMethod() {
		System.out.println("I am a method of MultiLevelInheritance class");
	}
	
	public static void main(String[] args) {
		
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.parentClassMethod();
		obj.singleLevelInheritanceClassMethod();
		obj.multiLevelInheritanceClassMethod();
	}
}
