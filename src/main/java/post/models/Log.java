package post.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.FileNotFoundException;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.sql.*;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date log_date;
    private String log_title;
    private String log_message;


    public Log(){}

    public Log(Integer id, Date log_date, String log_title, String log_message){
        this.id = id;
        this.log_date = log_date;
        this.log_title = log_title;
        this.log_message = log_message;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLog_date() {
        return log_date;
    }

    public void setLog_date(Date log_date) {
        this.log_date = log_date;
    }

    public String getLog_title() {
        return log_title;
    }

    public void setLog_title(String log_title) {
        this.log_title = log_title;
    }

    public String getLog_message() {
        return log_message;
    }

    public void setLog_message(String log_message) {
        this.log_message = log_message;
    }
}
