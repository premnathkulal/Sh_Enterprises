package com.example.sh_enterprises;

public class pro_data {


    String pro_name;
    String weight;
    String total_amount;
    String disc;
    String deliveryto;
    String sold_by;

    public pro_data(String pro_name, String weight, String total_amount,String disc,String deliveryto,String sold_by) {
        this.pro_name = pro_name;
        this.weight = weight;
        this.total_amount = total_amount;
        this.disc = disc;
        this.deliveryto = deliveryto;
        this.sold_by = sold_by;
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

    public String getDisc() {
        return disc;
    }

    public String getDeliveryto() {
        return deliveryto;
    }

    public String getSold_by() {
        return sold_by;
    }
}
