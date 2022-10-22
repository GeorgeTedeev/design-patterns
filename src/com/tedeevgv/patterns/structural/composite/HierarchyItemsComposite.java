package com.tedeevgv.patterns.structural.composite;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HierarchyItemsComposite extends HierarchyItem {

    private Set<HierarchyItem> hierarchyItems = new TreeSet<>(Comparator.comparing(HierarchyItem::getName));

    public HierarchyItemsComposite(String name) {
        super(name);
    }

    @Override
    public void addItem(HierarchyItem hierarchyItem) {
        hierarchyItems.add(hierarchyItem);
    }

    @Override
    public void removeItem(HierarchyItem hierarchyItem) {
        hierarchyItems.remove(hierarchyItem);
    }

    @Override
    public Set<HierarchyItem> getChildren(HierarchyItem hierarchyItem) {
        return hierarchyItems;
    }

    @Override
    public String getHierarchy() {
        StringBuilder hierarchy = new StringBuilder(name);
        for(HierarchyItem item : hierarchyItems) {
            hierarchy.append("\n\t");
            hierarchy.append(item.getHierarchy().replace("\n\t", "\n\t\t"));
        }

        return hierarchy.toString();
    }
}
