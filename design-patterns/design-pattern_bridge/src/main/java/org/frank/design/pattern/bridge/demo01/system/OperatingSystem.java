package org.frank.design.pattern.bridge.demo01.system;

import org.frank.design.pattern.bridge.demo01.share.FileShareImplementor;

public abstract class OperatingSystem {
    protected FileShareImplementor fileShareImplementor;

    protected OperatingSystem(FileShareImplementor fileShareImplementor) {
        this.fileShareImplementor = fileShareImplementor;
    }

    public abstract void shareFile(String fileName);
}
