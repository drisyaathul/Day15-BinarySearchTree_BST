package com.bridgelabz;

public class BinaryTree<T extends Comparable<T>> {

    INode<T> root;

    public void add(T data) {
        INode<T> newNode = new INode<>(data);
        if (root == null) {
            root = newNode;
            return;
        }
        INode<T> currentPointer = root;
        while (currentPointer.nextL == null && currentPointer.nextR == null){
            if (data.compareTo(currentPointer.data)<0) {
                currentPointer = newNode;
            }else
                currentPointer = newNode;
        }
        if (data.compareTo(currentPointer.data)<0) {
            currentPointer = currentPointer.nextL;
        }else
            currentPointer = currentPointer.nextR;
    }

}






