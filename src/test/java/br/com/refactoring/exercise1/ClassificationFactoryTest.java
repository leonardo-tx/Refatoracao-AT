package br.com.refactoring.exercise1;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.lifecycle.BeforeExample;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClassificationFactoryTest {
    private ClassificationFactory classificationFactory;

    @BeforeExample
    void setupBeforeExample() {
        classificationFactory = new ClassificationFactory();
    }

    @Example
    void testMediumClassificationCreate() {
        Classification classification = assertDoesNotThrow(
                () -> classificationFactory.create(10)
        );
        assertNotNull(classification);
    }

    @Example
    void testHighClassificationCreate() {
        Classification classification = assertDoesNotThrow(
                () -> classificationFactory.create(21)
        );
        assertNotNull(classification);
    }

    @Example
    void testDefaultClassificationCreate() {
        Classification classification = assertDoesNotThrow(
                () -> classificationFactory.create(3)
        );
        assertNotNull(classification);
    }

    @Example
    void testRareClassificationCreate() {
        Classification classification = assertDoesNotThrow(
                () -> classificationFactory.create(-9999)
        );
        assertNotNull(classification);
    }

    @Property
    void testRandomClassificationNumbers(@ForAll int classificationNumber) {
        Classification classification = assertDoesNotThrow(
                () -> classificationFactory.create(classificationNumber)
        );
        assertNotNull(classification);
    }
}
