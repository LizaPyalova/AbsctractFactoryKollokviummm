public class MACFactory implements MakeupFactory {
    @Override
    public String WhatIsIt(){
        return "It is MAC";
    }
    @Override
    public Eyeshadow createEyeshadow() {
        return new  MACEyeshadow();
    }

    @Override
    public Lipstick createLipstick() {
        return new MACLipstick();
    }
}
