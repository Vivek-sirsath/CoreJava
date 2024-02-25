package wrapperclasses;

public class WrapperClasses {

	public static void main(String[] args) {

		byte b = 10;
		short s = 100;
		int i = 9897;
		long l = 63330022;
		float f = 1.236f;
		double d =2.303254;
		char c = 'Z';
		boolean boo = true;
		
		System.out.println("======================= Autoboxing ==========================");

		//Converting primitives to objects : Autoboxing
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = boo;

		System.out.println("Byte Object: " + byteobj);
		System.out.println("Short Object: " + shortobj);
		System.out.println("Integer Object: " + intobj);
		System.out.println("Long Object: " + floatobj);
		System.out.println("Float Object: " + longobj);
		System.out.println("Double Object: " + doubleobj);
		System.out.println("Character Object: " + charobj);
		System.out.println("Boolean Object: " + boolobj);
		
		System.out.println("======================== Unboxing ===========================");

		//Converting objects to primitives : Unboxing
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double dblvalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;

		System.out.println("Byte Value: " + bytevalue);
		System.out.println("Short Value: " + shortvalue);
		System.out.println("Integer Value: " + intvalue);
		System.out.println("Long Value: " + longvalue);
		System.out.println("Float Value: " + floatvalue);
		System.out.println("Double Value: " + dblvalue);
		System.out.println("Character Value: " + charvalue);
		System.out.println("Boolean Value: " + boolvalue);
	}

}
