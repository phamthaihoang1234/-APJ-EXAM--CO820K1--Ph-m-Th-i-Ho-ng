package Action;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        DBContext db = new DBContext();
        Methods m = new Methods(db);
        String fname2 = "danhsachdanhba1.csv";
        while(true){
            System.out.println();
            System.out.println();
            System.out.println(" 1. Thêm mới.");
            System.out.println(" 2. Xem danh sách");
            System.out.println(" 3. Cập nhật");
            System.out.println(" 4. Xóa");
            System.out.println(" 5. Tìm kiếm.");
            System.out.println(" 6. Load file ");
            System.out.println(" 7. Save file.");
            System.out.println(" 0. Thoát.");
            System.out.print("  Your selection (0 -> 8): ");

            System.out.println();
            System.out.println();
            String choice = sc.nextLine();

            if(choice.equals("0")){
                break;
            }

            switch (choice) {
                case "1":
                    m.themmoi();
                    break;
                case "2":
                    m.xemdanhsach();
                    break;

                case "3":
                    m.capnhat();
                    break;

                case "4":
                    m.xoa();
                    break;

                case "5":
                    m.timkiem();
                    break;

                case "6":
                    m.loadFile(fname2);
                    break;

                case "7":
                    m.saveFile(fname2);
                    break;

                default:
                    System.out.print("Wrong selection!");


            }











        }

    }




}
