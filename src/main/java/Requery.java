import io.requery.Persistable;
import io.requery.reactivex.ReactiveEntityStore;
import io.requery.reactivex.ReactiveSupport;
import io.requery.sql.Configuration;
import io.requery.sql.ConfigurationBuilder;
import io.requery.sql.EntityDataStore;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

/**
 * Created by loredan13 on 2/14/17.
 */

public class Requery {

    private static ReactiveEntityStore<Persistable> dataStore;

    public static void init() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:schedule.db");
        Configuration configuration = new ConfigurationBuilder(dataSource, Models.DEFAULT).useDefaultLogging().build();
        dataStore = ReactiveSupport.toReactiveStore(new EntityDataStore<Persistable>(configuration));
    }

    public static ReactiveEntityStore<Persistable> getDataStore() {
        return dataStore;
    }
}
