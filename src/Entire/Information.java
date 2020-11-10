package Entire;

public class Information {
    public String id;
    public String name;
    public String phone_number;
    public String address;
    public String facebook_account;

    public Information() {
    }

    public Information(String id, String name, String phone_number, String address, String facebook_account) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.facebook_account = facebook_account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacebook_account() {
        return facebook_account;
    }

    public void setFacebook_account(String facebook_account) {
        this.facebook_account = facebook_account;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                ", facebook_account='" + facebook_account + '\'' +
                '}';
    }
}
