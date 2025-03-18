package com.example.datastructure

@Suppress("UNCHECKED_CAST")
class MyArrayList<T> {
    private var elements: Array<Any?> = arrayOfNulls(1)
    private var size = 0

    fun size(): Int {
        return size
    }

    fun get(index: Int): T? {
        return elements[index] as T?
    }

    fun add(element: T) {
        if (size == elements.size){
            val capacity = elements.size * 2
            elements = elements.copyOf(capacity)
        }
        elements[size] = element
        size++
    }
}