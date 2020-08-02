package com.hy.composite;

import java.util.List;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        IFile folder1 =new Folder("C:");

        IFile folder2=new Folder("Program Files");
        IFile file3=new File("desktop.ini");

        folder1.addChild(folder2);
        folder1.addChild(file3);

        IFile folder4=new Folder("JAVA");
        IFile folder5=new Folder("Oracle");
        IFile folder6=new Folder("NotePad++");

        folder2.addChild(folder4);
        folder2.addChild(folder5);
        folder2.addChild(folder6);

        displayTree(folder1,0);

    }

    public static void displayTree(IFile folder,int deep){
        for(int i=0;i<deep;i++){
            System.out.print("--");
        }
        if(folder!=null){
            folder.display();
            List<IFile> children = folder.getChildren();
            for(IFile file:children){
                if(file instanceof  File){
                    for(int i=0;i<=deep;i++) {
                        System.out.print("--");
                    }
                    file.display();
                }else{
                    displayTree(file,deep+1);
                }
            }
        }
    }
}
