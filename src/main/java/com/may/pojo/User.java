package com.may.pojo;


import java.util.Map;

//alt+鼠标左键 整列编辑
public class User {
    private Integer db_userid;
    private String db_username;
    private String db_password;

    private Integer db_age;
    private String db_phone;
    private Integer db_level;
    private String db_location;


    public void MapCastToUser(Map<String,String[]> map){
        this.db_location=map.get("location")[0];
        this.db_username=map.get("username")[0];
        this.db_age= new Integer(map.get("age")[0]);
        this.db_password=map.get("password")[0];
        this.db_phone=map.get("number")[0];


    }
    public void setDb_userid(Integer db_userid) {
        this.db_userid = db_userid;
    }

    public String getDb_location() {
        return db_location;
    }

    public void setDb_location(String db_location) {
        this.db_location = db_location;
    }

    public Integer getDb_userid() {
        return db_userid;
    }

    @Override
    public String toString() {
        return '\n'+"User{" +
                "db_userid=" + db_userid +
                ", db_username='" + db_username + '\'' +
                ", db_password='" + db_password + '\'' +
                ", db_age=" + db_age +
                ", db_phone='" + db_phone + '\'' +
                ", db_level=" + db_level +
                ", db_location='" + db_location + '\'' +
                '}';
    }

    public void setDb_id(Integer db_id) {
        this.db_userid = db_id;
    }

    public String getDb_username() {
        return db_username;
    }

    public void setDb_username(String db_username) {
        this.db_username = db_username;
    }

    public String getDb_password() {
        return db_password;
    }

    public void setDb_password(String db_password) {
        this.db_password = db_password;
    }

    public Integer getDb_age() {
        return db_age;
    }

    public void setDb_age(Integer db_age) {
        this.db_age = db_age;
    }
    public void setDb_age(String db_age) {this.db_age = new Integer(db_age);}

    public String getDb_phone() {
        return db_phone;
    }

    public void setDb_phone(String db_number) {
        this.db_phone = db_number;
    }

    public Integer getDb_level() {
        return db_level;
    }

    public void setDb_level(Integer db_level) {
        this.db_level = db_level;
    }
}
