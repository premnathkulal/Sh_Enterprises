package com.example.sh_enterprises;

public class pro_data {


    String pro_name;
    String weight;
    String total_amount;
    String pro_url,pro_id;

    public pro_data(String pro_id,String pro_name, String weight, String total_amount, String pro_url) {
        this.pro_name = pro_name;
        this.pro_id = pro_id;
        this.weight = weight;
        this.total_amount = total_amount;
        this.pro_url = pro_url;
    }

    public String getPro_name() {
        return pro_name;
    }

    public String getWeight() {
        return weight;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public String getPro_url() {
        return pro_url;
    }

    public String getPro_id() {
        return pro_id;
    }
}
