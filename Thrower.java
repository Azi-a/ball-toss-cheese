
public class Thrower 
{
  public static final double IDEAL_V = 46.9392;
  public static final double GRAV = 9.81;
  public static final double MIN_GC = 0.01;
  public static final double MAX_GC = 29.41995;
  public static final int MOON_CHECK = 6;
  public static final double GRAV_PROB = 0.3;
  private static final double SQ_C = -0.0034576456;
  private static final double LIN_C = 0.1101559579;
  private static final double N_C = 0.2445641324;
  private static final double MAX_T = 5;
  
  private int let;
  private double maxVel;
  private double g;
  private double optTime;
  
  public Thrower(String throwName)
  {
    let = throwName.length();
    if (let != MOON_CHECK)
    {
      g = GRAV;
    } 
    else
    {
      int rand = Math.random();
      if (rand > GRAV_PROB)
      {
        g = Math.random() * (GRAV - MIN_GC) + MIN_GC;
      } 
      else
      {
        g = Math.random() * (MAX_GC - GRAV) + GRAV;
      }
    }
    maxVel = IDEAL_V * coeff;
    optTime = Math.random() * (MAX_T - 0) + 0;
  } 
 public double calcCoeff()
 {
   double coeff = SQ_C*Math.pow(let, 2) + LIN_C*let + N_C;
   return coeff;
 } 
  
}
