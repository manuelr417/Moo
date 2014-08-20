package edu.uprm.ece.icom4035.vector.test;

import edu.uprm.ece.icom4035.vector.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v1 = new Vector(1, 2);
		Vector v2 = new Vector(3, 4);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		System.out.printf("Magnitude of v2: %f\n", v2.magnitude());

		System.out.printf("Inner Product of v1, v2 <v1,v2>: %f\n", 
				v1.innerProduct(v2));
		
		System.out.printf("v1 + v2 = v3 : %s\n", v1.sum(v2));
		System.out.printf("v1 - v2 = v3 : %s\n", v1.substract(v2));
}

}
