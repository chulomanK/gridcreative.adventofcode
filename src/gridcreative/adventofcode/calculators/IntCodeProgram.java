package gridcreative.adventofcode.calculators;

public class IntCodeProgram {
	private final int[] intcodes;

	public IntCodeProgram(int[] intcodes) {
		this.intcodes = intcodes;
	}

	public int[] Run() {
		int opcodeCounter = 0;
		int opcode = intcodes[opcodeCounter];

		while (opcode != 99) {
			int x = intcodes[intcodes[opcodeCounter + 1]];
			int y = intcodes[intcodes[opcodeCounter + 2]];
			int overwritePosition = intcodes[opcodeCounter + 3];

			if (opcode == 1) {

				Integer addResult = x + y;
				intcodes[overwritePosition] = addResult;

			} else if (opcode == 2) {
				Integer addResult = x * y;
				intcodes[overwritePosition] = addResult;
			}
			
			opcodeCounter += 4;
			opcode = intcodes[opcodeCounter];
		}
		
		return intcodes;
	}

}
