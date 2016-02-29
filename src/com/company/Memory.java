package com.company;

import java.util.Hashtable;

/**
 * Created by etai on 2/28/16.
 */
/*
 * 16 bit address space from 0x0 to 0xFFFF
 * first 256 addressable are Zero-Page
 * 0x100 tp 0x1FF the stack
 * 0x200 - 0x800 general purpose RAM
 * 0x801 - 0x2000 mirrors the previous chunk that is from 0x0 - 0x7FF
 * PPU 0x2000 - 0x2007, 0x2008 - 0x4000
 * 0x4000 - 0x4020 has other mapped data Direct Memory Address
 * 0x4020 - 0x6000 Expansion ROM
 * 0x6000 - 0x8000 SRAM
 * 0x8000 gam pak data mirrored at 0xC000
 */
public class Memory {
  private int[] mem;

  public Memory() {
    mem = new int[65536];
  }

  public int fetch(int index) {
    return mem[index];
  }

  public void insert(int index, int data) {
    mem[index] = data;
  }
}
