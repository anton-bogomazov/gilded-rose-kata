package com.abogomazov.glidedrose

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.AssertionError
import kotlin.test.assertEquals

class RegularItemTest {

    @Test
    fun `ages linearly, -1 quality per day`() {
        val sut = tomato()
        sut.age()
        assertEquals(4, sut.getSellIn())
        assertEquals(6, sut.getQuality())
    }

    @Test
    fun `can't create with quality exceeds 50`() {
        assertThrows<AssertionError> {
            RegularItem.of("Too Good To Be True", 5, 80)
        }
    }
}

private fun tomato() = RegularItem.of("Tomato", 5, 7)
