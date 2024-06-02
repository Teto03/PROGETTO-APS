import java.time.LocalDate;

public class PrenotazioneSW {
  // Ogni prenotazione ha un id univoco
  private int idPrenotazione;

  // Numero di persone che partecipano alla prenotazione
  private int numeroPersone;

  // Informazioni sul costo della prenotazione
  private double caparra;
  private double saldo;

  // Informazioni sulla periodo della prenotazione
  private LocalDate dataInizio;
  private LocalDate dataFine;

  // Prodotto scelto dal cliente
  private Prodotto prodotto;

  // Implementazione metodi
  public PrenotazioneSW(int idPrenotazione, int numeroPersone, double caparra,
      double saldo, LocalDate dataInizio,
      LocalDate dataFine, Prodotto prodotto) {
    this.idPrenotazione = idPrenotazione;
    this.numeroPersone = numeroPersone;
    this.caparra = caparra;
    this.saldo = saldo;
    this.dataInizio = dataInizio;
    this.dataFine = dataFine;
    this.prodotto = prodotto;
  }

  // Getter e Setter
  public int getIdPrenotazione() {
    return idPrenotazione;
  }

  public void setIdPrenotazione(int idPrenotazione) {
    this.idPrenotazione = idPrenotazione;
  }

  public int getNumeroPersone() {
    return numeroPersone;
  }

  public void setNumeroPersone(int numeroPersone) {
    this.numeroPersone = numeroPersone;
  }

  public double getCaparra() {
    return caparra;
  }

  public void setCaparra(double caparra) {
    this.caparra = caparra;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public LocalDate getDataInizio() {
    return dataInizio;
  }

  public void setDataInizio(LocalDate dataInizio) {
    this.dataInizio = dataInizio;
  }

  public LocalDate getDataFine() {
    return dataFine;
  }

  public void setDataFine(LocalDate dataFine) {
    this.dataFine = dataFine;
  }

  public Prodotto getProdotto() {
    return prodotto;
  }

  public void setProdotto(Prodotto prodotto) {
    this.prodotto = prodotto;
  }
}
