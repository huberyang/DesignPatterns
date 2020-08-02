package com.hy.composite;

import java.util.List;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class File implements IFile {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }

    @Override
    public boolean addChild(IFile iFile) {
        return false;
    }

    @Override
    public boolean removeChild(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChildren() {
        return null;
    }

}
