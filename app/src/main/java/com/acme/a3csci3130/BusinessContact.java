package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class BusinessContact implements Serializable {

    public  String busid;
    public  String busnumber;
    public  String busname;
    public  String primarybusiness;
    public  String busaddress;
    public  String busprovince;
    public  String busemail;

    public BusinessContact() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public BusinessContact(String  busid, String busnumber, String busname, String primarybusiness, String busaddress, String busprovince,  String busemail){
        this.busid =busid;
        this.busnumber=busnumber;
        this.busname=busname;
        this.primarybusiness=primarybusiness;
        this.busaddress=busaddress;
        this.busprovince=busprovince;
        this.busemail=busemail;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("busid",            busid);
        result.put("busnumber",        busnumber);
        result.put("busname",          busname);
        result.put("primarybusiness",  primarybusiness);
        result.put("busaddress",       busaddress);
        result.put("busprovince",      busprovince);
        result.put("email",            busemail);

        return result;
    }
}
