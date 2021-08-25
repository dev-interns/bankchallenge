import Offices.Office;
import Offices.OfficeFactory;

import java.util.List;

public class Bank {
    public int bankId;
    public String name;
    public List<Office> listOffices;

    public Bank(int bankId, String name){
        this.bankId = bankId;
        this.name = name;
    }
    //TODO metodos de oficina porque static?
}