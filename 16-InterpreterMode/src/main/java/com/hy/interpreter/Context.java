package com.hy.interpreter;

/**
 * author: hubery yang
 * date: 8/3/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Context {

    private String input;
    private String output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
