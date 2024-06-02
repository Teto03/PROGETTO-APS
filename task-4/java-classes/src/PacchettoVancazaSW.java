import javax.xml.catalog.Catalog;

public class PacchettoVacanzaSW extends ProdottoSW {
  // Ogni pacchetto ha un id univoco
  private int idPacchetto;

  // Informazioni sul periodo di soggiorno
  private LocalDate dataInizio;
  private LocalDate dataFine;

  // Disponibilità del pacchetto (numero di posti disponibili)
  private int disponibilita;

  // Località di destinazione
  private String localita;

  // Descrizione del pacchetto
  private String descrizione;

  // Implementazione metodi
  public PacchettoVacanzaSW(int idPacchetto, LocalDate dataInizio,
      LocalDate dataFine, int disponibilita,
      String localita, String descrizione) {
    this.idPacchetto = idPacchetto;
    this.dataInizio = dataInizio;
    this.dataFine = dataFine;
    this.disponibilita = disponibilita;
    this.localita = localita;
    this.descrizione = descrizione;
  }

  // Getter e Setter
  public int getIdPacchetto() {
    return idPacchetto;
  }

  public void setIdPacchetto(int idPacchetto) {
    this.idPacchetto = idPacchetto;
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

  public int getDisponibilita() {
    return disponibilita;
  }

  public void setDisponibilita(int disponibilita) {
    this.disponibilita = disponibilita;
  }

  public String getLocalita() {
    return localita;
  }

  public void setLocalita(String localita) {
    this.localita = localita;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  // Metodo per la modifica di un pacchetto di viaggio
  public PacchettoVacanzaSW modificaPacchetto(LocalDate dataInizio,
      LocalDate dataFine, int disponibilita,
      String localita, String descrizione) {

    PacchettoVacanzaSW pacchettoModificato = new PacchettoVacanzaSW(
        this.idPacchetto, dataInizio, dataFine, disponibilita, localita,
        descrizione);

    // Chiama salva modifica passandogli il catalogo a cui appartiene il
    // pacchetto
    this.salvaModifica();

    return pacchettoModificato;
  }

  // Metodo per il salvataggio delle modifiche
  public boolean salvaModifica() {
    CatalogoSW catalogo = CatalogoSW.getInstance();

    // Scorri il catalogo alla ricerca del pacchetto da modificare
    for (PacchettoVacanzaSW pacchetto : catalogo.getPacchetti()) {
      if (pacchetto.getIdPacchetto() == this.idPacchetto) {
        // Rimuovi dal catalogo il vecchio pacchetto
        catalogo.cancellaPacchettoVacanza(pacchetto);

        // Aggiungi al catalogo il pacchetto modificato
        catalogo.aggiungiPacchettoVacanza(this);

        return true;
      }
    }
  }

}