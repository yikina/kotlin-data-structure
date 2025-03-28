package com.example.datastructure

interface MyList<T> {
    fun size(): Int
    fun get(index: Int): T?
    fun set(index: Int, element: T)
    fun add(element: T)
    fun removeAt(index: Int)
}