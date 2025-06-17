package br.com.refactoring.exercise2;

/*
A refatoração não é completa! Apenas extrai o process em pedaços menores.
Assim, eliminando um dos muitos code smells do código.
*/

public class Invoice {
    public String clientName;
    public String clientEmail;
    public double amount;
    public int type;

    public void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }

    public void process() {
        printIfClientEmailIsInvalid();
        printHeaderInvoiceType();

        String invoice = generateInvoice();

        //imprimir nota
        System.out.println(invoice);

        // Enviar nota para email
        System.out.println("Enviando nota fiscal para: " + clientEmail);
        enviarPorEmail(clientEmail, invoice);
    }

    private void printIfClientEmailIsInvalid() {
        if (clientEmail == null && !clientEmail.contains("@")) {
            System.out.println("Email inválido. Falha no envio.");
        }
    }

    private void printHeaderInvoiceType() {
        String message = switch (type) {
            case 1 -> "Nota fiscal simples";
            case 2 -> "Nota fiscal com imposto";
            // caso nunca ocorre, mas está presente
            case -1 -> "Nota fiscal fantasma";
            default -> "Tipo desconhecido";
        };
        System.out.println(message);
    }

    private String generateInvoice() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--- NOTA FISCAL ---\n");
        stringBuilder.append("Cliente: ").append(clientName).append("\n");
        stringBuilder.append("Valor: R$ ").append(amount).append("\n");
        stringBuilder.append("Tipo: ").append(getInvoiceType()).append("\n");
        stringBuilder.append("---------------------");

        return stringBuilder.toString();
    }

    private String getInvoiceType() {
        return switch (type) {
            case 1 -> "Simples";
            case 2 -> "Com imposto";
            default -> "Desconhecido";
        };
    }
}
