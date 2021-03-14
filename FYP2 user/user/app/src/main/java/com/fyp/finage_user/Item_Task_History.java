package com.fyp.finage_user;

public class Item_Task_History {

    String name = "babysitter";
    String pricetag = "1200";
    String namework = "Ahmad";
    String tduration = "2 hours";
    String datetime = "12Jan, 20:12";



    public Item_Task_History(String name, String price, String namework, String tduration, String datetime) {
        this.name = name ;
        this.pricetag = price;
        this.namework = namework;
        this.tduration = tduration;
        this.datetime = datetime;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return pricetag;
    }

    public void setPrice(String price) {
        this.pricetag = price;
    }

    public String getDescription() {
        return namework;
    }

    public void setDescription(String description) {
        this.namework = description;
    }

    public String gettduration() {
        return tduration;
    }

    public void setTduration(String tduration) {
        this.tduration = tduration;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setdatetime(String datetime) {
        this.datetime = datetime;
    }




}
