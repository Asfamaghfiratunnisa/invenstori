package Invenstory;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Barang {
    Scanner data = new Scanner(System.in);
    int all;
    
    int[] nomer = new int[50];
    String[] nama = new String[50];
    int[] harga = new int[50];
    int[] jumlah = new int[50];
    int[] nilai = new int[50];
    
    public Barang(){
        
    }
    
    private void inputKan(){
        try{
            for(int i = 0; i < all; i++){
                
                
                System.out.println("Kode barang -"+(i+1));
                System.out.print("Nama barang, tekan 0 untuk keluar : ");
                
                data.nextLine();
                nomer[i] = i + 1;
                nama[i] = data.nextLine();
                
                if(nama[i].equals("0")){
                    break;
                }
                
                System.out.print("Harga barang : ");
                harga[i] = data.nextInt();
                System.out.print("Jumlah barang : ");
                jumlah[i] = data.nextInt();
                nilai[i] = jumlah[i] * harga[i]; 
            }
        }catch(InputMismatchException a){
            System.out.println("Inputan anda harus berupa angka!");
            data.nextLine();
            menu();
        }
    }
    
    public void menu(){
        do{
            System.out.println("~~ Program Inputan Barang ~~\n");
            System.out.print("Masukkan nomer barang : ");
            all = data.nextInt();
            
            if(all <= 0){
                System.out.print("Inputan lebih dari 0");
            }else{
                inputKan();
            }
        }while (all <= 0);
    }
    
    public void getNilaiData(){
        for( int i = 0; i < all; i++){
            System.out.print("Nomer barang : "+nomer[i]);
            System.out.print("Nama barang : "+nama[i]);
            System.out.print("Harga barang : "+harga[i]);
            System.out.print("Jumlah barang : "+jumlah[i]);
            System.out.print("Nilai barang : "+nilai[i]);
        }
    }
}
