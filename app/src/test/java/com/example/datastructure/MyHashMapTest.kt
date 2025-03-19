package com.example.datastructure

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import org.junit.Test

class MyHashMapTest {
    @Test
    fun `Given When create a MyHashMap instance Then return a empty Map`() {
        // Given
        // When
        val hashMap = MyHashMap<String, Int>()
        // Then
        assertNull(hashMap.get("A"))
    }

    @Test
    fun `Given When put a element to MyHashMap Then return the element`() {
        // Given
        val hashMap = MyHashMap<String, Int>()
        // When
        hashMap.put("A", 1)
        // Then
        assertEquals(1, hashMap.get("A"))
    }
}