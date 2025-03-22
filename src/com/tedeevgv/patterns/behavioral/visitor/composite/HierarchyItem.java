package com.tedeevgv.patterns.behavioral.visitor.composite;

import com.tedeevgv.patterns.behavioral.visitor.Element;

import java.util.Set;

public abstract class HierarchyItem implements Element {

    protected String name;

    public HierarchyItem(String name) {
        this.name = name;
    }

    public void addItem(HierarchyItem hierarchyItem) {
        throw new UnsupportedOperationException();
    }

    public void removeItem(HierarchyItem hierarchyItem) {
        throw new UnsupportedOperationException();
    }

    public Set<HierarchyItem> getChildren(HierarchyItem hierarchyItem) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }
}
