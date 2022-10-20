public class Dosen extends CivitasAkademik {
  public String NIDN;

  public Dosen(int ID, String nama, String password, String NIDN) {
    super(ID, nama, password);

    this.NIDN = NIDN;
  }
}
