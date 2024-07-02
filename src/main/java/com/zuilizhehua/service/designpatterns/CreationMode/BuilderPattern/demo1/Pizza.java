package com.zuilizhehua.service.designpatterns.CreationMode.BuilderPattern.demo1;

import lombok.Data;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 14:33
 */
@Data
public class Pizza {

    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(String size, boolean cheese, boolean pepperoni, boolean bacon) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }

}
