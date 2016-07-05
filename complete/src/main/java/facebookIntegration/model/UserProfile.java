package facebookIntegration.model;


import javax.persistence.*;

/**
 * Created by matthewb on 6/21/16.
 */



@Entity
@Table(name = "users")

public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String gender;

    public UserProfile(){}

    public UserProfile(long id){
        this.id = id;
    }

    public UserProfile(String name,String gender){
        this.name = name;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
