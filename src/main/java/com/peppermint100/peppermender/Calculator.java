package com.peppermint100.peppermender;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {

    private int targetA;
    private int targetB;

    public int add(){
        return this.targetA + this.targetB;
    }

    public int multiply(){
        return this.targetA * this.targetB;
    }

    public int subtract() {
        return this.targetB - this.targetA;
    }
}
