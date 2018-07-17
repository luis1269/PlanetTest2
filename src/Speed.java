

public class Speed extends CenterOfGravity{

	double calculateSpeed(double distance, double time) {
		return distance / time;
	}
	
	double calculateDistance(double speed, double time) {
		return speed * time;
	}
	
	double calculateTime(double distance, double speed) {
		return distance / speed;
	}
	
	double calculateVelocity(double time, double finalSpeed, double initialSpeed) {
		return (finalSpeed - initialSpeed)/time; 
	}
	
}
