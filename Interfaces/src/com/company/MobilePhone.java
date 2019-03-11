package com.company;

public class MobilePhone implements ITelephone{
    private boolean isOn = false;
    private int myNumber;
    private boolean isRinging;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing" + phoneNumber);
        } else {
            System.out.println("its off");
        }

    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("answering");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("melody playing");
        } else {
            isRinging = false;
            System.out.println("not on");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
