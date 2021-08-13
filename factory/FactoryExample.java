public class FactoryExample {

    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone(phoneType.ANDROID);
        Phone iphone = PhoneFactory.getPhone(phoneType.IPHONE);

        System.out.println(android);
        System.out.println(iphone);
    }
    
}
