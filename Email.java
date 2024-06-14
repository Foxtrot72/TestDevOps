public class Email extends Notifica {
    private String oggetto;
    public Email(String destinatario, String messaggio,String oggetto) {
        super(destinatario, messaggio);
        this.oggetto=oggetto;

    }

    @Override
    String invia() {

        return "\nDestinatario: "+ destinatario + "\n\tOggetto: " +this.oggetto+ "Messaggio: "+ messaggio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

}
