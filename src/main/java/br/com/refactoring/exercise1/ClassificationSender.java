package br.com.refactoring.exercise1;

public class ClassificationSender {
    private final ClassificationFactory classificationFactory;
    private final Logger logger;

    public ClassificationSender(ClassificationFactory classificationFactory, Logger logger) {
        if (classificationFactory == null) {
            throw new IllegalArgumentException("The classificationFactory must not be null.");
        }
        if (logger == null) {
            throw new IllegalArgumentException("The logger must not be null.");
        }
        this.classificationFactory = classificationFactory;
        this.logger = logger;
    }

    public void send(int classificationNumber) {
        Classification classification = classificationFactory.create(classificationNumber);
        String message = classification.getLogMessage();

        logger.log(message);
    }
}
