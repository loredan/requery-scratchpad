import java.io.Serializable;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.ManyToOne;

/**
 * Created by loredan13 on 2/20/17.
 */

@Entity
public abstract class BasePayment implements Serializable {
    @Key
    @Generated
    public long id;

    public long date;
    public int amount;

    @ManyToOne
    public BaseClient client;
}
