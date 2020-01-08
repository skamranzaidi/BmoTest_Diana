package com.bmo;

public class NodeSort {
    Object value;
    NodeSort next;

    NodeSort(Object val) {
        value = val;
        next = null;

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public NodeSort getNext() {
        return next;
    }

    public void setNext(NodeSort next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeSort{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}


