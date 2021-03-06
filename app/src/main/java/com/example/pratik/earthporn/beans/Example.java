
package com.example.pratik.earthporn.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Example implements Serializable{

    @SerializedName("kind")
    private String kind;
    @SerializedName("data")
    private Data data;

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

}
