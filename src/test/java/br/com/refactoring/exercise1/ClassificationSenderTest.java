package br.com.refactoring.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClassificationSenderTest {
    @Mock
    private Logger logger;

    @Mock
    private ClassificationFactory classificationFactory;

    @InjectMocks
    private ClassificationSender classificationSender;

    @Test
    void testNullLoggerOnConstruct() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new ClassificationSender(classificationFactory, null)
        );
        assertEquals("The logger must not be null.", exception.getMessage());
    }

    @Test
    void testNullFactoryOnConstruct() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new ClassificationSender(null, logger)
        );
        assertEquals("The classificationFactory must not be null.", exception.getMessage());
    }

    @Test
    void testSend() {
        int classificationNumber = 1;
        String message = "TEST MESSAGE";

        Classification classification = mock(Classification.class);
        when(classification.getLogMessage()).thenReturn(message);
        when(classificationFactory.create(classificationNumber)).thenReturn(classification);

        classificationSender.send(1);
        verify(logger).log(message);
    }
}
