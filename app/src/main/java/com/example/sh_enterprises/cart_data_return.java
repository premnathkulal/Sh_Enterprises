package com.example.sh_enterprises;

public class cart_data_return {


    String id;
    String sup_id,ret_id,item_id, pro_img_url,Pro_name;
    int ammount,qnty;




    public cart_data_return(String id, String sup_id, String ret_id, String item_id, int ammount, int qnty, String pro_img_url, String Pro_name) {
        this.id = id;
        this.sup_id = sup_id;
        this.ret_id = ret_id;
        this.item_id = item_id;
        this.ammount = ammount;
        this.qnty = qnty;
        this.pro_img_url = pro_img_url;
        this.Pro_name = Pro_name;
    }

    public String getPro_name() {
        return Pro_name;
    }

    public String getId() {
        return id;
    }

    public String getSup_id() {
        return sup_id;
    }

    public String getRet_id() {
        return ret_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public int getAmmount() {
        return ammount;
    }

    public int getQnty() {
        return qnty;
    }

    public String getPro_img_url() {
        return pro_img_url;
    }
}
