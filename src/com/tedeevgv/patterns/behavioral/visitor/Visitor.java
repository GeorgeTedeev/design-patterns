package com.tedeevgv.patterns.behavioral.visitor;

import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItemLeaf;
import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItemsComposite;

public interface Visitor {
    void visit(HierarchyItemsComposite directory);

    void visit(HierarchyItemLeaf file);
}
