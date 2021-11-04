package edu.polytech.ch6_tp3.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Log() {
    }

    public Log(Integer id, Date date, String content, User user) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.user = user;
    }

    public Log(Date date, String content, User user) {
        this.date = date;
        this.content = content;
        this.user = user;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
