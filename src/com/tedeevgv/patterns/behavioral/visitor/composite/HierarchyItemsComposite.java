package com.tedeevgv.patterns.behavioral.visitor.composite;

import com.tedeevgv.patterns.behavioral.visitor.Visitor;

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
    public void accept(Visitor visitor) {
        visitor.visit(this);
        hierarchyItems.forEach(child -> child.accept(visitor));
    }
}
