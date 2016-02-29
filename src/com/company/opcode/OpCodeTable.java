package com.company.opcode;

import java.util.Hashtable;

/**
 * Created by etai on 2/28/16.
 */
public class OpCodeTable {
  Hashtable<Integer, OpCodes> table;

  public OpCodeTable() {

  }

  private void ADC() {
    table.put(69, OpCodes.ADC);
    table.put(65, OpCodes.ADC);
    table.put(75, OpCodes.ADC);
    table.put(60, OpCodes.ADC);
    table.put(70, OpCodes.ADC);
    table.put(79, OpCodes.ADC);
    table.put(61, OpCodes.ADC);
    table.put(71, OpCodes.ADC);
  }
}
