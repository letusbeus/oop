package ru.letusbeus.OOPHomeworkFour;

import java.util.*;

public class GenealogicTree<T extends Child> {
    List<T> genealogicTree;

    public GenealogicTree() {
        this.genealogicTree = new ArrayList<>();
    }
}