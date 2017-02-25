import java.io.Serializable;
import java.util.List;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;
import io.requery.OneToMany;

/**
 * Created by loredan13 on 2/20/17.
 */

@Entity
public abstract class BaseClient implements Serializable {
    @Key
    @Generated
    public long id;
    public String uuid;
    public String name;
    public long birthDate;
    public String school;
    public String className;
    public String parentName;
    public String phone;
    public long consultationDate;
    public long firstLessonDate;
    public int lessonPrice;
    public String schedule;
    public int leftover;

    @OneToMany
    public List<BasePayment> payments;

    @OneToMany
    public List<BaseLesson> lessons;
}
