package edu.escuelaing.arep.app.model;

/**
 * Represents a square root
 */
public class Raiz {

    private String operation;

    private Double input;

    private Double output;

    public Raiz() {}

    public Raiz(String operation, Double input, Double output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }
}