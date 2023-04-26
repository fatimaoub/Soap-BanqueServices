package ma.enset.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double Conversion(@WebParam(name="mantant")double mt){
        return mt*10.15;
    }
    @WebMethod(operationName = "GetCompte")
    public Compte GetCompte(@WebParam(name="code") int code){
        return new Compte(code,Math.random()*8888, new Date());
    }
    @WebMethod(operationName = "Listecomptes")
    List<Compte> Listecomptes(){
        return List.of(
                new Compte(1,Math.random()*8888, new Date()),
                new Compte(2,Math.random()*8888, new Date()),
                new Compte(3,Math.random()*8888, new Date())
        );
    }
}
