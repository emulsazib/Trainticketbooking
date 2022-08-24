package com.example.trainticketbooking;

public class EconomicClass {
    private String addrss;
    private String time;
    private String date;

    public EconomicClass(String addrss, String time, String date) {
        this.addrss = addrss;
        this.time = time;
        this.date = date;
    }

    public String getAddrss() {
        return addrss;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "EconomicClass{" +
                "addrss='" + addrss + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
