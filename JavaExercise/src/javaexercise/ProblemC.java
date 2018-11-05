package javaexercise;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemC {

	private static class Vector2D{
		public double x;
		public double y; 

		// constructor taking x and y

		public Vector2D (double x, double y) {
			this.x = x; 
			this.y = y;	
		}

		public String toString() {
			return ""+ this.x + " " +this.y;
		}


		// method subtract that takes another Vector2D and returns a new vector equal to this vector minus the other vector.
		public Vector2D subtract(Vector2D anotherVector) {

			return new Vector2D (this.x-anotherVector.x, this.y-anotherVector.y);

		}

		// method multiply by scalar that returns a new vector equal to this vector times a scalar
		public Vector2D multiply (double a) {

			return new Vector2D(a*this.x, a*this.y);
		}

		// method normalisation that returns the norms of a this vector

		public double normalisation() {

			return Math.sqrt((x*this.x + y*this.y));

		}

		public Vector2D normalisationVector() {

			return multiply(1/normalisation());
		}


		// method dot product that returns the scalar (double)

		public double dotProduct(Vector2D anotherVector) {

			return this.x*anotherVector.x + this.y*anotherVector.y;

		}

	}

	public static boolean CheckIfBallIsInTheWay(Vector2D ball0, Vector2D ball1, Vector2D ball2, double radius ) {
		Vector2D ball0Toball1 = ball1.subtract(ball0);
		Vector2D ball0Toball2 = ball2.subtract(ball0);

		Vector2D projection = ball0Toball1.normalisationVector().multiply(ball0Toball2.dotProduct(ball0Toball1.normalisationVector()));

		if(projection.normalisation()>ball0Toball1.normalisation()) {
			return false;
		}
		if(projection.subtract(ball0Toball2).normalisation()> 2*radius) {
			return false;
		}else {
			return true;
		}

	}

	private static boolean isPositionInsideTable(int width, int height, int radius, Vector2D position) {
		return position.x >= radius && position.x <= width-radius && position.y >= radius && position.y <= height-radius;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		int length = sc.nextInt();

		int radius = sc.nextInt();


		Vector2D ball1 = new Vector2D(sc.nextInt(),sc.nextInt());
		Vector2D ball2 = new Vector2D(sc.nextInt(),sc.nextInt());
		Vector2D ball3 = new Vector2D(sc.nextInt(),sc.nextInt());

		int hDistance = sc.nextInt();


		Vector2D lefthole = new Vector2D(0,length);
		Vector2D righthole = new Vector2D(width, length);

		Vector2D ball2HitsLeftHole_Direction = lefthole.subtract(ball2);
		Vector2D ball3HitsRightHole_Direction = righthole.subtract(ball3);

		Vector2D ball0Hitsball2 = ball2.subtract(ball2HitsLeftHole_Direction.normalisationVector().multiply(2*radius));
		Vector2D ball1Hitsball3 = ball3.subtract(ball3HitsRightHole_Direction.normalisationVector().multiply(2*radius));

		Vector2D ball1Hitsball3_Direction = (ball1Hitsball3.subtract(ball1)).normalisationVector();

		Vector2D ball0Hitsball1 = ball1.subtract(ball1Hitsball3_Direction.multiply(2*radius));

		Vector2D ball0Hitsball2_Direction = ball0Hitsball2.subtract(ball0Hitsball1).normalisationVector();

		double constantA  = ball0Hitsball2_Direction.dotProduct(ball1Hitsball3_Direction.multiply(-1));

		//Here starts different checks: 
		double direction_y1 = constantA*ball1Hitsball3_Direction.y + ball1Hitsball3_Direction.x*Math.sqrt(1-constantA*constantA);

		double direction_x1 = (constantA-ball1Hitsball3_Direction.y*direction_y1)/ball1Hitsball3_Direction.x;

		Vector2D ball0Hitsball1_DirectionCandidate1 = new Vector2D(direction_x1, direction_y1);


		double direction_y2 = constantA*ball1Hitsball3_Direction.y - ball1Hitsball3_Direction.x*Math.sqrt(1-constantA*constantA);

		double direction_x2 = (constantA-ball1Hitsball3_Direction.y*direction_y2)/ball1Hitsball3_Direction.x;

		Vector2D ball0Hitsball1_DirectionCandidate2 = new Vector2D(direction_x2, direction_y2);


		Vector2D ball0Hitsball1_Direction;
		if ( ball0Hitsball2_Direction.dotProduct(ball0Hitsball1_DirectionCandidate1) > 
		ball0Hitsball2_Direction.dotProduct(ball0Hitsball1_DirectionCandidate2)) {
			ball0Hitsball1_Direction = ball0Hitsball1_DirectionCandidate1;
		}
		else {
			ball0Hitsball1_Direction = ball0Hitsball1_DirectionCandidate2;
		}


		double theta  = Math.acos(ball0Hitsball1_Direction.x);

		double d = ball0Hitsball1.x + ((hDistance-ball0Hitsball1.y)*ball0Hitsball1_Direction.x)/ball0Hitsball1_Direction.y;

		Vector2D ball0 = new Vector2D(d,hDistance);

		if (/*direction_y1 * width >= -radius && */d<=width-radius && d>=radius && 
				ball0Hitsball1_Direction.dotProduct(ball1Hitsball3_Direction)>= 0 &&
				ball0Hitsball2_Direction.dotProduct(ball2HitsLeftHole_Direction)>= 0 &&
				ball1Hitsball3_Direction.dotProduct(ball3HitsRightHole_Direction)>= 0 &&
				isPositionInsideTable(width, length, radius, ball0Hitsball2) && 
				isPositionInsideTable(width, length, radius, ball0Hitsball1) &&
				isPositionInsideTable(width, length, radius, ball1Hitsball3) &&
				!CheckIfBallIsInTheWay(ball0, ball1, ball2,radius)&&
				!CheckIfBallIsInTheWay(ball0, ball1, ball3,radius)) {

			DecimalFormat df = new DecimalFormat(".00");

			df.setRoundingMode(RoundingMode.HALF_UP);

			System.out.println(df.format(d)+ " "+ df.format(Math.toDegrees(theta)));

		}else {
			System.out.println("impossible");
		}

	}

}
