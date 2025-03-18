package com.example.datastructure

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import org.junit.Test

class MyLinkedListTest {
    @Test
    fun `Given When create a MyLinkedList instance Then return a empty List`() {
        // Given
        // When
        val linkedList = MyLinkedList<String>()
        // Then
        assertEquals(0, linkedList.size())
        assertNull(linkedList.get(0))
    }
}