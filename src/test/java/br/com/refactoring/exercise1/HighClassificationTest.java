package br.com.refactoring.exercise1;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

import static org.junit.jupiter.api.Assertions.*;

class HighClassificationTest {
    @Property
    void testInvalidConstructions(@ForAll @IntRange(max = 10) int classificationNumber) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new HighClassification(classificationNumber)
        );
        assertEquals("The classification of a HighClassification can only be greater than 10.", exception.getMessage());
    }

    @Property
    void testGetLogMessage(@ForAll @IntRange(min = 11) int classificationNumber) {
        Classification classification = assertDoesNotThrow(
                () -> new HighClassification(classificationNumber)
        );
        String expected = "ALTO\nDEBUG: z = " + classificationNumber + "\nALTO";
        assertEquals(expected, classification.getLogMessage());
    }
}
