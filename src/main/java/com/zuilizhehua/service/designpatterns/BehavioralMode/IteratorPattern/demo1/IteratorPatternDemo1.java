package com.zuilizhehua.service.designpatterns.BehavioralMode.IteratorPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.IteratorPattern.demo1.impl.MyList;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 10:47
 */
public class IteratorPatternDemo1 {

    public static void main(String[] args) {
        String[] data = {"A", "B", "C", "D", "E"};
        MyList myList = new MyList(data);

        System.out.println("Elements in MyList:");
        while (myList.hasNext()) {
            System.out.println(myList.next());
        }
    }

}
