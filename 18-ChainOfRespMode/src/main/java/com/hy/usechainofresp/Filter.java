package com.hy.usechainofresp;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public abstract class Filter {

    protected Filter filter;

    public void setNextFilter(Filter filter){
        this.filter=filter;
    }

    public abstract void filter();
}
