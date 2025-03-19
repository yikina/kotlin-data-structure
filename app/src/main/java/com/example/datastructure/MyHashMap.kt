package com.example.datastructure

@Suppress("UNCHECKED_CAST")
class MyHashMap<K, V> {
    private var table: Array<Any?> = arrayOfNulls(1)

    fun get(key: K): V? {
        return table[0] as V?
    }

    fun put(key: K, value: V) {
        table[0] = value
    }
}