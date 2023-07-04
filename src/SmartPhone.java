public class SmartPhone extends SmartDevice {
    String megaPixelsCamara;
    boolean gps;

    public SmartPhone(){
        super();
    }
    public SmartPhone(String resolucionPixeles, String marca, boolean camara, String megaPixelsCamara, boolean gps) {
        super(resolucionPixeles, marca, camara);
        this.megaPixelsCamara = megaPixelsCamara;
        this.gps = gps;
    }
}
