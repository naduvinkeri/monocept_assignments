public class DecoratorExample {

    public static void main(String[] args) {

        Phone androidPhone = new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());

        Phone applePhone = new ApplePhone(new BasicPhone());
        System.out.println(applePhone.build());

        Phone nokiawindowsPhone = new NokiaPhone(new WindowsPhone(new BasicPhone()));
        System.out.println(nokiawindowsPhone.build());

        Phone nokiaAndroidPhone = new AndroidPhone(new WindowsPhone(new BasicPhone()));
        System.out.println(nokiaAndroidPhone.build());


    }
    
}
