package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    public void shouldReturnEi(){
        Register register = new Register(new FabricEi());
        assertEquals(register.emitClassification(), "EI Classification");
    }
    @Test
    public void shouldReturnMei(){
        Register register = new Register(new FabricMei());
        assertEquals(register.emitClassification(), "MEI Classification");
    }
    @Test
    public void shouldReturnMe(){
        Register register = new Register(new FabricMe());
        assertEquals(register.emitClassification(), "ME Classification");
    }

}