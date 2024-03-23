package org.frank.design.pattern.bridge.demo01.system;

import org.frank.design.pattern.bridge.demo01.share.FileShareImplementor;

public class Linux extends OperatingSystem{
    
    public Linux(FileShareImplementor fileShareImplementor) {
        super(fileShareImplementor);
    }

    @Override
    public void shareFile(String fileName) {
        System.out.println("Linux:");
        fileShareImplementor.shareFile(fileName);
    }
}
