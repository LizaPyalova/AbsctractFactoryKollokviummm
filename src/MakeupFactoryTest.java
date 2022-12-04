import static org.junit.jupiter.api.Assertions.*;

class MakeupFactoryTest {
    @org.junit.jupiter.api.Test
    void Test1(){
        MakeupFactory factory;
        factory = new MACFactory();
        Eyeshadow one =  factory.createEyeshadow();
        assertEquals(factory.WhatIsIt(), "It is MAC");
    }
    @org.junit.jupiter.api.Test
    void Test2(){
        MakeupFactory factory;
        factory = new NYXFactory();
        Eyeshadow one =  factory.createEyeshadow();
        assertEquals(factory.WhatIsIt(), "It is NYX");
    }


}