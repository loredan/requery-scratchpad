import java.io.Serializable;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.ManyToOne;

/**
 * Created by loredan13 on 2/20/17.
 */

@Entity
public abstract class BaseLesson implements Serializable {
    @Key
    @Generated
    public long id;

    public long week;
    public int day;
    public int lesson;
    public int lessonPrice;
    public boolean paid;
    public boolean attended;
    public boolean extra;
    public int homeworkPage;
    public int testVariant;

    @ManyToOne
    public BaseClient client;

    @ManyToOne
    public BaseTopic homeworkTopic;

    @ManyToOne
    public BaseTest test;
}
