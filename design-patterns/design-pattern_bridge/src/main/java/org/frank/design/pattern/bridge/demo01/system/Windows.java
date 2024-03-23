package org.frank.design.pattern.bridge.demo01.system;

import org.frank.design.pattern.bridge.demo01.share.FileShareImplementor;

public class Windows extends OperatingSystem{
    
    public Windows(FileShareImplementor fileShareImplementor) {
        super(fileShareImplementor);
    }

    @Override
    public void shareFile(String fileName) {
        System.out.println("Windows:");
        fileShareImplementor.shareFile(fileName);
    }
}
