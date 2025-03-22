package com.tedeevgv.patterns.behavioral.visitor;

import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItemLeaf;
import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItemsComposite;

public class HierarchyItemsPrinter implements Visitor {
    @Override
    public void visit(HierarchyItemsComposite directory) {
        System.out.println("Directory: " + directory.getName());
    }

    @Override
    public void visit(HierarchyItemLeaf file) {
        System.out.println("File: " + file.getName());
    }
}
