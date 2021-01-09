public class Account {

  private String accountNumber;
  private String password;
  private String name;

  public Account(String accountNumber, String name, String
      password) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }
}