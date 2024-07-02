package com.zuilizhehua.service.designpatterns.StructuralMode.FacadePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 17:14
 */
public class ComputerFacade {

    private Computer computer;

    public ComputerFacade() {
        this.computer = new Computer();
    }

    public void startComputer() {
        computer.start();
    }

    public void shutdownComputer() {
        computer.shutdown();
    }
}
