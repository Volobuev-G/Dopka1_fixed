package com.dop;

public class NegativeNumberException extends Exception{
    private String code;
    private int number;
    NegativeNumberException(String message) {
        super(message);
    }
    public NegativeNumberException(String code, String message) {
        super(message);
        this.setCode(code);
    }
    public NegativeNumberException(int number, String message) {
        super(message);
        this.setNumber(number);
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

}
