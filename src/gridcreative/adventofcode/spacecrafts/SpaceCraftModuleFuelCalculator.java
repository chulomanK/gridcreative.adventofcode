package gridcreative.adventofcode.spacecrafts;

import gridcreative.adventofcode.calculators.FuelCalculator;

import gridcreative.adventofcode.measurements.Volume;

public class SpaceCraftModuleFuelCalculator implements FuelCalculator {
	
	private final SpaceCraftModule spaceCraftModule;
	public SpaceCraftModuleFuelCalculator(SpaceCraftModule spaceCraftModule) {
		this.spaceCraftModule = spaceCraftModule;
	}
	@Override
	public Volume calculateRequiredFuel() {

		int mass = spaceCraftModule.getMass().getAmount();
		 int totalVolume = 0;
		do {
			 
			mass = calculateFuelMass(mass);

			if (mass > 0) {
				totalVolume += mass;
			}
		}while(mass > 0);
		
		Volume volume = new Volume(totalVolume);
		
		return volume;
	}


	private int calculateFuelMass(int mass) {
		int massAmount = (mass / 3) - 2;
		return massAmount;
	}
}
