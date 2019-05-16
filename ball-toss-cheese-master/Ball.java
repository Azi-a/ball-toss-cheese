/**
 * Creates a ball object, generates a target, and calculates the distance 
 * the ball will travel based on a determined angle and velocity
 * @author Ram Krishna, Zayd Moosajee, Jyotishka Sen
 * Teacher: Ishman
 * Period: 2
 * Due Date: 05-16-19
 */

public class Ball
{
	public static double MAX_DEG = 75;
	public static double MIN_DEG = 15;
	public static double DIFF_BOUND = 0.5;
	private static double TARGET_COEFF = 0.8; 
	private static double GC = 4.8625; // average acceleration c-moon creates

	double velocity;
	double angle;
	double g;
	double target;
	double dist;
	double vMax;



	/**
	 * Creates the ball object with a velocity, angle, and gravity acting on the ball
	 * @param vMax the maximum velocity the ball can be thrown with
	 * @param deltat the change in time between clicking the "Start Throw" and "Throw Ball" buttons
	 * @param grav the force of gravity acting on the ball
	 */
	public Ball(double vMaximum, double deltaT, double grav)
	{
		vMax = vMaximum;
		if (deltaT <= DIFF_BOUND)
			velocity = vMaximum;
		else
			velocity = vMaximum / (deltaT * 2); // gives a greater benefit to people who get closer to the target time
		angle = (Math.random() * MAX_DEG - MIN_DEG) + MIN_DEG; // angles: random val from 15 to 75
		g = grav;
	}


	/**
	 * Determines the target distance the ball must travel to win 
	 * using the maximum velocity and gravity on the ball
	 * @return the target distance the ball must travel to win
	 */
	public double determineFinishLine()
	{
		double tDist = 0;
		if (g == 9.81)
		{
			tDist = TARGET_COEFF * vMax * vMax / g; 
		}
		else // if using c-moon
		{
			tDist = TARGET_COEFF * vMax * vMax / GC;
		}
		return tDist;
	}

	/**
	 * Determines the distance the ball was thrown using the angle, velocity, and gravity on the ball
	 * @return the distance (in meters) the ball is thrown
	 */
	public double determineDistanceBallThrown()
	{
		dist = velocity*velocity*Math.sin(2*Math.toRadians(angle))/g;
		return dist;
	}

	/**
	 * Determines the time the ball was in the air using the velocity, angle, and gravity on the ball
	 * @return the time (in seconds) the ball was in the air
	 */
	public double getTimeBallInAir()
	{
		double timeInAir = 2*velocity*Math.sin(Math.toRadians(angle))/g;
		return timeInAir;
	}



}


