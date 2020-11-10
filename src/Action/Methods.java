package Action;

import Entire.Information;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    DBContext db;
    Scanner sc = new Scanner(System.in);

    public Methods(DBContext db){
        this.db = db;
    }

    public void themmoi(){
         String id;
         String name;
         String phone_number;
         String address;
         String facebook_account;
        while(true){
            System.out.println("Id is (=0 exit) : ");
            id = sc.nextLine();
            if(id.equals("0")){break;}
            System.out.println("Name is : " );
            name = sc.nextLine();
            System.out.println("Phone number is : ");
            phone_number = sc.nextLine();
            System.out.println("Address is : ");
            address = sc.nextLine();
            System.out.println("Facebook accunt is : ");
            facebook_account = sc.nextLine();
            db.addInformation(new Information(id,name,phone_number,address,facebook_account));


        }



    }

    public void xemdanhsach (){
        ArrayList<Information> list = db.getInformation();

        if(list.isEmpty()){
            System.out.println("There are no books in list ");
        }else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("{" + list.get(i).id + " : "+ list.get(i).name+"," + list.get(i).phone_number + " "+ list.get(i).address+ " "+ list.get(i).facebook_account+ "}" );
            }
        }

    }

    public void xoa (){

        ArrayList<Information> list = db.getInformation();
        System.out.println("Please input id you want to delete :");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).id)){
                list.remove(i);
            }else{
                System.out.println("Not found id in list :");
            }


        }


    }

    public void timkiem(){
        ArrayList<Information> list = db.getInformation();
        System.out.println("Please input id you want to search :");
        String id = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).id)){
                System.out.println("the id you want to serch in : "+ (i+1));
            }else{
                System.out.println("Not found id in list :");
            }


        }
    }

    public void capnhat(){
        ArrayList<Information> list = db.getInformation();
        System.out.println("Please input id you want to update :");
        String id = sc.nextLine();


        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).id)){
                System.out.println("Please input name you want to updete ");
                list.get(i).name = sc.nextLine();
                System.out.println("Please input address you want to updete ");
                list.get(i).address = sc.nextLine();
                System.out.println("Please input phone number you want to updete ");
                list.get(i).phone_number = sc.nextLine();
                System.out.println("Please input facebook account you want to updete ");
                list.get(i).facebook_account = sc.nextLine();

            }else{
                System.out.println("Not found id in list :");
            }


        }
    }

    void saveFile(String name) throws IOException {
        ArrayList<Information> information = db.getInformation();
        FileWriter fw= new FileWriter(name);
        PrintWriter pw = new PrintWriter(fw);
        Information x;
        for(int i = 0; i< information.size(); i++){
            x= information.get(i);
            pw.printf("%10s||%30s||%30s||%30s||%30s\n",information.get(i).id , information.get(i).name,information.get(i).phone_number ,information.get(i).address, information.get(i).facebook_account );
        }

        fw.close();
        pw.close();
        System.out.println("You had save file successfull");
    }

    void loadFile(String name) throws IOException {
        ArrayList<Information> information = db.getInformation();
        RandomAccessFile f = new RandomAccessFile(name,"rw");
        String s;
        String id;
        String[]a;
        String Name;
        String phone_number;
        String address;
        String facebook_account;
        while(true){
            s = f.readLine();
            if(s==null)break;
            a = s.split("[||]");
            id = a[0].trim();
            Name = a[2].trim();
            phone_number = a[4].trim();
            address= a[6].trim();
            facebook_account = a[8].trim();
            information.add(new Information(id,Name,phone_number,address,facebook_account));
        }
        System.out.println("You had loadfile successfull , please choose 2 to view >>>");
    }


}
