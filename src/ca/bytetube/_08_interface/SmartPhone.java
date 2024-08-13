package ca.bytetube._08_interface;

public class SmartPhone extends NormalPhone implements GPS, Radio {
    @Override
    public void getCoordinates() {
        System.out.println("SmartPhone gets Coordinates");
    }



    @Override
    public void startRadio() {
        System.out.println("SmartPhone starts Radio");
    }

    @Override
    public void stopRadio() {
        System.out.println("SmartPhone stops Radio");

    }


    @Override
    public void func() {

    }


}
