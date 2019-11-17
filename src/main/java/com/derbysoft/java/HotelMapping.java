package com.derbysoft.java;

public class HotelMapping {
    private String providerCode;
    private String hotelCode;

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelMapping that = (HotelMapping) o;

        if (providerCode != null ? !providerCode.equals(that.providerCode) : that.providerCode != null) return false;
        return hotelCode != null ? hotelCode.equals(that.hotelCode) : that.hotelCode == null;
    }

    @Override
    public int hashCode() {
        int result = providerCode != null ? providerCode.hashCode() : 0;
        result = 31 * result + (hotelCode != null ? hotelCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HotelMapping{" +
                "providerCode='" + providerCode + '\'' +
                ", hotelCode='" + hotelCode + '\'' +
                '}';
    }
}
