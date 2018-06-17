package com.example.whatevs;

public class SpeakerSystem {

    private Tweeter tweeterLeft;
    private Tweeter tweeterRight;
    private Woofer woofer;
    private Receiver receiver;

    public SpeakerSystem() {}

    public Tweeter getTweeterLeft() {
        return tweeterLeft;
    }

    public void setTweeterLeft(Tweeter tweeterLeft) {
        this.tweeterLeft = tweeterLeft;
    }

    public Tweeter getTweeterRight() {
        return tweeterRight;
    }

    public void setTweeterRight(Tweeter tweeterRight) {
        this.tweeterRight = tweeterRight;
    }

    public Woofer getWoofer() {
        return woofer;
    }

    public void setWoofer(Woofer woofer) {
        this.woofer = woofer;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}