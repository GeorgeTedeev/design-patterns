package com.tedeevgv.patterns.structural.composite;

import java.util.Set;

public abstract class HierarchyItem {

    protected String name;

    public HierarchyItem(String name) {
        this.name = name;
    }

    void addItem(HierarchyItem hierarchyItem) {
        throw new UnsupportedOperationException();
    }

    void removeItem(HierarchyItem hierarchyItem) {
        throw new UnsupportedOperationException();
    }

    Set<HierarchyItem> getChildren(HierarchyItem hierarchyItem) {
        throw new UnsupportedOperationException();
    }

    abstract String getHierarchy();

    String getName() {
        return name;
    }
}
