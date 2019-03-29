package com.example.sh_enterprises;

public class cart_data {

    String item_id;
    String sup_id;
    String ret_id;
    String ite_url;
    int i;
    String sum_amt;


    public cart_data(String item_id,String sup_id, String ret_id,  String sum_amt, String ite_url) {
        this.item_id = item_id;
        this.sup_id = sup_id;
        this.sum_amt = sum_amt;
        this.ret_id = ret_id;
        this.ite_url = ite_url;
    }


    public String getItem_id() {
        return item_id;
    }

    public String getSup_id() {
        return sup_id;
    }

    public String getRet_id() {
        return ret_id;
    }

    public String getIte_url() {
        return ite_url;
    }

    public String getSum_amt() {
        return sum_amt;
    }


}
