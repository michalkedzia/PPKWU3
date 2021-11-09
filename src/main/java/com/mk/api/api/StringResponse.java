package com.mk.api.api;

public class StringResponse {
    private String parameter;
    private int length;
    private Long digits;
    private Long upperCase;
    private Long lowerCase;
    private Long whitespace;

    public String getParameter() {
        return parameter;
    }

    public int getLength() {
        return length;
    }

    public Long getDigits() {
        return digits;
    }

    public Long getUpperCase() {
        return upperCase;
    }

    public Long getLowerCase() {
        return lowerCase;
    }

    public Long getWhitespace() {
        return whitespace;
    }

    public Long getSpecialCharacters() {
        return specialCharacters;
    }

    private Long specialCharacters;

    public StringResponse(String parameter) {
        this.parameter = parameter;
        this.length = parameter.length();
        this.digits = 0L;
        this.upperCase = 0L;
        this.lowerCase = 0L;
        this.whitespace = 0L;
        this.specialCharacters = 0L;
    }

    public void addDigit() {
        this.digits++;
    }

    public void addUpperCase() {
        this.upperCase++;
    }

    public void addLowerCase() {
        this.lowerCase++;
    }

    public void addWhitespace() {
        this.whitespace++;
    }

    public void addSpecialCharacter() {
        this.specialCharacters++;
    }

    public String toText() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("parameter: ");
        stringBuilder.append(parameter);
        stringBuilder.append("\n");
        stringBuilder.append("digits: ");
        stringBuilder.append(digits);
        stringBuilder.append("\n");
        stringBuilder.append("upperCase: ");
        stringBuilder.append(upperCase);
        stringBuilder.append("\n");
        stringBuilder.append("lowerCase: ");
        stringBuilder.append(lowerCase);
        stringBuilder.append("\n");
        stringBuilder.append("whitespace: ");
        stringBuilder.append(whitespace);
        stringBuilder.append("\n");
        stringBuilder.append("specialCharacters: ");
        stringBuilder.append(specialCharacters);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public String toCSV() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("parameter,");
        stringBuilder.append("digits,");
        stringBuilder.append("upperCase,");
        stringBuilder.append("lowerCase,");
        stringBuilder.append("whitespace,");
        stringBuilder.append("specialCharacters");
        stringBuilder.append("\n");
        stringBuilder.append(parameter);
        stringBuilder.append(",");
        stringBuilder.append(digits);
        stringBuilder.append(",");
        stringBuilder.append(upperCase);
        stringBuilder.append(",");
        stringBuilder.append(lowerCase);
        stringBuilder.append(",");
        stringBuilder.append(whitespace);
        stringBuilder.append(",");
        stringBuilder.append(specialCharacters);
        return stringBuilder.toString();
    }
}
