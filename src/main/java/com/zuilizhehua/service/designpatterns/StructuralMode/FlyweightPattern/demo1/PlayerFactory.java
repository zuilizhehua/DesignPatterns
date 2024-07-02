package com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1;

import com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1.impl.CounterTerrorist;
import com.zuilizhehua.service.designpatterns.StructuralMode.FlyweightPattern.demo1.impl.Terrorist;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhaichunlei
 * @Date: 2024/7/2 17:29
 */
public class PlayerFactory {
    private static Map<String, Player> players = new HashMap<String, Player>();

    public static Player getPlayer(String task) {
        Player player = players.get(task);

        if (player == null) {
            if ("Terrorist".equals(task)) {
                System.out.println("Creating a Terrorist player");
                player = new Terrorist();
            } else if ("CounterTerrorist".equals(task)) {
                System.out.println("Creating a CounterTerrorist player");
                player = new CounterTerrorist();
            } else {
                throw new IllegalArgumentException("Invalid task: " + task);
            }
            players.put(task, player);
        }

        return player;
    }
}