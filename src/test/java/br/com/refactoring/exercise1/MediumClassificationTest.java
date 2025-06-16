package br.com.refactoring.exercise1;

import net.jqwik.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MediumClassificationTest {
    @Property
    void testInvalidConstructions(@ForAll("invalidNumbers") int classificationNumber) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new MediumClassification(classificationNumber)
        );
        assertEquals("The classification of a MediumClassification can only be 10.", exception.getMessage());
    }

    @Example
    void testGetLogMessage() {
        int classificationNumber = 10;
        Classification classification = assertDoesNotThrow(
                () -> new MediumClassification(classificationNumber)
        );
        String expected = "MÉDIO\nDEBUG: z = " + classificationNumber;
        assertEquals(expected, classification.getLogMessage());
    }

    @Provide
    Arbitrary<Integer> invalidNumbers() {
        return Arbitraries.integers().filter(n -> n != 10);
    }
}
