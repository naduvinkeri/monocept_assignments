public class AdapterExample {
    public static void main(String[] args) {
        
        AndroidCharger androidCharger = new androidCharger();
        AndroidPhone androidPhone = new OnePlus();

        IPhoneCharger iphoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhoneX();
        iPhoneCharger.charge(iPhone);

        AndroidToIPhoneAdapter adapter = new AndroidToIPhoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);
    } {
        
    }
}
