package org.example;

public class Register {
    private Classification classification;
    public Register (AbstractFabric fabric){
        this.classification = fabric.createClassification();
    }

    public String emitClassification(){
        return this.classification.emitClassification();
    }
}
