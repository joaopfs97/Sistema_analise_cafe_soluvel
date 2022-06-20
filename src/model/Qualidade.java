package model;

public class Qualidade {
    private int codigoQualidade;
    private String nomeQualidade;
    private int porcentCafeConilon;
    private int porcentCafeArabica;
    
    public int getCodigoQualidade() {
        return codigoQualidade;
    }
    
    public void setCodigoQualidade(int codigoQualidade){
        this.codigoQualidade = codigoQualidade;
    }

    public String getNomeQualidade() {
        return nomeQualidade;
    }

    public void setNomeQualidade(String nomeQualidade) {
        this.nomeQualidade = nomeQualidade;
    }

    public int getPorcentCafeConilon() {
        return porcentCafeConilon;
    }

    public void setPorcentCafeConilon(int porcentCafeConilon) {
        this.porcentCafeConilon = porcentCafeConilon;
    }

    public int getPorcentCafeArabica() {
        return porcentCafeArabica;
    }

    public void setPorcentCafeArabica(int porcentCafeArabica) {
        this.porcentCafeArabica = porcentCafeArabica;
    }
    
    
}
