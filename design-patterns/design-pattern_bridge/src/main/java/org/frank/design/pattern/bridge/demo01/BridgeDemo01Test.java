package org.frank.design.pattern.bridge.demo01;

import org.frank.design.pattern.bridge.demo01.share.EmailShare;
import org.frank.design.pattern.bridge.demo01.share.FTPShare;
import org.frank.design.pattern.bridge.demo01.system.Linux;
import org.frank.design.pattern.bridge.demo01.system.OperatingSystem;
import org.frank.design.pattern.bridge.demo01.system.Windows;

public class BridgeDemo01Test {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows(new EmailShare());
        windows.shareFile("report.docx");

        OperatingSystem linux = new Linux(new FTPShare());
        linux.shareFile("presentation.pptx");
    }
}
