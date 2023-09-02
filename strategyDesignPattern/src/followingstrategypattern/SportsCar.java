package followingstrategypattern;

public class SportsCar extends ParentVehicle {

	SportsCar() {
		super(new SpecialDrivingStrategy());
	}

}
