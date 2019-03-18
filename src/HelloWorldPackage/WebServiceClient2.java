package HelloWorldPackage;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class WebServiceClient2 {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:8088/HelloWorldPackage.HelloWorld?wsdl");

        QName qName = new QName("http://HelloWorldPackage/", "HelloWorldService");

        Service service = Service.create(url, qName);
        IHelloWorld _helloWorld = service.getPort(IHelloWorld.class);

        String request = "To ja - klient 2";
        String response = _helloWorld.getHelloWorldAsString(request);

        System.out.println("Klient wysłał: " + request);
        System.out.println("Klient otrzymał: " + response);
    }
}
