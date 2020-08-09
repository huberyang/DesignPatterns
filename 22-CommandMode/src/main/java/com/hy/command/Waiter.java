package com.hy.command;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hubery yang
 * date: 8/9/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Waiter {

    private List<Command> commandList;

    public Waiter(){
        commandList=new ArrayList<Command>();
    }

    public void addOrder(Command command){
        commandList.add(command);
    }

    public void cancelOrder(Command command){
        commandList.remove(command);
    }

    public void sell(){
        for(Command command:commandList){
            command.sell();
        }
    }

}
