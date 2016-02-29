package com.company;

import java.util.function.Function;

/**
 * Created by etai on 2/28/16.
 */
public class CPU {
  int programCounter;
  int stackPointer;
  // Accumulator
  int A;
  // Index Register
  int X;
  // Index Register Y
  int y;
  ProcessorFlags P; //Holds processor flags
  Memory memory;

  public void execute() {
    int opCode = memory.fetch(programCounter);
    executeInstruction(opCode);
  }

  public void executeInstruction(int opCode) {

  }


  public static void runOpCode(byte currentOpCode) {
    switch (currentOpCode) {
      case 0x00:
        break;
      default:
        break;
    }
  }
}
