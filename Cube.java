/*
 * Author: Mahanth Mohan
 * Date: 12/14/2020
 * Period: 7
 *
 * About: Represents a 3-Dimensional Cube object
 */

// Two imports - Scanner and Math Class from the Java Standard library
import java.util.Scanner;
import java.lang.Math;

// Class that represents a Cube object
public class Cube {

	// Field declarations for the Cube class
	// Used the private access modifier for the fields
	private final int vertices, edges, faces;
	private int side, dim;
	
	// Cube object constructor with 1 parameter - A coordinates int array
	public Cube(int sideLength) {
		vertices = 8;
		edges = 12;
		faces = 6;
		dim = 3;
		side = sideLength;
	}

	// A method that gets the number of vertices the cube has
	public int getVertices() {
		return vertices;
	}
	
	// A method that gets the number of edges the cube has
	public int getEdges() {
		return edges;
	}

	// A method that gets the number of faces the cube has
	public int getFaces() {
		return faces;
	}

	// A method that calculates the volume of the cube s^3
	public int findVolume() {
		return (int) (Math.pow(side, 3));
	}

	// A method that calculates the surfaceArea of the cube 6s^2
	public int surfaceArea() {
		// Cast to int to make sure that the result is an integer
		return (int) (6 * Math.pow(side, 2));
	}

	// A method that calculates the dot product of two vectors a and b
	public float dot(float[] a, float[] b) {
		// iterator i and product 
	        int i; float product = 0;
		for(i = 0; i < dim; i++) {
			product += (float) (a[i] * b[i]);
		}

		return product;
	}

	// A method that rotates the cube across the three axes - X, Y, and Z
	// phi is just a greek letter that denotes the angle measure for the rotation
	public float[] rotate(float phi, char axis) {
	
		// Here, we are converting the phi angle from degrees to radians
		// pi/180  = rad/deg => deg * pi = rad * 180 => rad = (deg * pi)/180
		// Cast to float in order to keep its decimal value
		phi = (float) ((phi * Math.PI)/180);

		// Each of the vectors instantiated below have three dimensions, which means a three tuple of coordinates
		float[] cubeVector = new float[]{side, side, side};
		float[] resVector = new float[]{0, 0, 0};
		float[] r1, r2, r3;

		// Decision making between three types of rotations, using if else if else statements in succession
		switch(axis) {
			case 'X':
			case 'x':
				// Basically the three rows of the 3D rotation matrix,
				// Splitted in order to make sure that the dot(a, b) function works
				r1 = new float[]{1, 0, 0};
				r2 = new float[]{0, (float) Math.cos(phi), (float) -Math.sin(phi)};
				r3 = new float[]{0, (float) Math.sin(phi), (float) Math.cos(phi)};
				resVector[0] += dot(r1, cubeVector);
				resVector[1] += dot(r2, cubeVector);
				resVector[2] += dot(r3, cubeVector);
				break;

			case 'Y':
			case 'y':
				r1 = new float[]{(float) Math.cos(phi), 0, (float) Math.sin(phi)};
				r2 = new float[]{0, 1, 0};
				r3 = new float[]{(float) -Math.sin(phi), 0, (float) Math.cos(phi)};
				resVector[0] += dot(r1, cubeVector);
				resVector[1] += dot(r2, cubeVector);
				resVector[2] += dot(r3, cubeVector);
				break;

			case 'Z':
			case 'z':
				r1 = new float[]{(float) Math.cos(phi), (float) -Math.sin(phi), 0};
				r2 = new float[]{(float) Math.sin(phi), (float) Math.cos(phi), 0};
				r3 = new float[]{0, 0, 1};
				resVector[0] += dot(r1, cubeVector);
				resVector[1] += dot(r2, cubeVector);
				resVector[2] += dot(r3, cubeVector);
				break;

			default:
				System.err.println("** Error: Invalid Axis of Rotation");
				System.exit(0);
				break;
		}
		
		return resVector;
	}

	public static void main(String[] args) {
		
		// Instantiate the cube with one parameter - sideLength
		// Cube(int sideLength) with sideLength = 6 units 
		Scanner sc = new Scanner(System.in);
		System.out.print("The side length of your cube: ");

		Cube mySpecial3DCube = new Cube(sc.nextInt());
		
		System.out.println("\n*** Fun facts ***\n");
		System.out.println("Your cube has: " + mySpecial3DCube.getFaces() + " faces");
		System.out.println("Your cube has: " + mySpecial3DCube.getVertices() + " vertices");
		System.out.println("Your cube has: " + mySpecial3DCube.getEdges() + " sides\n");
		
		System.out.println("\n*** Geometry Time! ***\n");
		System.out.println("Your cube has a volume of: " + mySpecial3DCube.findVolume() + " units^3");
		System.out.println("Your cube has a surface area of: " + mySpecial3DCube.surfaceArea() + " units^2\n");
		
		System.out.print("Fun, isn't it? Enter a sample rotation angle (in degrees): ");
		int angle = sc.nextInt();

		System.out.print("Rotation axis (X, Y, Z): ");
		char axis = sc.next().charAt(0);

		float[] vector = mySpecial3DCube.rotate(angle, axis);
		System.out.println("The cube's new diagonal vector is: ");
		for(int i = 0; i < vector.length; i++) {
			System.out.println("[" + vector[i] + "]");
		}

	}

}
