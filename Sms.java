public class Sms extends Notifica {
    private long numero;
    private String destinatario;
    private String messaggio;

    public Sms(String destinatario, String messaggio, long numero) {
        super(destinatario, messaggio);
        this.numero = numero;

    }

    @Override
    String invia() {
        return "Numero: "+numero+"Destinatario: "+ destinatario+ "messaggio: "+ messaggio;
    }

    public long getNumero() {
        return numero;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    

}
