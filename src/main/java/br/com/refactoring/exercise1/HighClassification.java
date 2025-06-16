package br.com.refactoring.exercise1;

public class HighClassification implements Classification {
    public static int MAX_INVALID_CLASSIFICATION = 10;

    private final int classification;

    public HighClassification(int classification) {
        if (classification <= MAX_INVALID_CLASSIFICATION) {
            throw new IllegalArgumentException("The classification of a HighClassification can only be greater than 10.");
        }
        this.classification = classification;
    }

    @Override
    public String getLogMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ALTO\n");
        stringBuilder.append("DEBUG: z = ").append(classification).append('\n');
        stringBuilder.append("ALTO");

        return stringBuilder.toString();
    }
}
