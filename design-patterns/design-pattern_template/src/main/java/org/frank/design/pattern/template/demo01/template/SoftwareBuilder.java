package org.frank.design.pattern.template.demo01.template;

public abstract class SoftwareBuilder {

    // 模板方法，设置为final，防止子类修改
    public final void build() {
        prepare();
        compile();
        test();
    }

    // 公共部分,准备环境，这个步骤对所有软件都是一样的，所以直接实现
    private void prepare() {
        System.out.println("Preparing build environment.");
    }

    // 编译过程，由子类实现
    protected abstract void compile();

    // 测试过程，由子类实现
    protected abstract void test();
}
