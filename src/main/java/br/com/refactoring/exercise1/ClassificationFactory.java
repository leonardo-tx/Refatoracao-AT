package br.com.refactoring.exercise1;

public class ClassificationFactory {
    public Classification create(int classificationNumber) {
        if (classificationNumber > HighClassification.MAX_INVALID_CLASSIFICATION) {
            return new HighClassification(classificationNumber);
        }
        if (classificationNumber == MediumClassification.VALID_CLASSIFICATION) {
            return new MediumClassification(classificationNumber);
        }
        if (classificationNumber == RareClassification.VALID_CLASSIFICATION) {
            return new RareClassification(classificationNumber);
        }
        return new DefaultClassification(classificationNumber);
    }
}
