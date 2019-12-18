package gridcreative.adventofcode.spacecrafts;

import gridcreative.adventofcode.calculators.FuelCalculator;
import gridcreative.adventofcode.measurements.Mass;
import gridcreative.adventofcode.measurements.Volume;

public class SpaceCraftModule {
	public static SpaceCraftModule createSpaceCraftModule(Mass mass) {
		return new SpaceCraftModule(mass);
	}


	private final Mass mass ;
	private final FuelCalculator fuelCalculator;

	private SpaceCraftModule(Mass mass) {
		this.fuelCalculator = new SpaceCraftModuleFuelCalculator(this);
	
		this.mass = mass;
		
	}

	public Volume getRequiredFuel() {
		
		return fuelCalculator.calculateRequiredFuel();
	}

	
	public Mass getMass() {
		return mass;
	}
	
}
