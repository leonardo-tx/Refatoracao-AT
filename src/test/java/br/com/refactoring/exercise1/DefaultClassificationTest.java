package br.com.refactoring.exercise1;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultClassificationTest {
    @Property
    void testGetLogMessage(@ForAll int classificationNumber) {
        Classification classification = assertDoesNotThrow(
                () -> new DefaultClassification(classificationNumber)
        );
        String expected = "BAIXO\nDEBUG: z = " + classificationNumber;
        assertEquals(expected, classification.getLogMessage());
    }
}
