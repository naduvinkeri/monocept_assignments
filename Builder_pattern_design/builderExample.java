public class builderExample {

    public static void main(String[] args) {

        Phone.Builder builder = new Phone.Builder()
                .backPanel("sandstone")
                .frontPanel("AMOLED")
                .Processor("sanpdragon")
                .Camera("12 MP");

        Phone phone = builder.build();

        system.out.println(phone);
        
    }
    
}
