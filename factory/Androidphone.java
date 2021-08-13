public class Androidphone extends Phone {

    protected void createPhone() {
        specifications.add(new Androidcamera());
        specifications.add(new AndroidProcessor());
        specifications.add(new AndroidPanel());
    }
    
}
