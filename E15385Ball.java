


public class E15385Ball {
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		//inside main method create the given b1 object
		 Ball b1=new Ball(0.0,1.0,10.0,45.0);
		 //update time by 5
		 b1.updateTime(5);//update time to b1
		 //take time in between 
		 //create the asked b2 object
		  Ball b2=new Ball(0.0,1.0,20.0,45.0);
		  //update time by 5
		  b2.updateTime(5);//update time to b2
		  //call will collide on b2 will it collide with b1
		 int b1b2= b2.willCollide(b1);
		   if(b1b2==1){System.out.println("B1 and B2 will collide");}
		   else{System.out.println("B1 and B2 won’t collide");}
		  
		  //Create object b3
		  Ball b3=new Ball (-10.0,5.0, 3.0, 30.0);
		  //update time by 20
		  b3.updateTime(20);
		  //call will collide on b3 and will it collide with b2
		  int b2b3= b3.willCollide(b2);
		   if(b2b3==1){System.out.println("B2 and B3 will collide");}
		   else{System.out.println("B2 and B3 won’t collide");}
		  
		  //end of code
		  
		  //Call method to show the variables of ball
		 /* show(b1);
		  show(b2);
		  show(b3);*/
}
}
 class Ball {
	//Creating variables needed
		double xPosition;
		double yPosition;
		double speedOfBall;
		double Angle;
		static double globalTime=0;
		double timeBefore;
		//Creating a constructor
		Ball(double x, double y, double speed, double angleOfSpeedWithX){
			this.xPosition=x;
			this.yPosition=y;
			this.speedOfBall=speed;
			this.Angle=angleOfSpeedWithX;
			
			} 
		
		//Method to update global time
		//here return is the new input time
		void updateTime(double time){
			timeBefore=globalTime;
			 globalTime=globalTime+time;
			  }
		//take input time to a variable
		
		/*  //method to show the variables of ball
		static void show(Ball b){
			System.out.println("The x value = "+b.xPosition);
			System.out.println("The y value = "+b.yPosition);
			System.out.println("The speed value = "+b.speedOfBall);
			System.out.println("The x Angle = "+b.Angle);
			
		}   */
		
		int willCollide(Ball b){
			int flag=0;
//			System.out.println("x position of this = "+this.xPosition);
//			System.out.println("y position of this = "+this.yPosition);
//			
//			System.out.println("x of passing ball = "+b.xPosition);
//			System.out.println("y of passing ball = "+b.yPosition);
			
			//calculating the initial balls position after updated time
			//System.out.println("first balls new position ="+(b.xPosition+((Math.cos(b.Angle))*(b.speedOfBall)*globalTime));
			double newXofFirstBall=(b.xPosition)+((Math.cos(b.Angle))*(b.speedOfBall)*(globalTime-b.timeBefore));
	       double newXofThisBall=(this.xPosition)+((Math.cos(this.Angle))*(this.speedOfBall)*(globalTime-this.timeBefore));
	       double newYofFirstBall=(b.yPosition)+((Math.sin(b.Angle))*(b.speedOfBall)*(globalTime-b.timeBefore));
	       double newYofThisBall=(this.yPosition)+((Math.sin(this.Angle))*(this.speedOfBall)*(globalTime-this.timeBefore));
	      //System.out.println("first ball time = "+(globalTime-b.timeBefore));
			//System.out.println("second ball = "+(globalTime-this.timeBefore));
//			System.out.println("y1 ="+newYofFirstBall);
//			System.out.println("y2 ="+newYofThisBall);
	       //check the collision status
			if(newXofFirstBall== newXofThisBall && newYofFirstBall==newYofThisBall )
			 { flag=1;}
			else{ flag=0;}
				return flag;
		}
		
}