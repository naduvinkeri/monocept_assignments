public class WindowsPhone extends SmartPhone {
    public WindowsPhone(Phone phone) {
        super(phone);
    }

    public String build() {
        return super.build() + addOS();
    }

    Private String addOS() {
        return "Windows Phone v1.0";
    }
    
}
