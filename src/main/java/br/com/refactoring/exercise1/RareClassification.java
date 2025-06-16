package br.com.refactoring.exercise1;

public class RareClassification implements Classification {
    public static int VALID_CLASSIFICATION = -9999;

    private final int classification;

    public RareClassification(int classification) {
        if (classification != VALID_CLASSIFICATION) {
            throw new IllegalArgumentException("The classification of a RareClassification can only be -9999.");
        }
        this.classification = classification;
    }

    @Override
    public String getLogMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CASO RARO\n");
        stringBuilder.append("DEBUG: z = ").append(classification);

        return stringBuilder.toString();
    }
}
