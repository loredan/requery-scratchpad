/**
 * Created by loredan13 on 2/15/17.
 */
public class Main {
    public static void main(String... args) {
        Requery.init();

        Client client = Requery.getDataStore().select(Client.class).get().first();

        System.out.println(client.getPayments().size());

        Payment test = new Payment();
        test.setClient(client);
        test.setAmount(0);
        test.setDate(0);
        Requery.getDataStore().insert(test).blockingGet();

        System.out.println(client.getPayments().size());
        System.out.println(Requery.getDataStore().select(Client.class).get().first().getPayments().size());

        client = Requery.getDataStore().refresh(client).blockingGet();

        System.out.println(client.getPayments().size());
        System.out.println(Requery.getDataStore().select(Client.class).get().first().getPayments().size());

        Requery.getDataStore().delete(Payment.class).get().single().blockingGet();
    }
}
