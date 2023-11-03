package Model.BasicObjects;

public class Card {
    private String usuario;
    private int iD;
    private String publicKey;
    private double monto;
    private int cuotas;
    private int numeroDeTarjeta;
    private int codigoDeSeguridad;
    private int fechaDeVencimiento;
    private int codigoCVV;

    public String getUsuario() {
        return usuario;
    }

    public int getID() {
        return iD;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public double getMonto() {
        return monto;
    }

    public int getCuotas() {
        return cuotas;
    }

    public int getNumerodeTarjeta() {
        return numeroDeTarjeta;
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public int getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public int getCodigoCVV() {
        return codigoCVV;
    }

    public Card(String Usuario, int ID, String PublicKey, double Monto, int Cuotas, int NumeroDeTarjeta, int CodigoDeSeguridad, int FechaDeVencimiento, int CodigoCVV) {
        this.usuario = Usuario;
        this.iD = ID;
        this.publicKey = PublicKey;
        this.monto = Monto;
        this.numeroDeTarjeta = NumeroDeTarjeta;
        this.codigoDeSeguridad = CodigoDeSeguridad;
        this.fechaDeVencimiento = FechaDeVencimiento;
        this.codigoCVV = CodigoCVV;
    
    }

}
