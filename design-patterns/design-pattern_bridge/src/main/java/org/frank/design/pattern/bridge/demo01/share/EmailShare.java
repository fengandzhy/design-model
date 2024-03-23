package org.frank.design.pattern.bridge.demo01.share;

public class EmailShare implements FileShareImplementor{
    @Override
    public void shareFile(String fileName) {
        System.out.println("Share by Email: " + fileName);
    }
}
