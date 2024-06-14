public class NotificaApp extends Notifica {
    private String app;

    public NotificaApp(String destinatario, String messaggio, String app) {
        super(destinatario, messaggio);
        this.app = app;
    }

    @Override
    String invia() {
        return "Apri la tua app: " + app + "Destinatario: " + destinatario + "messaggio: " + messaggio;

    }

    public String getApp() {
        return app;
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
