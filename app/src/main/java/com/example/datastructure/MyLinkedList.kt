package com.example.datastructure

class MyLinkedList<T> {
    private var head: Node<T>? = null
    private var size = 0

    fun size(): Int {
        return size
    }

    fun get(index: Int): T? {
        if (index < 0 || index >= size) {
            return null
        }
        var current = head
        repeat(index) {
            current = current?.next
        }
        return current?.value
    }

    fun add(element: T) {
        if (head == null) {
            head = Node(element)
        }
        size++
    }
}

private class Node<T>(val value: T, var next: Node<T>? = null)