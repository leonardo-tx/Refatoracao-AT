package br.com.refactoring.exercise1;

public class MediumClassification implements Classification {
    public static int VALID_CLASSIFICATION = 10;

    private final int classification;

    public MediumClassification(int classification) {
        if (classification != VALID_CLASSIFICATION) {
            throw new IllegalArgumentException("The classification of a MediumClassification can only be 10.");
        }
        this.classification = classification;
    }

    @Override
    public String getLogMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MÉDIO\n");
        stringBuilder.append("DEBUG: z = ").append(classification);

        return stringBuilder.toString();
    }
}
