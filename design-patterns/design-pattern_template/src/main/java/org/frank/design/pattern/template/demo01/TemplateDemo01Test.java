package org.frank.design.pattern.template.demo01;

import org.frank.design.pattern.template.demo01.template.SoftwareBuilder;
import org.frank.design.pattern.template.demo01.template.impl.JavaBuilder;
import org.frank.design.pattern.template.demo01.template.impl.PythonBuilder;

/**
 * 主要作用是定义一个算法的骨架，将算法中的具体步骤延迟到子类中实现，从而使得子类可以在不改变算法结构的情况下重新定义算法的具体步骤
 * */
public class TemplateDemo01Test {
    public static void main(String[] args) {
        SoftwareBuilder javaBuilder = new JavaBuilder();
        javaBuilder.build();

        System.out.println("----------");

        SoftwareBuilder pythonBuilder = new PythonBuilder();
        pythonBuilder.build();
    }
}
