package OOP2Assignment;

import java.util.Scanner;

public class Person {

    private String name;
    private String nrcno;
    private String address;
    private String phone;

    String detailNrcDiv;
    String dteailNrcCity;
    String dteailNrcNum;

    Person(String n, String nn, String ad, String ph) {
        this.name = n;
        this.nrcno = nn;
        this.address = ad;
        this.phone = ph;
    }

    public String getName() {
        return this.name;
    }

    Scanner sc = new Scanner(System.in);

    public void setInfo() {
        System.out.println("Enter name : ");
        this.name = sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter NRCno : ");
        this.nrcno = sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter address : ");
        this.address = sc.nextLine();
        System.out.println("\n");
        System.out.println("Enter phone no : ");
        this.phone = sc.nextLine();
        System.out.println("\n");
    }

    public void showInfo() {
        System.out.println("Name is " + this.name);
        System.out.println("Nrcno is " + this.nrcno);
        System.out.println("Address is " + this.address);
        System.out.println("Phone no is " + this.phone);
    }

    // ID format - 05/YMP(N)146876
    public void showIdentificationInfo() {
        this.detailNrcDiv = this.nrcno.substring(0, 2);
        this.dteailNrcCity = this.nrcno.substring(3, 6);
        this.dteailNrcNum = this.nrcno.substring(9);

        switch (detailNrcDiv) {
            case "01":
                this.detailNrcDiv = "Kachin State";
                break;

            case "02":
                this.detailNrcDiv = "Kayah State";
                break;

            case "03":
                detailNrcDiv = "Kayin State";
                break;
            case "04":
                this.detailNrcDiv = "Chin State";
                break;
            case "05":
                this.detailNrcDiv = "Sagaing Region";
                break;
            case "06":
                this.detailNrcDiv = "Tanintharyi Region";
                break;
            case "07":
                this.detailNrcDiv = "Bago Region";
                break;
            case "08":
                this.detailNrcDiv = "Magway Region";
                break;
            case "09":
                this.detailNrcDiv = "Mandalay Region";
                break;
            case "10":
                this.detailNrcDiv = "Mon State";
                break;
            case "11":
                this.detailNrcDiv = "Rakhine State";
                break;
            case "12":
                this.detailNrcDiv = "Yangon Region";
                break;
            case "13":
                this.detailNrcDiv = "Shan State";
                break;
            case "14":
                this.detailNrcDiv = "Ayeyawady Region";
                break;
            case "15":
                this.detailNrcDiv = "Nay Pyi Taw";
                break;

            default:
                this.detailNrcDiv = "Invaled Division or state";
        }

        switch (dteailNrcCity) {

            case "AGY":
                this.dteailNrcCity = "Ingyi Yan City";
                break;

            case "BMN":
                this.dteailNrcCity = "Ban Maw City";
                break;

            case "KPN":
                this.dteailNrcCity = "Che Phway City";
                break;

            case "HPN":
                this.dteailNrcCity = "Ho Pin City";
            break;

            case "MSN":
                this.dteailNrcCity = "Man Si City";
            break;

            case "MNN":
                this.dteailNrcCity = "Moe Nyin City";
            break;

            case "MKB":
                this.dteailNrcCity = "Ma Chan Baw City";
            break;

            case "MKT":
                this.dteailNrcCity = "Moe Kaung City";
            break;

            case "MKN":
                this.dteailNrcCity = "Myit Kyi Nar City";
            break;

            case "PKN":
                this.dteailNrcCity = "Phar Kant City";
            break;

            case "PTA":
                this.dteailNrcCity = "Pu Ta Ao City";
            break;

            case "SPB":
                this.dteailNrcCity = "Swm Pra Bom City";
            break;

            case "DMS":
                this.dteailNrcCity = "De Mos So City";
            break;

            case "LKN":
                this.dteailNrcCity = "Lwai Kay City";
            break;

            case "MWR":
                this.dteailNrcCity = "Mya Wa Ti City";
            break;

            case "PAN":
                this.dteailNrcCity = "Pha An City";
            break;

            case "HKN":
                this.dteailNrcCity = "Ha Kha City";
            break;

            case "BAN":
                this.dteailNrcCity = "Bar An City";
            break;

            case "TTN":
                this.dteailNrcCity = "Tee Tain City";
            break;

            case "AYT":
                this.dteailNrcCity = "Ayar Taw City";
            break;

            case "BTL":
                this.dteailNrcCity = "Bu Ta Lin City";
            break;

            case "KON":
                this.dteailNrcCity = "Chaung Oo City";
            break;

            case "DPY":
                this.dteailNrcCity = "De Pl Yin City";
            break;

            case "HML":
                this.dteailNrcCity = "Holm Ma Lin City";
            break;

            case "KNN":
                this.dteailNrcCity = "Ka Ni City";
            break;

            case "KTN":
                this.dteailNrcCity = "Ka Thar City";
            break;

            case "KLH":
                this.dteailNrcCity = "Kalay City";
            break;

            case "KLW":
                this.dteailNrcCity = "Kalay Wa City";
            break;

            case "MYN":
                this.dteailNrcCity = "Monywa City";
            break;

            case "PLN":
                this.dteailNrcCity = "Pa Lal City";
            break;

            case "SKN":
                this.dteailNrcCity = "Sagaing City";
            break;

            case "SLK":
                this.dteailNrcCity = "Sar Lin Kyi City";
            break;

            case "YON":
                this.dteailNrcCity = "Ye Oo City";
            break;

            case "YMP":
                this.dteailNrcCity = "Yin Mar Pin City";
            break;

            case "MMN":
                this.dteailNrcCity = "Myeik City";
            break; 

            case "TNT":
                this.dteailNrcCity = "Ta Nin Theryi City";
            break;

            case "KTK":
                this.dteailNrcCity = "Kyauk Tan Khar City";
            break;

            case "TNN":
                this.dteailNrcCity = "Taunggu City";
            break;

            case "ALN":
                this.dteailNrcCity = "Aung Lan City";
            break;

            case "HLN":
                this.dteailNrcCity = "Htee Lin City";
            break;

            case "NMN":
                this.dteailNrcCity = "Nat Mout City";
            break;

            case "PKK":
                this.dteailNrcCity = "Pa Khout Ku City";
            break;

            case "TYN":
                this.dteailNrcCity = "Tha Yat City";
            break;

            case "YNK":
                this.dteailNrcCity = "Yan Nan Chaung City";
            break;

            case "PMN":
                this.dteailNrcCity = "Pyin Ma Nar City";
            break;

            case "AMY":
                this.dteailNrcCity = "Amaya Pura City";
            break;

            case "AMZ":
                this.dteailNrcCity = "Aung Myay Thar Zan City";
            break;

            case "MHL":
                this.dteailNrcCity = "Mate Htee Lar City";
            break;

            case "POL":
                this.dteailNrcCity = "Pyin Oo Lwin City";
            break;

            case "MLM":
                this.dteailNrcCity = "Maw La Myaing City";
            break;

            case "STN":
                this.dteailNrcCity = "Sis Tawy City";
            break;

            case "DGY":
                this.dteailNrcCity = "Dagon Myo Thit City";
            break;

            case "DLN":
                this.dteailNrcCity = "Da La City";
            break;

            case "LTY":
                this.dteailNrcCity = "Hling Thar Yar City";
            break;

            case "KMT":
                this.dteailNrcCity = "Kyi Mying Tai City";
            break;

            case "MYK":
                this.dteailNrcCity = "Ma Yan Kone City";
            break;

            case "OKL":
                this.dteailNrcCity = "Oak Kalar City";
            break;

            case "BZD":
                this.dteailNrcCity = "Ba Zon Taung City";
            break;

            case "TMN":
                this.dteailNrcCity = "Tar Mway  City";
            break;

            case "TKT":
                this.dteailNrcCity = "Thar Kay Ta City";
            break;

            default:
                this.dteailNrcCity = "Invailed City";

        }
        
        System.out.println("This person's native is " + detailNrcDiv + ", " + dteailNrcCity);
        System.out.println("This person  in currently live in " + this.address);
        System.out.println("Nrc Number is " + this.dteailNrcNum  + "\n");

    }

}
