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
}