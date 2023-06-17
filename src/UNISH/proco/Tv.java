package UNISH.proco;

public class Tv {
    int channel, volumeLevel;
    boolean on;

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    boolean isOn() {
        return on;
    }

    void volumeUp(int inc) {
        int increase = volumeLevel + inc;
        if (increase <= 8) {
            volumeLevel = increase;
        }
    }

    void volumeDown(int dec) {
        int decrease = volumeLevel + dec;
        if (decrease >= 0) {
            volumeLevel = decrease;
        }
    }

    void channelUp(int ch) {
        int increase = channel + ch;
        if (increase <= 100) {
            channel = increase;
        }
    }

    void channelDown(int ch) {
        int decrease = channel - ch;
        if (decrease >= 0) {
            channel = decrease;
        }
    }
    public String toString(){
        String onner = on ? "on" : "off";
      return
              "TV is " + onner + " and current channel is " + channel + " and current volume level is " + volumeLevel + ".";
    }
}
