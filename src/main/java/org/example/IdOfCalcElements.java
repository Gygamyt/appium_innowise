package org.example;

public enum IdOfCalcElements {

    ONE("b030"),
    TWO("b031"),
    THREE("b032"),
    MINUS("b033"),
    FOUR("b020"),
    FIVE("b021"),
    SIX("b022"),
    MULTIPLICATION("b023"),
    SEVEN("b010"),
    EIGHT("b011"),
    NINE("b012"),
    DIVISION("b013"),
    ZERO("b040"),
    DOT("b041"),
    PLUS("b043"),
    RESULT("b044");

    private String id;

    IdOfCalcElements(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
