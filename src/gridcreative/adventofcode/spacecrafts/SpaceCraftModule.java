package gridcreative.adventofcode.spacecrafts;

import gridcreative.adventofcode.calculators.FuelCalculator;
import gridcreative.adventofcode.measurements.Mass;
import gridcreative.adventofcode.measurements.Volume;

public class SpaceCraftModule {
	private final Mass mass ;
	private final FuelCalculator fuelCalculator;

	public SpaceCraftModule(Mass mass) {
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
