package gridcreative.adventofcode.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gridcreative.adventofcode.calculators.IntCodeProgram;
import gridcreative.adventofcode.exceptions.InvalidOpcodeException;
import gridcreative.adventofcode.spacecrafts.Address;

class IntCodeProgramTest {
	
	@Test
	void testRun_opcode1_small() throws InvalidOpcodeException {
		int[] intcodes = new int[] {1,0,0,0,99};
		var intcodeProgram = new IntCodeProgram(intcodes);
		Address[] actual = new Address[0];
		
			actual = intcodeProgram.Run(0,0);

			
		
		
		Address[] expected = new Address[] {Address.createAddress(2),Address.createAddress(0),Address.createAddress(0),Address.createAddress(0),Address.createAddress(99)};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testRun_opcode1_long() throws InvalidOpcodeException {
		int[] intcodes = new int[] {1,1,1,4,99,5,6,0,99};
		var intcodeProgram = new IntCodeProgram(intcodes);
		var actual = intcodeProgram.Run(1,1);
		
		Address[] expected = new Address[]{Address.createAddress(30),Address.createAddress(1),Address.createAddress(1),Address.createAddress(4),Address.createAddress(2),Address.createAddress(5),Address.createAddress(6),Address.createAddress(0),Address.createAddress(99)};
		
		assertArrayEquals(expected, actual);
	}

}
