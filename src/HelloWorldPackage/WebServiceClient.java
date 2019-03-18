package HelloWorldPackage;

public class WebServiceClient {

    public static void main2(String[] args){

        HelloWorldService service = new HelloWorldService();
        IHelloWorld _helloWorld = service.getHelloWorldPort();

        String request = "To ja - klient";
        String response = _helloWorld.getHelloWorldAsString(request);

        System.out.println("Klient wysłał: " + request);
        System.out.println("Klient otrzymał: " + response);
    }
}
