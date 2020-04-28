package com.example.model;

import java.util.List;

/**
 * For Parsing json as Member (Member as List)
 * "{'id' : 1, "
 *         + "'name': 'HR',"
 *         + "'users' : ["
 *             + "{'name': 'Alex','id': 1}, "
 *             + "{'name': 'Brian','id':2}, "
 *             + "{'name': 'Charles','id': 3}]}";
 */
public class OpcoList {
    int totalItems;
    List<OpcoDetail> items;

    @Override
    public String toString() {
        return "OpcoList{" +
                "totalItems=" + totalItems +
                ", opcoDetailList=" + items +
                '}'+"\n";
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<OpcoDetail> getItems() {
        return items;
    }

    public void setItems(List<OpcoDetail> items) {
        this.items = items;
    }
}

/**
 * Json to java
 * Member as Array
 *import java.util.Arrays;
public class OpcoList {
    int totalItems;
    private opcoDetail[] opcoDetailList;

    @Override
    public String toString() {
        return "OpcoList{" +
                "totalItems=" + totalItems +
                ", opcoDetailList=" + Arrays.toString(opcoDetailList) +
                '}';
    }

    public int getTotalItems() {
        return totalItems;
    }

    public opcoDetail[] getOpcoDetailList() {
        return opcoDetailList;
    }

    public void setOpcoDetailList(opcoDetail[] opcoDetailList) {
        this.opcoDetailList = opcoDetailList;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

 */