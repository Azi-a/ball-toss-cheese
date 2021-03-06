/**
 * Creates a thrower object and determines the maximum velocity and gravity of that character.
 * Also determines if the player won based on if the goal was cleared after the maximum amount of kicks.
 * @author Ram Krishna, Jyotishka Sen, Zayd Moosajee
 * Teacher: Ishman
 * Period: 2
 * Due Date: 5-16-19
 */
public class Thrower
{
  public static final double IDEAL_V = 46.9392;
  public static final double GRAV = 9.81;
  public static final double MIN_GC = 0.01;
  public static final double MAX_GC = 29.41995;
  public static final int MOON_CHECK = 6;
  public static final int KING_CHECK = 11;
  public static final int TTN_CHECK = 8;
  public static final double GRAV_PROB = 0.3;
  public static final double FAIL_PROB = 0.25;
  private static final double SQ_C = -0.0034576456;
  private static final double LIN_C = 0.1101559579;
  private static final double N_C = 0.2445641324;
  private static final double MAX_T = 5;

  private int let;
  private double maxVel;
  private double g;
  private double optTime;
  private double userT;
  private double deltaT;

  public Thrower(String throwName)
  {
    let = throwName.length();
    if (let != MOON_CHECK)
    {
      g = GRAV;
    }
    else
    {
      int rand = (int) Math.random();
      if (rand > GRAV_PROB)
      {
        g = Math.random() * (GRAV - MIN_GC) + MIN_GC;
      }
      else
      {
        g = Math.random() * (MAX_GC - GRAV) + GRAV;
      }
    }
    double maxVel = IDEAL_V * calcCoeff();
    optTime = Math.random() * (MAX_T - 0) + 0;
    deltaT = Math.abs(userT - optTime);
  }
 public double calcCoeff()
 {
   double coeff = SQ_C*Math.pow(let, 2) + LIN_C*let + N_C;
   return coeff;
 }
 public void setT(double dt)
 {
   userT = dt;
 }
 public double toss()
 {
   double boostVel = maxVel;
   if (let == TTN_CHECK)
   {
     if (Math.random() > FAIL_PROB)
     {
       boostVel = 2 * maxVel;
     }
     else
     {
       boostVel = 0;
     }
   }
   Ball throwBall = new Ball(boostVel, deltaT, g);
   Ball kickTwo = new Ball(maxVel, deltaT, g);
   double dist = throwBall.determineDistanceBallThrown();
   double inAir = throwBall.getTimeBallInAir();
   if (let == KING_CHECK)
   {
     dist += kickTwo.determineDistanceBallThrown();
     inAir += kickTwo.getTimeBallInAir();
   }
   if (dist > throwBall.determineFinishLine())
   {
     System.out.println("You win, woo!");
   }
   else
     System.out.println("You lose...");
  return inAir;
 }
}
