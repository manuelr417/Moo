package edu.uprm.ece.icom4035.vector;

public class Vector {
	private double x;
	private double y;
	
	public Vector(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public String toString(){
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public double magnitude(){
//		double temp1 = this.x * this.x;
//		double temp2 = this.y * this.y;
//		return Math.sqrt(temp1 + temp2);
		
		return Math.sqrt(this.x * this.x + this.y * this.y);
				
	}
	
	public double innerProduct(Vector v2){
		return this.x * v2.x + this.y * v2.y;
	}
	
	public Vector sum(Vector v2){
		return new Vector(this.x + v2.x, this.y + v2.y);
		
	}
	
	public Vector substract(Vector v2){
		return new Vector(this.x- v2.x, this.y - v2.y);
		
	}

}
