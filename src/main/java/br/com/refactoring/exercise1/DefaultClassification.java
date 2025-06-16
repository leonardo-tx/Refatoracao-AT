package br.com.refactoring.exercise1;

public class DefaultClassification implements Classification {
    private final int classification;

    public DefaultClassification(int classification) {
        this.classification = classification;
    }

    @Override
    public String getLogMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BAIXO\n");
        stringBuilder.append("DEBUG: z = ").append(classification);

        return stringBuilder.toString();
    }
}
