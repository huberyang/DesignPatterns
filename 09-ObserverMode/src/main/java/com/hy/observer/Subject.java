package com.hy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Subject {

    private boolean changed = false;
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void unRegisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void changed() {
        this.changed = true;
    }

    public void nothingChanged() {
        this.changed = false;
    }

    public void noticeObserver(Observer observer) {
        if (changed) {
            observer.notice();
        }
    }

    public void noticeAllObserver() {
        synchronized (this) {
            if (changed) {
                for (Observer observer : this.observers) {
                    observer.notice();
                }
            }
        }
    }

}
