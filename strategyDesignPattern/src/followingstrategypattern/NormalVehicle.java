package followingstrategypattern;

public class NormalVehicle extends ParentVehicle{

	NormalVehicle() {
		super(new NormalDriveStrategy());
	
	}

}
