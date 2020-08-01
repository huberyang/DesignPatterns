package com.hy.example;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ShareMaker {
    private Circle circle;
    private Rectange rectange;
    private Square square;

    public ShareMaker(){
        circle=new Circle();
        rectange=new Rectange();
        square=new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectange(){
        rectange.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
