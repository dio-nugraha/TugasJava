import java.util.Scanner;
public class bambangv2 {
    //FUNGSI---------------(BAGIAN PALING PUSING)--------------------------------------------------
      //HITUNGAN---------------------
    static int hargabenda(float jumlahbarang , int harga){
        int hargabenda = (int) (jumlahbarang * harga);
        return hargabenda;
    }
    static int kembalian (int uang , int hargabarang){
        int kembalian = uang - hargabarang;
        return kembalian;
    }
    static int kurang (int uang , int hargabarang){
        int kurang = hargabarang - uang;
        return kurang;
    }
    //MENU------------------------------------------------------------------------
    static void menu (){
        System.out.println("       =============================================");
        System.out.println("       ||-- BARANG -- | --- HARGA --- | -- KODE --||");
        System.out.println("       ||-----------------------------------------||");
        System.out.println("       ||   BERAS     |     10.000    |    [1]    ||");
        System.out.println("       ||   JAGUNG    |     11.300    |    [2]    ||");
        System.out.println("       ||   TELUR     |     16.300    |    [3]    ||");
        System.out.println("       ||   MINYAK    |     12.300    |    [4]    ||");
        System.out.println("       =============================================");
        System.out.println("\n");
    }
    //KEGIATAN---------------------------------------------------------------------
    static void pembelian (String nama , String yangdibeli, int harga , int uang){
        float jumlahbarang ;
        System.out.println("  |~kakak beli "+yangdibeli+" dengan harga Rp"+harga+"/kg");
        System.out.print("  |~mau beli berapa kg kak "+nama+"            : ") ;
        Scanner inputan= new Scanner(System.in);
        jumlahbarang = inputan.nextFloat() ;
        System.out.println("  |~Kakak beli "+yangdibeli+" seberat Kg "+jumlahbarang+" dengan harga Rp."+ hargabenda(jumlahbarang, harga));
        System.out.println("  |---------------------------------------------------");
        //NAMBAHAWALAN-----------------------------------------------------------
        System.out.println("  |~pengen nambah belanjaan kak "+nama ) ;
        System.out.println("  |~Kalo tidak abaikan seperti biasa :'( " ) ;
        boolean perulangan2 = true ; 
        while (perulangan2) {
        System.out.print("  |~Masukkaan kode barang : " ) ;
        Scanner inputan3= new Scanner(System.in);
        String tambahan = inputan3.nextLine();
        //PEMILIHAN BARANG
                    switch (tambahan) {
                        case "1":
                             perulangan2 = false ; 
                             nambahbarangnya(nama,"Beras",10000, kembalian(uang, hargabenda(jumlahbarang, harga)));                                                     
                            break;
                        case "2":
                             perulangan2 = false ;
                             nambahbarangnya(nama,"Jagung",11300, kembalian(uang, hargabenda(jumlahbarang, harga)));
                            break;
                        case "3":
                             perulangan2 = false ;
                             nambahbarangnya(nama,"Telur",16300, kembalian(uang, hargabenda(jumlahbarang, harga)));
                            break;
                        case "4":
                             perulangan2 = false ;
                             nambahbarangnya(nama,"Minyak",12300, kembalian(uang, hargabenda(jumlahbarang, harga)));
                            break;
                        //GAK BELI------------
                        case "":
                             perulangan2 = false ;
                             System.out.println("  |---------------------------------------------------");
                             System.out.println("  |~Jadi cuma beli "+yangdibeli+" aja ya kak "+nama);
                             if (kembalian(uang, hargabenda(jumlahbarang, harga)) >=0){
                                System.out.println("  |~Sisa uang nya tolong di ambil :Rp."+kembalian(uang, hargabenda(jumlahbarang, harga)));
                            }
                            else {
                                System.out.println("  |~Transaksi gagal karena ");
                                System.out.println("  |~uang nya kurang :Rp."+kurang(uang, hargabenda(jumlahbarang, harga))) ;
                            }
                            break;
                            //SALAH INPUT
                        default:
                            System.out.println("  |---------------------------------------------------");    
                            System.out.println("  |~Coba Masukkan kode yang benar kak "+nama);
                            System.out.println("  ========================================================");
                            menu();
                            System.out.println("  |---------------------------------------------------");
                            break;
                        }
        }
    }
        //NAMBAH--------------------------
    static void nambahbarangnya (String nama , String yangdibeli , int harga , int sisauangkembalian){
        System.out.println("  |---------------------------------------------------"); 
        System.out.println("  |~kakak beli "+yangdibeli+" dengan harga Rp"+harga+"/kg");
        System.out.print("  |~mau beli berapa kg kak "+nama+"            : ") ;
        Scanner inputan= new Scanner(System.in);
        float jumlahbarang = inputan.nextFloat() ;
        int hargabarang= hargabenda(jumlahbarang, harga) ;
        System.out.println("  |~Kakak beli "+yangdibeli+" seberat "+ jumlahbarang+" dengan harga "+ hargabarang );
        if (kembalian(sisauangkembalian, hargabenda(jumlahbarang, harga))>=0){
            System.out.println("  |~Sisa uang nya tolong di ambil :Rp."+(kembalian(sisauangkembalian, hargabenda(jumlahbarang, harga))));
        }
        else {
            System.out.println("  |~Transaksi gagal karena ");
            System.out.println("  |~uang nya kurang :Rp."+(kurang(sisauangkembalian, hargabenda(jumlahbarang, harga)))) ;
        }
    }
    //INTI NYA INTI---------------------------------
    public static void main(String[] args) {
        Scanner inputan= new Scanner(System.in);
        Scanner inputan1= new Scanner(System.in);
        Scanner inputan2= new Scanner(System.in);
        boolean perulangan3 = true;    
        while (perulangan3) {
             //KERANGKA-------------------------------------------------------------------
            System.out.println("======================================================");
            System.out.println("|~ Sebelum menjalanlan program di mohon untuk mengisi ");
            System.out.println("|~      Data yang kami minta dengan benar OK !!       ");
            System.out.println("------------------------------------------------------");
            System.out.print("|~Masukkan nama anda :"); 
            String nama =inputan2.nextLine();
            System.out.print("|~Masukkan Jumlah uang anda (Min 10000)? :");
            int uang = inputan.nextInt();
            System.out.print("|~Anda datang ketoko jam berapa (buka jam 7-22) ? ;");
            float jam =inputan.nextFloat();
            System.out.println("------------------------------------------------------");
            System.out.println("|~ Program DiningraTzy V.2 Akan berjalan lebih baik"   );
            System.out.println("|~juga memiliki fitur yang lebih banyak daripada dulu " );
            System.out.println("|~       Tekan enter untuk menjalankan program        ");
            System.out.println("======================================================");
            String enter = inputan1.nextLine();
            System.out.println("");
                    //TOKO TUTUP---------------------------------------------------------------------
                    if (jam > 22.00) {
                        System.out.println("|~Tokonya tutup kak "+nama+" mohon kembali lagi jam  pada 7-22|");}
                    else if (jam < 7.00 ) {
                        System.out.println("|~Tokonya tutup kak "+nama+" mohon kembali lagi jam  pada 7-22|");}
                    else {
                    //TOKO BUKAK----------------------------------------------------------------------                   
                        //Sambutan-------------------
                        System.out.println("       ~Selamat datang di toko diningratzy kak "+nama );
                        System.out.println("             ~Ini menunya silahkan dipilih          ");
                        System.out.println("          ~Untuk membeli tolong ingat kodenya \n       ");
                        Boolean perulangan1 = true ;
                        while( perulangan1 ) {
                        menu();
                        System.out.println("           ~Tekan enter jika tidak ingin beli     ");
                        System.out.println("\n");
                        //BELI -----------------------------------------------------------------
                        System.out.println("  ========================================================");
                        System.out.print  ("  |~Beli yang mana kak "+nama+" jangan lupa kodenya ya : ");
                        String barang = inputan1.nextLine();
                        switch (barang) {
                            case "1":
                                perulangan1 = false ;
                                pembelian(nama,"beras",10000 , uang);
                            break; 
                            case "2":
                                perulangan1 = false ;
                                pembelian(nama,"jagung",11300 , uang);                       
                                break; 
                            case "3":
                                perulangan1 = false ;
                                pembelian(nama,"telur",16300 , uang);
                                break; 
                            case "4":
                                perulangan1 = false ;
                                pembelian(nama,"minyak",12300 , uang);                           
                                break; 
                                 //GAKBELI
                            case (""):
                                perulangan1 = false ;
                                System.out.println("  |---------------------------------------------------");
                                System.out.println("  |~Lain kali beli ya kak "+nama+" :)");                            
                                break;  
                                 //SALAH INPUT                  
                            default:
                                System.out.println("  |---------------------------------------------------");    
                                System.out.println("  |~Coba Masukkan kode yang benar kak "+nama);
                                System.out.println("  |---------------------------------------------------\n");
                                break;               
                            }
                        }
                        System.out.println("  |---------------------------------------------------");
                        System.out.println("  |~Trimakasih sudah datang di toko kami");
                        System.out.println("  ========================================================\n");
                    } 
                    System.out.print("|Tidak puas dengan hasil program kami ingin mengulangi y/n ? ");
                    String jawab = inputan1.nextLine();
                    if(jawab.equalsIgnoreCase("n") ){
                        System.out.println("\n");
                        perulangan3 = false;
                    }   
                  
                } 
    }
   
}