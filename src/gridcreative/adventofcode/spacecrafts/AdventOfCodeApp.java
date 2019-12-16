package gridcreative.adventofcode.spacecrafts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import gridcreative.adventofcode.measurements.Mass;

public class AdventOfCodeApp {

	public static void main(String[] args) {

		if (args.length > 0 && args.length == 1) {

			var file = new File(args[0]);
			try {
				double totalFuelRequired = 0;

				var fileReader = new Scanner(file);
				while (fileReader.hasNextLine()) {

					String massAsString = fileReader.nextLine();

					Mass mass = new Mass(Integer.parseInt(massAsString));
					
					var module = new SpaceCraftModule(mass);
					totalFuelRequired += module.getRequiredFuel().getAmount();
				}

				fileReader.close();

				System.out.print(totalFuelRequired);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
