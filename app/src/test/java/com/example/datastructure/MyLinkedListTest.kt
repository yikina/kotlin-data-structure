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

    @Test
    fun `Given create a MyLinkedList When add one element Then return a List with one element`() {
        // Given
        val linkedList = MyLinkedList<String>()
        val element = "A"
        // When
        linkedList.add(element)
        // Then
        assertEquals(1, linkedList.size())
        assertEquals(element, linkedList.get(0))
    }

    @Test
    fun `Given create a MyLinkedList When add two elements Then return a List with two elements`() {
        // Given
        val elementFirst = 1
        val elementSecond = 2
        val elementThird = 3
        // When
        val linkedList = MyLinkedList<Int>().apply {
            add(elementFirst)
            add(elementSecond)
            add(elementThird)
        }
        // Then
        assertEquals(3, linkedList.size())
        assertEquals(elementFirst, linkedList.get(0))
        assertEquals(elementSecond, linkedList.get(1))
        assertEquals(elementThird, linkedList.get(2))
    }
}