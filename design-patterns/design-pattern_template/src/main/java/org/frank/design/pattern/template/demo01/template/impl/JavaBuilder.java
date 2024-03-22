package org.frank.design.pattern.template.demo01.template.impl;

import org.frank.design.pattern.template.demo01.template.SoftwareBuilder;

public class JavaBuilder extends SoftwareBuilder {
    @Override
    protected void compile() {
        System.out.println("Compiling Java source code.");
    }

    @Override
    protected void test() {
        System.out.println("Running Java tests.");
    }
}
