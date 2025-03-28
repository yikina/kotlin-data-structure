package com.example.datastructure

@Suppress("UNCHECKED_CAST")
class MyArrayList<T> : MyList<T> {
    private var elements: Array<Any?> = arrayOfNulls(1)
    private var size = 0

    override fun size(): Int {
        return size
    }

    override fun get(index: Int): T? {
        return elements[index] as T?
    }

    override fun set(index: Int, element: T) {
        if (index < 0 || index >= size) return
        elements[index] = element
    }

    override fun add(element: T) {
        if (size == elements.size) {
            val capacity = elements.size * 2
            elements = elements.copyOf(capacity)
        }
        elements[size] = element
        size++
    }

    override fun removeAt(index: Int) {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException()
        }
        for (i in index until size - 1) {
            elements[i] = elements[i + 1]
        }
        size--
    }
}