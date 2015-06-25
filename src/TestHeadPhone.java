import java.awt.*;

/**
 * Created by Thomas on 6/24/2015.
 */
public class TestHeadPhone {

    public static void main(String[] args) {

        // Create a new HeadPhone object
        HeadPhone classic = new HeadPhone("Sony", Color.black);

        // Displays the defaults from the given arguments
        System.out.println("\n===toString Method===\n");
        System.out.println(classic.toString());


        // Shows use of the setter methods
        classic.setPluggedIn(true);
        classic.setVolumeHIGH();
        // For this object, I won't set the manufacturer or color

        // Going through the getter methods
        System.out.println("\n===Getter Methods===\n");
        System.out.println("Manufacturer: " + classic.getManufacturer() +
                "\nColor: " + classic.getHeadPhoneColor() +
                "\nVolume: " + classic.getVolume() +
                "\nPlugged In: " + classic.getPluggedIn());


        // Experimenting with creating an array of HeadPhone objects
        HeadPhone[] phones = new HeadPhone[2];

        // Initialize the two HeadPhone objects
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new HeadPhone();
        }

        // Sets the manufacturer for the two new HeadPhones
        phones[0].setManufacturer("Samsung");
        phones[1].setManufacturer("JBL");

        // Sets the color for the two new HeadPhones
        phones[0].setHeadPhoneColor(Color.red);
        phones[1].setHeadPhoneColor(Color.lightGray);

        // Sets the volume for the new HeadPhones
        phones[0].setVolumeLOW();
        phones[1].setVolumeMEDIUM();

        // For each loop to display getter methods
        for (HeadPhone phone : phones) {
            System.out.println("\n===Getter  Methods===\n");
            System.out.println("Manufacturer: " + phone.getManufacturer() +
                    "\nColor: " + phone.getHeadPhoneColor() +
                    "\nVolume: " + phone.getVolume() +
                    "\nPlugged In: " + phone.getPluggedIn());
        }

        // For each loop to print the HeadPhone array
        for (HeadPhone phone : phones) {
            System.out.println("\n===toString Method===\n");
            System.out.println(phone.toString());
        }
    }
}
