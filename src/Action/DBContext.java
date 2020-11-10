package Action;

import Entire.Information;

import java.util.ArrayList;

public class DBContext {
    ArrayList<Information> list = new ArrayList<>();


    public void addInformation (Information infor){
        list.add(infor);
    }
    public ArrayList<Information> getInformation() {
        return list;
    }

    public void setInformation(ArrayList<Information> list) {
        this.list = list;
    }
}
