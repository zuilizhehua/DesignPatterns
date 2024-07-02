package com.zuilizhehua.service.designpatterns.StructuralMode.FacadePattern.demo1;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 17:15
 */
public class FacadePatternDemo1 {

    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        System.out.println("-------------------");
        computerFacade.shutdownComputer();
    }

}
