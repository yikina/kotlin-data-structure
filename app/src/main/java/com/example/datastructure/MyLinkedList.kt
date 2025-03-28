package com.example.datastructure

class MyLinkedList<T> : MyList<T> {
    private var head: Node<T>? = null
    private var size = 0

    override fun size(): Int {
        return size
    }

    override fun get(index: Int): T? {
        if (index < 0 || index >= size) {
            return null
        }
        var current = head
        repeat(index) {
            current = current?.next
        }
        return current?.value
    }

    override fun set(index: Int, element: T) {
        if (index < 0 || index >= size) return
        var current = head
        repeat(index) {
            current = current?.next
        }
        current?.value = element
    }

    override fun add(element: T) {
        if (head == null) {
            head = Node(element)
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = Node(element)
        }
        size++
    }

    override fun removeAt(index: Int) {
        if (index < 0 || index >= size) return
        if (index == 0) {
            head = head?.next
        } else {
            var current = head
            repeat(index - 1) {
                current = current?.next
            }
            current?.next = current?.next?.next
        }
        size--
    }
}

private class Node<T>(var value: T, var next: Node<T>? = null)