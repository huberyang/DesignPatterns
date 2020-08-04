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
public class HttpFilter extends Filter {
    @Override
    public void filter() {
        System.out.println("Filter Http");
        //exist next filter?
        if(this.filter!=null){
            this.filter.filter();
        }
    }
}
