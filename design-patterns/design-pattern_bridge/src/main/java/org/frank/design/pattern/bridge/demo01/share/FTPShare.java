package org.frank.design.pattern.bridge.demo01.share;

public class FTPShare implements FileShareImplementor{
    @Override
    public void shareFile(String fileName) {
        System.out.println("Share by FTP: " + fileName);
    }
}
