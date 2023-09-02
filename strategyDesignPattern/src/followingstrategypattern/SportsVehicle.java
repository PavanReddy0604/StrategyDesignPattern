package followingstrategypattern;

public class SportsVehicle extends ParentVehicle {

	SportsVehicle() {
		super(new SpecialDrivingStrategy());
	}

}
