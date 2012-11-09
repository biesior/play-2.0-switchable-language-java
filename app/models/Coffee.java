package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coffee extends Model {

    @Id
    public Integer id;

    @Constraints.Required()
    @Constraints.MinLength(5)
    public String name;

    public static Finder<Integer, Coffee> find
            = new Finder<Integer, Coffee>(Integer.class, Coffee.class);

}
