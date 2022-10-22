package com.tedeevgv.patterns.structural.composite;

public class CompositeClient {
    public static void main(String[] args) {
        HierarchyItem root = new HierarchyItemsComposite("root dir");
        root.addItem(new HierarchyItemLeaf("first file"));
        root.addItem(new HierarchyItemLeaf("second file"));
        HierarchyItemsComposite secondLevel = new HierarchyItemsComposite("second level dir");
        HierarchyItemsComposite thirdLevel = new HierarchyItemsComposite("third level dir");
        root.addItem(secondLevel);
        secondLevel.addItem(thirdLevel);
        thirdLevel.addItem(new HierarchyItemLeaf("fourth file"));
        secondLevel.addItem(new HierarchyItemLeaf("third file "));
        String hierarchy = root.getHierarchy();
        System.out.println(hierarchy);
    }
}
