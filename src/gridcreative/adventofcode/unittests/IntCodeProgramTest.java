package gridcreative.adventofcode.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gridcreative.adventofcode.calculators.IntCodeProgram;

class IntCodeProgramTest {
	
	@Test
	void testRun_opcode1_small() {
		int[] intcodes = new int[] {1,0,0,0,99};
		var intcodeProgram = new IntCodeProgram(intcodes);
		var actual = intcodeProgram.Run();
		
		int[] expected = new int[] {2,0,0,0,99};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testRun_opcode1_long() {
		int[] intcodes = new int[] {1,1,1,4,99,5,6,0,99};
		var intcodeProgram = new IntCodeProgram(intcodes);
		var actual = intcodeProgram.Run();
		
		int[] expected = new int[]{30,1,1,4,2,5,6,0,99};
		
		assertArrayEquals(expected, actual);
	}

}
