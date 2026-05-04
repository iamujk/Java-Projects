package org.example.model;

public class NumbersBasedOnDifficulty {
    private String operator1;
    private Integer[] numbers;


    public Integer[] getNumbers() {
        return numbers;
    }

    public String getOperator() {
        return operator1;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

    public void setOperator(String operator) {
        this.operator1 = operator;
    }

}
