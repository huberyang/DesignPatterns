package com.hy.memento;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1,0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class BackupManagr {

    public static Backup backup;

    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        this.backup = backup;
    }
}
