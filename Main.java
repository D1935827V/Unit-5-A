public class Main {
  private String hostName;
  private String address;
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.hostName);
    Main invite = new Main();
    System.out.println(invite.inviteGuest("Mormonson", "1234 Nighthawk Lane", "Dane"));
  }
  public Main() {
    hostName = "Dane";
    address = "1234 Nighthawk Lane";
  }
  public String getHost() {
    return hostName;
  }
  public String setAddress(String newAddress) {
    address = newAddress;
    return address;
  }
  public String inviteGuest(String guest, String address, String hostName) {
    String inviteStatement = ("Hello" + guest + "come to" + address + "from" + hostName + ".");
    return inviteStatement;
  }
  public Main(String a) {
    address = a;
    hostName = "Host";
  }
}

