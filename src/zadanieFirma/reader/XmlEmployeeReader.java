package zadanieFirma.reader;

import org.omg.CORBA.Object;
import zadanieFirma.Pracownik;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlEmployeeReader extends EmployeeReader {
    public XmlEmployeeReader(String path) {
        super(path);
    }

    @Override
    public Pracownik[] odczytajPracownikow() {
        //dostarcza wejście do API
        try{
            JAXBContext context = JAXBContext.newInstance(Pracownik.class);
            //obiekt, który umożliwi odczyt z pliku - unmarshaller(z java do XML)
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Pracownik unmarshal = (Pracownik) unmarshaller.unmarshal(new File(getPath()));
        } catch (JAXBException e){
            e.printStackTrace();
        }

        return new Pracownik[0];
    }


}
