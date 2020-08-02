package com.hy.composite;

import java.util.ArrayList;
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
public class Folder implements  IFile {

    private String folderName;
    private List<IFile> children;

    public Folder(String folderName){
        this.folderName=folderName;
        children =new ArrayList<IFile>();
    }

    @Override
    public void display() {
        System.out.println(folderName);
    }

    @Override
    public boolean addChild(IFile iFile) {
        return children.add(iFile);
    }

    @Override
    public boolean removeChild(IFile iFile) {
        return children.remove(iFile);
    }

    @Override
    public List<IFile> getChildren() {
        return children;
    }
}
