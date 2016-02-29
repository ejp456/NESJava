package com.company;

/**
 * Created by etai on 2/28/16.
 */
public enum ProcessorFlags {
  CARRY(0),
  ZERO(1),
  INTERRUPT_DISABLE(2),
  DECIMAL_MODE(3),
  BREAK(4),
  UNUSED(5),
  OVERFLOW(6),
  NEGATIVE(7);

  int val;
  ProcessorFlags(int val) {
    this.val = val;
  }
}
