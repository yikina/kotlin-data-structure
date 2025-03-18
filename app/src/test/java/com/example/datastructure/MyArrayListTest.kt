package com.example.datastructure

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import org.junit.Test

class MyArrayListTest {

    @Test
    fun `Given When create a MyArrayList instance Then return a empty List`(){
        // Given
        // When
        val array = MyArrayList<String>()
        // Then
        assertEquals(0, array.size())
        assertNull(array.get(0))
    }

    @Test
    fun `Given create a MyArrayList When add one element Then return a List with one element`(){
        // Given
        val array = MyArrayList<String>()
        val element = "A"
        // When
        array.add(element)
        // Then
        assertEquals(1, array.size())
        assertEquals(element, array.get(0))
    }
}