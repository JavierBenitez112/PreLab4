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

    /**
     * @return
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * @return
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @return
     */
    public int getCuotas() {
        return cuotas;
    }

    /**
     * @return
     */
    public int getNumerodeTarjeta() {
        return numeroDeTarjeta;
    }

    /**
     * @return
     */
    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    /**
     * @return
     */
    public int getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    /**
     * @return
     */
    public int getCodigoCVV() {
        return codigoCVV;
    }

    /**
     * @param Usuario
     * @param ID
     * @param PublicKey
     * @param Monto
     * @param Cuotas
     * @param NumeroDeTarjeta
     * @param CodigoDeSeguridad
     * @param FechaDeVencimiento
     * @param CodigoCVV
     */
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
