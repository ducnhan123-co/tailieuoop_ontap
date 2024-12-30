import java.util.Arrays;
import java.util.Scanner;

public class ShopList {
    public Shop [] dsgh = new Shop[1];
    public int n;

    public ShopList() {
    }

    public ShopList(int n)
    {
        this.n=0;
        this.dsgh=new Shop[n];
    }

    public void themGianHang()
    {
        Scanner sc = new Scanner(System.in);
        int luachon=0;
        while (true)
        {
            System.out.println("Nhap lua chon cua ban 1. Them regularshop 2. them food shop .Nhan bat ky de thoat" );
            luachon=sc.nextInt();
            if(luachon==1)
            {
                RegularShop regularShop=new RegularShop("",0.0,0.0);
                regularShop.nhapThongTin();
                dsgh= Arrays.copyOf(dsgh,dsgh.length+1);
                dsgh[n]=regularShop;
                n++;
                System.out.println("Da them 1 regular shop thanh cong");
            } else if(luachon==2)
            {
                FoodShop foodShop=new FoodShop("",0.0,0.0);
                foodShop.nhapThongTin();
                dsgh= Arrays.copyOf(dsgh,dsgh.length+1);
                dsgh[n]=foodShop;
                n++;
            } else {
                break;
            }
        }
    }


    public void tinhTongTienThueTungLoai()
    {
        double tongRegular=0;
        double tongFood=0;
        for(Shop shop: dsgh)
        {
            if(shop instanceof RegularShop)
            {
                tongRegular+=shop.tinhTienThue();
            } else if(shop instanceof FoodShop)
            {
                tongFood+=shop.tinhTienThue();
            }
        }
        System.out.println("Tong tien thue regular shop la: "+ tongRegular);
        System.out.println("Tong tien thue food shop la: "+ tongFood);
    }
}
