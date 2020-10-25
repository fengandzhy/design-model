package org.zhouhy.design.model.sigleton;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        System.out.print(list.size());
    }
}
