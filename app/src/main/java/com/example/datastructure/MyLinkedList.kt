package com.example.datastructure

class MyLinkedList<T> {
    private var head: Node<T>? = null
    private var size = 0

    fun size(): Int {
        return size
    }

    fun get(index: Int): T? = null
}

private class Node<T>(val value: T, var next: Node<T>? = null)