public class UtenteRegistrato extends UtenteGenerico {
  // Private attributes
  private String idUtente;
  private String username;
  private String password;
  private String mail;
  private String nome;
  private String cognome;
  private UtenteRegistrato currentUser;

  // Public methods
  public void setIdUtente(String idUtente) {
    this.idUtente = idUtente;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setMail(String mail) {
    this.mail = mail;
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
}