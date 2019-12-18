package gridcreative.adventofcode.calculators;

import gridcreative.adventofcode.exceptions.InvalidOpcodeException;
import gridcreative.adventofcode.spacecrafts.Address;
import gridcreative.adventofcode.spacecrafts.Memory;

public class IntCodeProgram {
	private final Memory intcodes;

	public IntCodeProgram(int[] intcodes) {
		this.intcodes = Memory.createMemory(intcodes) ;
	}

	public Address[] Run(int noun,int verb) throws InvalidOpcodeException {
		
		intcodes.setNoun(noun);
		intcodes.setVerb(verb);
		int opcodeCounter = 0;
		int opcode = intcodes.getAddressAtPosition(opcodeCounter).getCode();

		while (opcode != 99) {
			int leftParameterPointer = intcodes.getAddressAtPosition(++opcodeCounter).getCode();
			int leftParameter = intcodes.getAddressAtPosition(leftParameterPointer).getCode();
			
			int rightParameterPointer = intcodes.getAddressAtPosition(++opcodeCounter).getCode();
			int rightParameter = intcodes.getAddressAtPosition(rightParameterPointer).getCode();
			
			int overwritePosition = intcodes.getAddressAtPosition(++opcodeCounter).getCode();

			int instructionResult;
			if (opcode == 1) {
				instructionResult = leftParameter + rightParameter;
			} else if (opcode == 2) {
				instructionResult = leftParameter * rightParameter;
			}else {
				throw new InvalidOpcodeException(String.format("opcode with value {0} is not valid! ", opcode));
			}
			
			intcodes.setAddressAtPosition(overwritePosition, Address.createAddress(instructionResult));
			
			opcode = intcodes.getAddressAtPosition(++opcodeCounter).getCode();
		}
		
		return intcodes.getAddressess();
	}

}
