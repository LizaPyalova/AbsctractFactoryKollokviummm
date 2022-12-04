public class NYXFactory implements MakeupFactory {
    @Override
    public String WhatIsIt(){
        return "It is NYX";
    }
    @Override
    public Eyeshadow createEyeshadow() {
        return new  NYXEyeshadow();
    }

    @Override
    public Lipstick createLipstick() {
        return new NYXLipstick();
    }
}
