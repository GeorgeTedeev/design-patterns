package com.tedeevgv.patterns.structural.composite;

public class HierarchyItemLeaf extends HierarchyItem {
    public HierarchyItemLeaf(String name) {
        super(name);
    }

    @Override
    String getHierarchy() {

        return "-" + getName();
    }
}
