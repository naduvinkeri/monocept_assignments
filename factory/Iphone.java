public class Iphone extends Phone {
    protected void createPhone() {
        specifications.add(new Iphonecamera());
        specifications.add(new Iphonepanel());
        specifications.add(new IphoneProcessor());
    }
    
}
