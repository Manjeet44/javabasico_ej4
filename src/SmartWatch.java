public class SmartWatch extends SmartDevice {
    int ritmoCardiaco;
    boolean wifi;

    public SmartWatch(String resolucionPixeles, String marca, boolean camara, int ritmoCardiaco, boolean wifi) {
        super(resolucionPixeles, marca, camara);
        this.ritmoCardiaco = ritmoCardiaco;
        this.wifi = wifi;
    }
}
