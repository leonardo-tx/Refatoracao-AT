package br.com.refactoring.exercise1;

import net.jqwik.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RareClassificationTest {
    @Property
    void testInvalidConstructions(@ForAll("invalidNumbers") int classificationNumber) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new RareClassification(classificationNumber)
        );
        assertEquals("The classification of a RareClassification can only be -9999.", exception.getMessage());
    }

    @Example
    void testGetLogMessage() {
        int classificationNumber = -9999;
        Classification classification = assertDoesNotThrow(
                () -> new RareClassification(classificationNumber)
        );
        String expected = "CASO RARO\nDEBUG: z = " + classificationNumber;
        assertEquals(expected, classification.getLogMessage());
    }

    @Provide
    Arbitrary<Integer> invalidNumbers() {
        return Arbitraries.integers().filter(n -> n != -9999);
    }
}
