/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravityprinterouter;

import java.text.DecimalFormat;
/**
 *
 * @author Mark
 */
public class GravityPrinterOuter {

    /**
     * @param args the command line arguments
     */

    static DecimalFormat df2 = new DecimalFormat(".##");
     static double x = 0.0; 
     static int multiplier = 1;
       static  double y = 0.0;
       static  double dx = 0.00;
       static  double dy = 384000000.000*multiplier;
      static   double m1 = 597.2;
      static   double m2 = 7.34*multiplier*multiplier;
      static   int powerOfTen = -11;
      static int range = 1000;
    static double ugc = 6.6780;
        static double distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
        static double uniGravConst = ugc * powerOfTen(powerOfTen);
        //double uniGravConst = 1;
        static double gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
      static GPOFrame gf;
      
      
        public static void main(String[] args) {           
        randomizeInputs();
        distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
        uniGravConst = ugc * powerOfTen(powerOfTen);
        //double uniGravConst = 1;
        gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
            
       // gf = new GPOFrame(); 
            
            
   System.out.println("the planet with a mass of " + df2.format(m2) + " is at a distance of " + df2.format(distance)+ " map units");
                
                
                System.out.println("Your ship with a mass of " + df2.format(m1) + " is at (" + (int)x + "," + (int)y + "), ");
                System.out.println("the planet with a mass of " + df2.format(m2) + " is at (" + (int)dx + "," + (int)dy + ")");
                System.out.println("Using a UGC of "+ugc+" * 10^" + powerOfTen + ", there is a ");
                double xForce = getXForce(getAngleInDegrees(x, y, dx, dy),gravitationalAttraction);
                double yForce = getYForce(getAngleInDegrees(x, y, dx, dy),gravitationalAttraction);
                System.out.println("gravitational force of " + df2.format(gravitationalAttraction) + " at " + df2.format(getAngleInDegrees(x, y, dx, dy)) + " degrees.\n Force on x is = " + df2.format(xForce) + ", on y is = " + df2.format(yForce));
                 
                // need to calculate force to orbit planet from ships position
                System.out.println("to orbit the planet, x = (getXOrbitThrust()) y = (getYOrbitThrust())");
          
          
         // printAllAngleValues(); 
        
        
        
     /*   
        //gravitationalAttraction = 1.0;
       
        //System.out.println("System properties: " + System.getProperties());
       // System.out.println(gravitationalAttraction + " newtons");
       // System.out.println("ten to the power of " + powerOfTen + " is " + convertPowerOfTen(powerOfTen));
 
      //System.out.println(gravitationalAttraction + " newtons");
      // System.out.println("this should be 56.3: " + Math.toDegrees(3.0/2.0));
       
   // get two double numbers numbers
   double xp = 45;
   double yp = -180;

   // convert them in radians
   xp = Math.toRadians(xp);
   yp = Math.toRadians(yp);

   // print the tangent of these doubles
 //  System.out.println("Math.tan(" + xp + ")=" + Math.tan(xp));
  // System.out.println("Math.tan(" + yp + ")=" + Math.tan(yp));
  /*
     getElement(3);
   getElement(0);
   getElement(7);
   getElement(2);
   getElement(136);
   setElectronShells();

   
   
   
   

double value = Math.tan(Math.toRadians(45
));
value = ((double) Math.round(value * 1000)) / 1000;
//System.out.println("what is this crap: " + Double.toString(value));

//System.out.println("This should be 45: " + getAngle(0, 0, 1, 1) );
//System.out.println("This should be 90: " + getAngle(0, 0, 0, 1) );
//System.out.println("This should be 180: " + getAngle(0, 0, -1, 0) );
//System.out.println("This should be 270: " + getAngle(0, 0, 0, -1) );
//System.out.println("This should be 135: " + getAngle(0, 0, -1, 1) );
   
  
   
   
   for(int i = -10; i < 11; i++){
    // System.out.println("This "+i+" should be changing: " + getAngle(0, 0, i, 10) );  
   }
   
  
   
   
   
   
   
   */
   
   
   
    }  // end main
  
 ///////////////////////////////////////////////////////////////////    
        ////////////////////////////////////////////////////////////////////////////////////////
        
        
  public static void searchForSuitableGravitationalForce(){
            boolean winnerWinner = true;
       
        
      int runAmount = 1000000;
        
     int foundInThisManyTries = 0;
     
          for(int i = 1; i < runAmount+1; i++){ 
       System.out.println();
        foundInThisManyTries++;
             randomizeInputs();
             
        distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
        uniGravConst = ugc * powerOfTen(powerOfTen);
        //double uniGravConst = 1;
        gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
             
        // System.out.println("try #" + i);
             printAngleValues(gravitationalAttraction, getAngleInDegrees(x, y, dx, dy)); 
             
            
             
             if(gravitationalAttraction < 1.05 && gravitationalAttraction > .993 || gravitationalAttraction > -1.05 && gravitationalAttraction < -.993){
                
                 i = runAmount+1;
                  winnerWinner = true;
             }
         
          }
          
          
          winnerWinner = true;
          
          
          
        if(!winnerWinner){
                System.out.println("NO SOLUTION FOUND - REQUESTING MORE TIME...(" + foundInThisManyTries + " tries)"); 
             }else{
                System.out.println("SOLUTION FOUND! (" + foundInThisManyTries + " tries)"); 
               System.out.println("the planet with a mass of " + df2.format(m2) + " is at a distance of " + df2.format(distance)+ " map units");
                
                
                System.out.println("Your ship with a mass of " + df2.format(m1) + " is at (" + (int)x + "," + (int)y + "), ");
                System.out.println("the planet with a mass of " + df2.format(m2) + " is at (" + (int)dx + "," + (int)dy + ")");
                System.out.println("Using a UGC of "+ugc+" * 10^" + powerOfTen + ", there is a ");
                double xForce = getXForce(getAngleInDegrees(x, y, dx, dy),gravitationalAttraction);
                double yForce = getYForce(getAngleInDegrees(x, y, dx, dy),gravitationalAttraction);
                System.out.println("gravitational force of " + df2.format(gravitationalAttraction) + " at " + df2.format(getAngleInDegrees(x, y, dx, dy)) + " degrees.\n Force on x is = " + df2.format(xForce) + ", on y is = " + df2.format(yForce));
                    
             }
        
        
        
  }      
        
 public static void printAngleValues(double gravity, double angle){
     
      double anGle = angle;
     
     for(int i = 0; i < 1; i++){
         
     double xForce = getXForce(anGle, gravity);
     double yForce = getYForce(anGle,gravity);
  // System.out.println("Your ship with a mass of " + df2.format(m1) + " is at (" + (int)x + "," + (int)y + "), ");
// System.out.println("the planet with a mass of " + df2.format(m2) + " is at (" + (int)dx + "," + (int)dy + ")");
  //  System.out.println("Using a UGC of 6.673 * 10^" + powerOfTen + ", there is a ");
//System.out.println("gravitational force of " + df2.format(gravity) + " at " + df2.format(anGle) + " degrees.\n Force on x is = " + df2.format(xForce) + ", on y is = " + df2.format(yForce));
     
     //anGle = anGle + 46.73;
     
     
     
        }  // end for loop
     
 }  // end print angle values
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    public static void printAllAngleValues(){
     double gravity = 1.0;
    // double angle
      double anGle = 0.124;
      double increment = 6.0 * 15.0;
      int deg = 360/(int)increment;
     double x = 1.0;
     double y = 1.0;
     double realX;
     double realY;
     
     
     for(int i = 0; i < 360; i++){
         
     double xForce = getXForce(anGle, gravity);
     double yForce = getYForce(anGle,gravity);
     
     
    //System.out.println(); 
     
     
     
     
   System.out.println("Your ship with a mass of " + df2.format(m1) + " is at (" + (int)x + "," + (int)y + "), ");
 System.out.println("the planet with a mass of " + df2.format(m2) + " is at (" + (int)dx + "," + (int)dy + ")");
      System.out.println("Using a UGC of 6.673 * 10^" + powerOfTen + ", there is a ");
System.out.print("gravitational force of " + df2.format(gravity) + " at " + df2.format(anGle) + " degrees.");
 System.out.println("force on x is = " + df2.format(xForce) + ", on y is = " + df2.format(yForce));
 //showSquareVectorForces(anGle);
     
     if(anGle > 180.0){
       y = -1.0;  
     }
     if(anGle > 90.0 && anGle < 270){
       x = -1.0;  
     } 


     
     
    if(anGle == 0.0){
        x = 1.0; y = 0.0; 
     }if(anGle == 90.0){
       x = 0.0; y = 1.0; 
     }if(anGle == 180.0){
       x = -1.0; y = 0.0;  
     }if(anGle == 270.0){
       x = 0.0; y = -1.0; 
     }
     
     
     
     
     
     
     //System.out.println("force2 on x is = " + x + ", on y is = " + y);
     
     
     
     
    double xVariationPercent = Math.abs(xForce - x) * 100;
    double yVariationPercent = Math.abs(yForce - y) * 100;
     
     
     
     
     System.out.println("Variation on x is = " +df2.format(xVariationPercent) + "%, on y is = " + df2.format(yVariationPercent)+"%");
      //System.out.println("force1 on x is = " + df2.format(xForce) + ", on y is = " + df2.format(yForce));
    //  gravityprinterouter.GravityPrinterOuter.gf.gp.result1.setText( "<html><h1><font color='green'>"+" at " + df2.format(anGle) + " degrees:"+"force1 on x is = " + df2.format(xForce) + ", on y is = " + df2.format(yForce)+ "</font><h1></html>");
     
     
  //   "<html><h2><font color='white'>"   " </font><font color='red'>" + 8.6 + "</font><h2></html>"
     
     
     
     
     
     
   anGle = anGle + increment;
     
     
     
        }  // end for loop
     
 }  // end print angle values   
    
 public static void showSquareVectorForces(double angle) {
     
     int x = 1;
     int y = 1;
     
     if(angle > 180.0){
       y = -1;  
     }
     if(angle > 90.0 && angle < 270.001){
       x = -1;  
     }
     System.out.println("square vectors are x = " +x+ " and y = "+y);
     
 }  
    
    
    
    
    
    
    
  public static void randomizeInputs(){
      
      
      
      
      x = (Math.random() * range) - (range/2); 
      y = (Math.random() * range) - (range/2);
      dx = (Math.random() * range) - (range/2);
      dy = (Math.random() * range) - (range/2);
      m1 = 10;//(Math.random() * 1000);//  if we use (0,0) and the ship's weight, i think this becomes a calc for orbits, if we apply force perpendicular to gravity? need to find out
      m2 = (Math.random() * 10000);
      powerOfTen = (int)(Math.random() * 40) - 20;
      
      
  } // end randomize inputs     
        
     
  
  
  
  
  
        // this is for scale, but i'm not sure if this applied only to the universal gravitational constant allows for proper scaling
        //re-inventing the wheel on this one, kinda fun to figure out
     public static double powerOfTen(int p){
         
         double result = 1.0;  // 10^0 = 1.0
         
         for(int i = 0; i < Math.abs(p); i++){
            result = result * 10; 
         }
         
       if(p < 0){
           result = (1/result);
       }  
         
         
      return result;   
         
         
     }   // end power of ten
        
        
        // i wrote the same method twice somehow
    public static double convertPowerOfTen(int t){
     
      double tenPower = 1.0;
      for (int i = 0; i < Math.abs(t); i++){
         tenPower = tenPower * 10; 
      }
      if(t<0){
        tenPower = (1/tenPower);  
      }
      
      return tenPower;
  }  
    
  

    
    

    
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
 
     
     public void gravitationalAttration(){
     
        distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
        uniGravConst = ugc * powerOfTen(powerOfTen);
        //double uniGravConst = 1;
        gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
        
 } 
   
 
   //http://stackoverflow.com/questions/9970281/java-calculating-the-angle-between-two-points-in-degrees
public static double getAngleInDegrees(double x, double y, double x2, double y2) {
    double angle = (double) Math.toDegrees(Math.atan2(y2 - y, x2 - x));

    if(angle < 0){
        angle += 360;
    }

    return angle;
}   
   


  // adapted from the example in the book "Beginning Java SE 6 Game Programming, third edition", by Jonathan S. Harbour 
   
 public static double getXForce(double angleInDegrees, double force){
     
     return (double)(Math.cos(angleInDegrees*Math.PI/180)) * force;
 }  
   
  public static double getYForce(double angleInDegrees, double force){
     
     return (double)(Math.sin(angleInDegrees*Math.PI/180)) * force;
 }   


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
  
  
  
  
  
  
  
 static public void forceOfGravity(int x, int y, int dx, int dy, double m1, double m2){
       
     double xforce = 0.0;
     double yforce = 0.0;
     
     distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
        uniGravConst = ugc * powerOfTen(powerOfTen);
        //double uniGravConst = 1;
        gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
     
     
     double angle = (double) Math.toDegrees(Math.atan2(dy-y, dx-x));

    if(angle < 0){
        angle += 360;
    }
     
     
     xforce = (double)(Math.cos(angle*Math.PI/180)) * gravitationalAttraction;
     
    yforce = (double)(Math.sin(angle*Math.PI/180)) * gravitationalAttraction;
     
     
     
     
     
     
     
     
     System.out.println("force on x is = " + df2.format(xforce) + ", on y is = " + df2.format(yforce));
     
     
     
     
     
     
 } // end force of gravity
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
    
}  // end
