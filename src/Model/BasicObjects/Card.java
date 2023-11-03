package Model.BasicObjects;

public class Card {
    public String Usuario;
    public int ID;
    public String PublicKey;
    public double Monto;
    public int Cuotas;
    public int NumeroDeTarjeta;
    public int CodigoDeSeguridad;
    public int FechaDeVencimiento;
    public int CodigoCVV;

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
    
    public Card(String Usuario, int ID, String PublicKey, double Monto, int Cuotas, int NumeroDeTarjeta,
        int CodigoDeSeguridad, int FechaDeVencimiento, int CodigoCVV) {
        this.Usuario = Usuario;
        this.ID = ID;
        this.PublicKey = PublicKey;
        this.Monto = Monto;
        this.NumeroDeTarjeta = NumeroDeTarjeta;
        this.CodigoDeSeguridad = CodigoDeSeguridad;
        this.FechaDeVencimiento = FechaDeVencimiento;
        this.CodigoCVV = CodigoCVV;

    }

    @Override
    public String toString() {
        return "Card [CodigoCVV=" + CodigoCVV + ", CodigoDeSeguridad=" + CodigoDeSeguridad + ", Cuotas=" + Cuotas
                + ", FechaDeVencimiento=" + FechaDeVencimiento + ", ID=" + ID + ", Monto=" + Monto
                + ", NumeroDeTarjeta=" + NumeroDeTarjeta + ", PublicKey=" + PublicKey + ", Usuario=" + Usuario + "]";
    }

}
