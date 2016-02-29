package com.company;

/**
 * Created by etai on 2/28/16.
 */
public class NES implements Runnable {
  Memory cpuMemory;
  Memory ppuMemory;
  Memory objectAttributeMemory;

  CPU cpu;
  PPU ppu;
  APU apu;

  Cartridge cartridge;
  Interrupts interrupts;

  GUI gui;

  Joypad[] joypads;

  public NES(String filename, int width, int height) {
    cpu = new CPU();
    apu = new APU();
  }

  @Override
  public void run() {

  }

  public void loadProgram() {
  }
}
