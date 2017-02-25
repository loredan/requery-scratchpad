import java.io.Serializable;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.ManyToOne;

/**
 * Created by loredan13 on 2/20/17.
 */

@Entity
public abstract class BaseTest implements Serializable {

    @Key
    @Generated
    public long id;

    @ManyToOne
    public BaseTopic topic;

    public int variants;

    @Override
    public String toString() {
        return ((Test) this).getTopic().title;
    }
}
