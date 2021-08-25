package Offices;

public class Office {
    public int officeId;
    public String name;
    public String address;
    public String type;

    public Office(int officeId, String name, String address, String type) {
        this.officeId = officeId;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}