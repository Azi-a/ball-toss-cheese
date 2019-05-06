public class Ball 
{
	public static double MAX_DEG = 75;
	public static double MIN_DEG = 15;
	public static double DIFF_BOUND = 0.5;
	private static double TARGET_COEFF = 0.870245007352; // this should make the targets close to the values we inputted manually
	private static double GC = 4.8625; // average acceleration c-moon creates
	
	double velocity;
	double angle;
	double g;
	double target;
	double dist;
	double vMax;
	
	
	
	/**
	 * 
	 * @param vMax
	 * @param deltat 
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
	 *  
	 * 
	 * @return
	 */
	double determineFinishLine()
	{
		double tDist = 0;
		if (g == 9.81)
		{
			tDist = TARGET_COEFF * vMax * vMax / g; // it's cleaner and simpler if target distance is determined by a formula
		}
		else // if using c-moon
		{
			tDist = TARGET_COEFF * vMax * vMax / GC;
		}
		return tDist;
	}
	
	/**
	 * 
	 * @param v
	 * @param t
	 * @param g
	 * @return
	 */
	double determineDistanceBallThrown()
	{
		dist = velocity*velocity*Math.sin(2*Math.toRadians(angle))/g;
		return dist;
	}
	
	//t=(2vsin(theta))/g
	/**
	 * 
	 * @param v
	 * @param t
	 * @param g
	 * @return
	 */
	double getTimeBallInAir()
	{
		timeInAir = 2*velocity*Math.sin(Math.toRadians(angle))/g;
		return timeInAir;
	}
	
	
	
}


