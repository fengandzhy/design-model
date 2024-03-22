package org.frank.design.pattern.template.demo01;

import org.frank.design.pattern.template.demo01.template.SoftwareBuilder;
import org.frank.design.pattern.template.demo01.template.impl.JavaBuilder;
import org.frank.design.pattern.template.demo01.template.impl.PythonBuilder;

public class TemplateDemo01Test {
    public static void main(String[] args) {
        SoftwareBuilder javaBuilder = new JavaBuilder();
        javaBuilder.build();

        System.out.println("----------");

        SoftwareBuilder pythonBuilder = new PythonBuilder();
        pythonBuilder.build();
    }
}
