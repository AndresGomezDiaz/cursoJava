public class EjemploXml {
    public static void main(String[] args) {
        final  String expectedXmlDocument = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:con=\"http://Controller.Ws.Elektra.Com/\">\n" +
                "<soapenv:Header/>\n" +
                "<soapenv:Body>\n" +
                "<con:consultaKYCXld>\n" +
                "<request>\n" +
                "<paisId>1</paisId>\n" +
                "<cliente>\n" +
                "<nombre>EDUARDO</nombre>\n" +
                "<segundoNombre>ISMAEL</segundoNombre>\n" +
                "<apellidoPaterno>ESPINOSA</apellidoPaterno>\n" +
                "<apellidoMaterno>GOMEZ</apellidoMaterno>\n" +
                "<otroApellido/>\n" +
                "<fechaNacimiento>16/07/1990</fechaNacimiento>\n" +
                "</cliente>\n" +
                "<uid>UID65451684984</uid>\n" +
                "</request>\n" +
                "</con:consultaKYCXld>\n" +
                "</soapenv:Body>\n" +
                "</soapenv:Envelope>";


    }
}
