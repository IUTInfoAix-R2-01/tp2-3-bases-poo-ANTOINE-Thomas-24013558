package Exercice1;

public class Circle{
	private double radius;
	private String color;
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	public double getradius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public Circle (double radius, String c) {
		this.radius = radius;
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double radius) {
		// TODO Auto-generated method stub
		
	}
	public void setColor(String string) {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}