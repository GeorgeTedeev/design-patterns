package com.tedeevgv.patterns.behavioral.visitor.composite;

import com.tedeevgv.patterns.behavioral.visitor.Visitor;

public class HierarchyItemLeaf extends HierarchyItem {
    public HierarchyItemLeaf(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
