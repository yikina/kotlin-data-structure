package com.example.datastructure

@Suppress("UNCHECKED_CAST")
class MyHashMap<K, V> {
    private var table: Array<Entry<K, V>?> = arrayOfNulls(2)

    fun get(key: K): V? {
        val index = key.hashCode() % table.size
        var current = table[index]
        while (current != null) {
            if (current.key == key) return current.value
            current = current.next
        }
        return null
    }

    fun put(key: K, value: V) {
        val index = key.hashCode() % table.size
        var current = table[index]
        while (current != null) {
            if (current.key == key) {
                current.value = value
                return
            }
            current = current.next
        }
        table[index] = Entry(key, value, table[index])
    }

    fun remove(key: K) {
        val index = key.hashCode() % table.size
        var current = table[index]
        var prev: Entry<K, V>? = null
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next
                } else {
                    prev.next = current.next
                }
            }
            prev = current
            current = current.next
        }
    }

    private data class Entry<K, V>(
        val key: K,
        var value: V,
        var next: Entry<K, V>?
    )
}