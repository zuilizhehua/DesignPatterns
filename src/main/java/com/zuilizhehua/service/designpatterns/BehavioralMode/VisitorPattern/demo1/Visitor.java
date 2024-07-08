package com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1;

import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl.ElementA;
import com.zuilizhehua.service.designpatterns.BehavioralMode.VisitorPattern.demo1.impl.ElementB;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/8 17:51
 */
public interface Visitor {

    void visitElementA(ElementA elementA);
    void visitElementB(ElementB elementB);

}
