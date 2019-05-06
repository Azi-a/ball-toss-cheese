public class Ball 
{
	double velocity;
	double angle;
	double speed;
	double g;
	double target;
	double dist;
	
	
	
	/**
	 * 
	 * @param vMax
	 * @param deltat 
	 */
	public Ball(double vMax,double deltaT, double grav)
	{
		if (deltaT <= 1)
			velocity = vMax;
		else
			velocity = vmax / (deltaT);
		angle = (Math.random() * 60) + 15;
		g = grav;
	}
	
	
	/**
	 *  
	 * @param throwerName the codename of the thrower. 'pm'=Pickle Man|'ttn' = Turtonne|'cm' = C-moon|'wk' = Waffle King
	 * @return
	 */
	double determineFinishLine(String throwerName)
	{
		if(throwerName.equalsIgnoreCase("pm"))
		{
			target = 135;
		}
		if (throwerName.equalsIgnoreCase("ttn"))
		{
			target = 400;
		}
		if (throwerName.equalsIgnoreCase("cm"))
		{
			target = 600;
		}
		
		if (throwerName.equalsIgnoreCase("wk"))
		{
			target = 350;
		}
		return target;
		
		
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
		time = 2*velocity*Math.sin(Math.toRadians(angle))/g;
		return time;
	}
	boolean clearTarget()
	{
		if (dist > target)
		{
			return true;
		}
		return false;
	}
	
}


