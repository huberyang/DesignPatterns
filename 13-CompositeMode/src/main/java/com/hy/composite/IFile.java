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
public interface IFile {
    public void display();

    public boolean addChild(IFile iFile);

    public boolean removeChild(IFile iFile);

    public List<IFile> getChildren();
}
