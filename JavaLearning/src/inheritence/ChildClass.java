package inheritence;

public class ChildClass extends InheritenceSuperClass {

	public static void main(String[] args) {

		// As object created of Child Class it also gain access to super class object
		// As child class object created super class object also created.

		ChildClass childClass = new ChildClass();

		// Child Class can access super class data member 

		// 2. Public
		int a = childClass.a;

		// 2. Private
		//int b = childClass.b;

		// 3. Protected
		int c = childClass.c;

		// 3. Default
		int d = childClass.d;

		/////////////////////////////////////////////////////////////////////////////////

		// Child Class can access super class static data member.

		// 2. Public
		int s_a = childClass.s_a;

		// 2. Private
		//int s_b = childClass.s_b;

		// 3. Protected
		int s_c = childClass.s_c;

		// 3. Default
		int s_d = childClass.s_d;

		/////////////////////////////////////////////////////////////////////////////////

		// Child Class can access super class final data member.

		// 2. Public
		int f_a = childClass.f_a;

		// 2. Private
		//int f_b = childClass.f_b;

		// 3. Protected
		int f_c = childClass.f_c;

		// 3. Default
		int f_d = childClass.f_d;

		/* Conclusion super class data members which are private whether static,final and normal
			can not be inherited.
		 */
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
		// Child Class can access super class methods

		// Normal		
		// Private methods can not be inherited

		//childClass.sleeping();	
		childClass.runnig();
		childClass.eating();
		childClass.chatting();

		// Statics
		// Private static methods can not be inherited

		//ChildClass.sleeping1();	
		ChildClass.runnig1();
		ChildClass.eating1();
		ChildClass.chatting1();

		// Final
		// Private final methods can not be inherited

		//ChildClass.sleeping2();	
		childClass.runnig2();
		childClass.eating2();
		childClass.chatting2();

		/* Conclusion super class methods which are private whether static,final and normal
			can not be inherited.
		 */

	}

	// Super keyword refers to super class object.
	public void callingSuper() {
		
		// super can access Super class data member.

		// 2. Public
		int a = super.a;

		// 2. Private
		//int b = super.b;

		// 3. Protected
		int c = super.c;

		// 3. Default
		int d = super.d;
		
		/////////////////////////////////////////////////////////////////////////////////

		// super can access Super class final data member.

		// 2. Public
		int f_a = super.f_a;

		// 2. Private
		//int f_b = super.f_b;

		// 3. Protected
		int f_c = super.f_c;

		// 3. Default
		int f_d = super.f_d;
		
		/*
		 * Super keyword can't access private data members of normal and final.
		 * Their is no sense while accessing static members with super keyword rather than Class name.
		 */
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
		//super can access super class methods

		// Normal		
		// Private methods can not be inherited so super can not call them.

		//super.sleeping();	
		super.runnig();
		super.eating();
		super.chatting();

		// Statics
		// Private static methods can not be inherited so super can not call them.

		//ChildClass.sleeping1();	
		super.runnig1();
		super.eating1();
		super.chatting1();

		// Final
		// Private final methods can not be inherited so super can not call them.

		//super.sleeping2();	
		super.runnig2();
		super.eating2();
		super.chatting2();

		/*
		 * Super keyword can't access private methods(normal,final) of super class.
		 * Their is no sense while accessing static methods with super keyword rather than Class name.
		 */
		
		
	}



}
