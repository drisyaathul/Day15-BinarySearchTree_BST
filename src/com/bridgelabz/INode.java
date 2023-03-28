package com.bridgelabz;

public class INode<T extends Comparable<T>> {

    T data;
    INode<T> nextL;
    INode<T> nextR;

    public INode(T data) {

        this.data = data;

    }
}
