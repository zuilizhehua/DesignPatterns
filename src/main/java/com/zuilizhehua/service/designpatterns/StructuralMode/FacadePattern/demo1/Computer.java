package com.zuilizhehua.service.designpatterns.StructuralMode.FacadePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 17:13
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDisk = new HardDisk();
    }

    public void start() {
        cpu.start();
        memory.start();
        hardDisk.start();
        System.out.println("Computer started.");
    }

    public void shutdown() {
        hardDisk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("Computer shutdown.");
    }
}
