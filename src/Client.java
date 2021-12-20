public class Client extends Person implements Printable, ClickHandler{

    private int idClient;
    private String clientName;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Client(int idClient, String clientName) {
        this.idClient = idClient;
        this.clientName = clientName;
    }

    @Override
    public String getInfo() {
        return "this is class client, idClient = " + getIdClient() + " clientName = " + getClientName();
    }
}
