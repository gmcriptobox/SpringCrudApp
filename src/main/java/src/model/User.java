package src.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column
    @NotEmpty(message = "name should not be empty")
    @Size(min = 1, max = 50, message = "Invalid size name")
    private String name;

    @Column
    @NotEmpty(message = "secondName should not be empty")
    @Size(min = 1, max = 50, message = "Invalid size secondName")
    private String secondName;

    @Column
    @NotEmpty(message = "number should not be empty")
    @Size(min = 11, max = 12, message = "Invalid size number")
    private String number;

    @Column
    @NotEmpty(message = "mail should not be empty")
    @Email(message = "Invalid mail")
    private String mail;

    public User(String name, String secondName, String number, String mail) {
        this.name = name;
        this.secondName = secondName;
        this.number = number;
        this.mail = mail;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
