package com.tedeevgv.patterns.behavioral.visitor;

import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItem;
import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItemLeaf;
import com.tedeevgv.patterns.behavioral.visitor.composite.HierarchyItemsComposite;

public class VisitorClient {
    public static void main(String[] args) {
        var hierarchyItemsPrinter = new HierarchyItemsPrinter();
        HierarchyItem root = new HierarchyItemsComposite("root dir");
        root.addItem(new HierarchyItemLeaf("first file"));
        root.addItem(new HierarchyItemLeaf("second file"));
        HierarchyItemsComposite secondLevel = new HierarchyItemsComposite("second level dir");
        HierarchyItemsComposite thirdLevel = new HierarchyItemsComposite("third level dir");
        root.addItem(secondLevel);
        secondLevel.addItem(thirdLevel);
        thirdLevel.addItem(new HierarchyItemLeaf("fourth file"));
        secondLevel.addItem(new HierarchyItemLeaf("third file"));
        root.accept(hierarchyItemsPrinter);
    }
}
