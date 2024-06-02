public class Operatore {
    // Private attributes
    private String idOperatore;
    private String nome;
    private String cognome;
    private String mail;
    private String username;
    private String password;
    private Operatore currentUser;

    public Operatore(String idOperatore, String nome, String cognome, String mail, String username, String password) {
        this.idOperatore = idOperatore;
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.currentUser = null;
    }

    // Public methods
    public void setIdAmministratore(String idAmministratore) {
        this.idOperatore = idAmministratore;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String username, String password) {
        String correctUsername = "admin";
        String correctPassword = "password";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public void logout() {
        this.currentUser = null;
        System.out.println("Logout successful");
    }

    public RichiestaUtenteSW categorizzaRichiesta(RichiestaUtenteSW richiesta) {
        if (richiesta.tipo == Cancellazione) {
            richiesta.setStato("in attesa di Cancellazione");
        }
        if (richiesta.tipo == Modifica) {
            richiesta.setStato("In attesa di modifica");
        }
        if (richiesta.tipo == Inserimento) {
            richiesta.setStato("In attesa di inserimento");
        }
        return richiesta;
    }

    public void gestisciRichiesta(RichiestaUtenteSW richiesta) {
        if (richiesta.stato == "in attesa di Cancellazione") {
            richiesta.gestisci(0);
        }
        if (richiesta.stato == "In attesa di modifica") {
            richiesta.gestici(1);
        }
        if (richiesta.stato == "In attesa di inserimento") {
            richiesta.gestici(2);
        }
    }
}
