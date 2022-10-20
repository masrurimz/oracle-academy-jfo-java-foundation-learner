public class CivitasAkademik {
  public int ID;
  public String nama;
  private String password;

  public CivitasAkademik(int ID, String nama, String password) {
    this.ID = ID;
    this.nama = nama;
    this.password = password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean checkPassword(String password) {
    if (this.password == password) {
      return true;
    }

    return false;
  }

  public String cetakInfo() {
    return "ID";
  }
}
