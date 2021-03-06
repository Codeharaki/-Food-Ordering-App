package com.younessharaki.apricot.Model;

import java.util.List;

/**
 * Created by Youness Haraki on 07.05.2018.
 */

public class Request
{
    private String phone;
    private String name;
    private String adress;
    private String total;
    private String status;
    private List<Order> foods;//list of food order

    public Request() {

    }

    public Request(String phone, String name, String adress, String total, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.adress = adress;
        this.total = total;
        this.foods = foods;
        this.status="0";//default value , 1 shipped , 2 shipped
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
