public class ApplePhone extends SmartPhone {
    public ApplePhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build + addOs();

    }

    private String addOS() {
        return "IOS v1.0";
    }
    
}
