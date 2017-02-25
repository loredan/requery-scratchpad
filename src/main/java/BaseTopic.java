import java.io.Serializable;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;

/**
 * Created by loredan13 on 2/20/17.
 */

@Entity
public abstract class BaseTopic implements Serializable {

    @Key
    @Generated
    public long id;

    public String title;
    public int pages;

    @Override
    public String toString() {
        return title;
    }
}
