import java.awt.*;

/**
 * Created by Thomas on 6/24/2015.
 */
public class HeadPhone {

    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;
    private int volume = MEDIUM;
    private Boolean pluggedIn = false;
    private String manufacturer;
    private Color headPhoneColor;

    public HeadPhone() {

    }

    public HeadPhone(String manufacturer, Color headPhoneColor) {
        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
    }

    public String toString() {
        return "HeadPhone Information" +
                "\nManufacturer: " + manufacturer +
                "\nColor: " + headPhoneColor +
                "\nVolume: " + volume +
                "\nPlugged In: " + pluggedIn;
    }

    // Getters
    public int getVolume() {
        return volume;
    }

    public Boolean getPluggedIn() {
        return pluggedIn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }

    // Setters
    public void setVolumeHIGH() {
        this.volume = HIGH;
    }

    public void setVolumeMEDIUM() {
        this.volume = MEDIUM;
    }

    public void setVolumeLOW() {
        this.volume = LOW;
    }

    public void setPluggedIn(Boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }
}
