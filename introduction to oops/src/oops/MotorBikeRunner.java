package oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MotorBike ktm = new MotorBike();
MotorBike duke = new MotorBike();

duke.start();
ktm.start();

duke.setSpeed(100);
ktm.setSpeed(50);



	}

}
