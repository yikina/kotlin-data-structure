package com.example.datastructure

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import org.junit.Test

class MyArrayListTest {
    @Test
    fun `Given When create a MyArrayList instance Then return a empty List`() {
        // Given
        // When
        val array = MyArrayList<String>()
        // Then
        assertEquals(0, array.size())
        assertNull(array.get(0))
    }

    @Test
    fun `Given create a MyArrayList When add one element Then return a List with one element`() {
        // Given
        val array = MyArrayList<String>()
        val element = "A"
        // When
        array.add(element)
        // Then
        assertEquals(1, array.size())
        assertEquals(element, array.get(0))
    }

    @Test
    fun `Given create a MyArrayList When add two elements Then return a List with two elements`() {
        // Given
        val array = MyArrayList<String>()
        val elementFirst = "A"
        val elementSecond = "B"
        // When
        array.add(elementFirst)
        array.add(elementSecond)
        // Then
        assertEquals(2, array.size())
        assertEquals(elementFirst, array.get(0))
        assertEquals(elementSecond, array.get(1))
    }

    @Test
    fun `Given a MyArrayList has two elements When remove former element Then return a MyArrayList has one element `() {
        // Given
        val array = MyArrayList<String>()
        val elementFirst = "A"
        val elementSecond = "B"
        array.add(elementFirst)
        array.add(elementSecond)
        // When
        array.removeAt(0)
        // Then
        assertEquals(1, array.size())
        assertEquals(elementSecond, array.get(0))
    }

    @Test
    fun `Given a MyArrayList has two elements When remove last element Then return a MyArrayList has one element `() {
        // Given
        val array = MyArrayList<String>()
        val elementFirst = "A"
        val elementSecond = "B"
        array.add(elementFirst)
        array.add(elementSecond)
        // When
        array.removeAt(1)
        // Then
        assertEquals(1, array.size())
        assertEquals(elementFirst, array.get(0))
    }

    @Test
    fun `Given a MyArrayList has one elements When set a element at index 1 Then update the MyArrayList`() {
        // Given
        val array = MyArrayList<String>()
        val elementFirst = "A"
        array.add(elementFirst)
        // When
        val expected = "B"
        array.set(0, expected)
        // Then
        assertEquals(expected, array.get(0))
    }
}