package Exercice1;

/**
 * The Circle class models a circle with a radius.
 */
public class Circle_2 {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius */
   public Circle_2() {  // 1st (default) constructor
      radius = 1.0;
   }
   
   /** Constructs a Circle instance with the given radius */
   public Circle_2(double radius) {  // 2nd constructor
      this.radius = radius;;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   /** Returns the circumference of this Circle instance */
   public double getCircumference() {
      return 2*radius*Math.PI;
   }
   
   // Setter for instance variable radius
   public void setRadius(double radius) {
       this.radius = radius;
   }
   
   /** Return a self-descriptive string of this instance in the form of Circle[radius=?] */
   public String toString() {
      return "Circle_2[radius=" + radius + "]";
   }
}