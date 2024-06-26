package ru.gb.family_tree.model.human;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<E> implements Iterator<E> {

    private int index;
    private List<E> familyTree;


    public HumanIterator(List<E> familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public boolean hasNext() {
        return index < familyTree.size();
    }

    @Override
    public E next(){
        return familyTree.get(index++);
    }

}
