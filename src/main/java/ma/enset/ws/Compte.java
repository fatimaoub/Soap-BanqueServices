package ma.enset.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int Code;
    private double Solde;
    @XmlTransient
    private Date Date_Creation;

    public Compte() {
    }

    public Compte(int code, double solde, Date date_Creation) {
        Code = code;
        Solde = solde;
        Date_Creation = date_Creation;
    }

    public int getCode() {
        return Code;
    }
    public void setCode(int code) {
        Code = code;
    }
    public double getSolde() {
        return Solde;
    }
    public void setSolde(double solde) {
        Solde = solde;
    }
    public Date getDate_Creation() {
        return Date_Creation;
    }
    public void setDate_Creation(Date date_Creation) {
        Date_Creation = date_Creation;
    }
}
