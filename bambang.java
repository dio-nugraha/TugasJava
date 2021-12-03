import java.util.Scanner;
public class bambang {
    
    public static void main(String[] args) {
        
     //variable---------------------------------------------------------------

    int uang ;
    String nama ;
    float jam ;
    String enter ;
    Scanner inputan= new Scanner(System.in);
    Scanner inputan1= new Scanner(System.in);
    Scanner inputan2= new Scanner(System.in);
    String spasi = "       " ;


    //Awalan------------------------------------------------------------------
   
    System.out.println("======================================================");
    System.out.println("|~ Sebelum menjalanlan program di mohon untuk mengisi ");
    System.out.println("|~      Data yang kami minta dengan benar OK !!       ");
    System.out.println("------------------------------------------------------");
    System.out.print("|~Masukkan nama anda :"); 
    nama =inputan.nextLine();
    System.out.print("|~Masukkan Jumlah uang anda ? :");
    uang = inputan.nextInt();
    System.out.print("|~Anda datang ketoko jam berapa (buka jam 7-22) ? ;");
    jam =inputan.nextFloat();
    System.out.println("------------------------------------------------------");
    System.out.println("|~ Program DiningraTzy V.2 Akan berjalan lebih baik"   );
    System.out.println("|~       Tekan enter untuk menjalankan program        ");
    System.out.println("======================================================");
    enter = inputan2.nextLine();
    System.out.println("");
               //TOKO TUTUP---------------------------------------------------------------------

            if (jam > 22.00) {
                System.out.println("        Tokonya tutup kak "+nama+" mohon kembali lagi jam  pada 7-22");
            }

            else if (jam < 7.00 ) {
                System.out.println("        Tokonya tutup kak "+nama+" mohon kembali lagi jam  pada 7-22");
            } 
            else {

            //TOKO BUKAK----------------------------------------------------------------------

                //Variable-----------------------------------------------------------------------
                    String barang ;
                    String tambahan ;
                    int uangsisa ; 
                    int uangsisa1 ; 
                    int sisauanggkbeli = (uang-5000) ;  
                    float berasberatambahan ;
                    float telurberatambahan ;
                    float jagungberatambahan ; 
                    float minyakberatambahan ; 
                    //Var Buat berasssss             //Var Buat jagungssss
                    float berasberat ;                float jagungberat ;
                    int hargaberas1;                  int hargajagung1;
                    int hargaberastelur ;             int hargajagungtelur ;                   
                    int hargaberasjagung ;            int hargajagungberas ;
                    int hargaberasminyak ;            int hargajagungminyak ;                                                          
                                                                                                                                
                    //Var Buat telur                 //Var buat minyak
                    float telurberat ;                float minyakberat ;
                    int hargatelur1;                  int hargaminyak1;   
                    int hargatelurjagung ;            int hargaminyakjagung ;                    
                    int hargatelurberas ;             int hargaminyakberas ;
                    int hargatelurminyak ;            int hargaminyaktelur ;  
                                        
                    //Sambutan-------------------------------------------------------------------------

                System.out.println("       ~ Sugeng rawuh ing toko diningratzy kak "+nama );
                System.out.println("               ~niki menunya monggo dipilih           ");
                System.out.println("           ~Untuk membeli tolong ingat kodenya          ");
                System.out.println("");
                System.out.println(spasi+"=============================================");
                System.out.println(spasi+"||-- BARANG -- | --- HARGA --- | -- KODE --||");
                System.out.println(spasi+"||-----------------------------------------||");
                System.out.println(spasi+"||   BERAS     |     10.000    |    [1]    ||");
                System.out.println(spasi+"||   JAGUNG    |     11.300    |    [2]    ||");
                System.out.println(spasi+"||   TELUR     |     16.300    |    [3]    ||");
                System.out.println(spasi+"||   MINYAK    |     12.300    |    [4]    ||");
                System.out.println(spasi+"=============================================");
                System.out.println("");
                System.out.println("           ~Pitet enter lek ndak tumbas Tapi     ");
                System.out.println("            ~Temenan tah kak ndak tumbas :(       ");
                System.out.println("   ~ndak tuku mbayar AC 5k , ndak intok duit ndak mangan ");
                System.out.println("");
                
                //BELI MEMBELI-----------------------------------------------------------------

                System.out.println("  ========================================================");
                System.out.print  ("  |~Tumbas barang seng pundi kak "+nama+"        : ");
                barang = inputan1.nextLine();

                switch (barang) {

                    //BERAS--------------------------------------------------------------------------

                    case "1":
                    System.out.println("  |~kakak tumbas Beras kaleh regane 10k/kg  ");
                    System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                    berasberat = inputan.nextFloat();
                    hargaberas1 = (int) (berasberat*10000);
                    uangsisa = (uang-hargaberas1);
                    System.out.println("  |~Berarti kaknya beli beras Seberat "+berasberat+" Kg") ;
                    System.out.println("  |~kaleh regane Rp."+hargaberas1) ;
                    System.out.println("  |---------------------------------------------------");
                    System.out.println("  |~pengen nambah belanjaan kak"+nama ) ;
                    System.out.println("  |~Kalo ndak mau abaikan seperti biasa :'( " ) ;
                    System.out.print("  |~Masukkaan kode barange : " ) ;
                    tambahan = inputan2.nextLine();
                    System.out.println("  |---------------------------------------------------");

                    //namabah belanjaan--------------------------------------------------------------------------------------

                        switch (tambahan) {
                            case "2":
                                System.out.println("  |~Nambah jagung kaleh regane 11,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                jagungberatambahan = inputan.nextFloat();
                                hargaberasjagung = (int)(jagungberatambahan*11300+hargaberas1) ;
                                uangsisa1 = (uang-hargaberasjagung);
                                System.out.println("  |~Jadi tumbas beras seberat "+berasberat+" kg ditambah " );
                                System.out.println("  |~Jagung seberat "+jagungberatambahan+" kg dengan total harga Rp."+hargaberasjagung );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                 else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }

                                break;

                            case "3":
                                System.out.println("  |~Nambah telur kaleh regane 16,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                telurberatambahan = inputan.nextInt();
                                hargaberastelur = (int)(telurberatambahan*16300+hargaberas1) ;
                                uangsisa1 = (uang-hargaberastelur);
                                System.out.println("  |~Jadi tumbas beras seberat "+berasberat+" kg ditambah " );
                                System.out.println("  |~telur seberat "+telurberatambahan+" kg dengan total harga Rp."+hargaberastelur );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                                break;
                            
                            case "4":
                                
                                System.out.println("  |~Nambah minyak kaleh regane 12,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                minyakberatambahan = inputan.nextInt();
                                hargaberasminyak = (int)(minyakberatambahan*12300+hargaberas1) ;
                                uangsisa1 = (uang-hargaberasminyak);
                                System.out.println("  |~Jadi tumbas beras seberat "+berasberat+" kg ditambah " );
                                System.out.println("  |~minyak seberat "+minyakberatambahan+" kg dengan total harga Rp."+hargaberasminyak );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                            break;
                        
                            default:

                                 //SELESAII----------------------------------------------------
                                 if (uangsisa > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Sisa uang kak : Rp."+uangsisa);
                                 }

                                 else if (uangsisa < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                 }
                                break;
                        }


                        break;
                


                    //JAGUNG---------------------------------------------------------------------------

                    case "2":
                    System.out.println("  |~kakak tumbas Jagung kaleh regane 11,3k/kg  ");
                    System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                    jagungberat = inputan.nextFloat();
                    hargajagung1 = (int) (jagungberat*11300);
                    uangsisa = (uang-hargajagung1);
                    System.out.println("  |~Berarti kaknya beli beras Seberat "+jagungberat+" Kg") ;
                    System.out.println("  |~kaleh regane Rp."+hargajagung1) ;
                    System.out.println("  |---------------------------------------------------");
                    System.out.println("  |~pengen nambah belanjaan kak"+nama ) ;
                    System.out.println("  |~Kalo ndak mau abaikan seperti biasa :'( " ) ;
                    System.out.print("  |~Masukkaan kode barange : " ) ;
                    tambahan = inputan2.nextLine();
                    System.out.println("  |---------------------------------------------------");

                    //namabah belanjaan--------------------------------------------------------------------------------------

                        switch (tambahan) {
                            case "1":
                            System.out.println("  |~Nambah beras kaleh regane 10/kg ");
                            System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                            berasberatambahan = inputan.nextFloat();
                            hargajagungberas = (int)(berasberatambahan*10000+hargajagung1) ;
                            uangsisa1 = (uang-hargajagungberas);
                            System.out.println("  |~Jadi tumbas beras seberat "+jagungberat+" kg ditambah " );
                            System.out.println("  |~beras seberat "+berasberatambahan+" kg dengan total harga Rp."+hargajagungberas );
                            System.out.println("  |---------------------------------------------------");
                            
                            
                            //SELESAII----------------------------------------------------
                            
                            if (uangsisa1 > 0) {
                                System.out.println("  |~Ya sudah suwun wes tumbas");
                                System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                System.out.println("  |---------------------------------------------------");

                            
                            }
                            
                             else if (uangsisa1 < 0 ){
                                System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                System.out.println("  |~Mbayar ac 5k terus moleh o");
                                System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                System.out.println("  |---------------------------------------------------");
                            }
                            
                            break;

                            case "3":
                                System.out.println("  |~Nambah telur kaleh regane 16,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                telurberatambahan = inputan.nextInt();
                                hargajagungtelur = (int)(telurberatambahan*16300+hargajagung1) ;
                                uangsisa1 = (uang-hargajagungtelur);
                                System.out.println("  |~Jadi tumbas beras seberat "+jagungberat+" kg ditambah " );
                                System.out.println("  |~telur seberat "+telurberatambahan+" kg dengan total harga Rp."+hargajagungtelur );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                                break;
                            
                            case "4":
                                
                                System.out.println("  |~Nambah minyak kaleh regane 12,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                minyakberatambahan = inputan.nextInt();
                                hargajagungminyak = (int)(minyakberatambahan*12300+hargajagung1) ;
                                uangsisa1 = (uang-hargajagungminyak);
                                System.out.println("  |~Jadi tumbas beras seberat "+jagungberat+" kg ditambah " );
                                System.out.println("  |~minyak seberat "+minyakberatambahan+" kg dengan total harga Rp."+hargajagungminyak );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                            break;
                        
                            default:

                                 //SELESAII----------------------------------------------------
                                 if (uangsisa > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Sisa uang kak : Rp."+uangsisa);
                                 }

                                 else if (uangsisa < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                 }
                                break;
                        }


                        break;

                    //Telurr---------------------------------------------------------------------------

                    case "3":
                    System.out.println("  |~kakak tumbas telur kaleh regane 11,3k/kg  ");
                    System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                    telurberat = inputan.nextFloat();
                    hargatelur1 = (int) (telurberat*16300);
                    uangsisa = (uang-hargatelur1);
                    System.out.println("  |~Berarti kaknya beli Telur Seberat "+telurberat+" Kg") ;
                    System.out.println("  |~kaleh regane Rp."+hargatelur1) ;
                    System.out.println("  |---------------------------------------------------");
                    System.out.println("  |~pengen nambah belanjaan kak"+nama ) ;
                    System.out.println("  |~Kalo ndak mau abaikan seperti biasa :'( " ) ;
                    System.out.print("  |~Masukkaan kode barange : " ) ;
                    tambahan = inputan2.nextLine();
                    System.out.println("  |---------------------------------------------------");

                    //namabah belanjaan--------------------------------------------------------------------------------------

                        switch (tambahan) {
                            case "1":
                            System.out.println("  |~Nambah beras kaleh regane 10k/kg ");
                            System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                            berasberatambahan = inputan.nextFloat();
                            hargatelurberas = (int)(berasberatambahan*10000+hargatelur1) ;
                            uangsisa1 = (uang-hargatelurberas);
                            System.out.println("  |~Jadi tumbas telur seberat "+telurberat+" kg ditambah " );
                            System.out.println("  |~beras seberat "+berasberatambahan+" kg dengan total harga Rp."+hargatelurberas );
                            System.out.println("  |---------------------------------------------------");
                            
                            
                            //SELESAII----------------------------------------------------
                            
                            if (uangsisa1 > 0) {
                                System.out.println("  |~Ya sudah suwun wes tumbas");
                                System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                System.out.println("  |---------------------------------------------------");

                            
                            }
                            
                            else if (uangsisa1 < 0 ){
                                System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                System.out.println("  |~Mbayar ac 5k terus moleh o");
                                System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                System.out.println("  |---------------------------------------------------");
                            }
                            
                            break;

                            case "2":
                                System.out.println("  |~Nambah jagung kaleh regane 11,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                telurberatambahan = inputan.nextInt();
                                hargatelurjagung = (int)(telurberatambahan*11300+hargatelur1) ;
                                uangsisa1 = (uang-hargatelurjagung);
                                System.out.println("  |~Jadi tumbas telur seberat "+telurberat+" kg ditambah " );
                                System.out.println("  |~jagung seberat "+telurberatambahan+" kg dengan total harga Rp."+hargatelurjagung );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                                break;
                            
                            case "4":
                                
                                System.out.println("  |~Nambah minyak kaleh regane 12,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                minyakberatambahan = inputan.nextInt();
                                hargatelurminyak = (int)(minyakberatambahan*12300+hargatelur1) ;
                                uangsisa1 = (uang-hargatelurminyak);
                                System.out.println("  |~Jadi tumbas telur seberat "+telurberat+" kg ditambah " );
                                System.out.println("  |~minyak seberat "+minyakberatambahan+" kg dengan total harga Rp."+hargatelurminyak );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                            break;
                        
                            default:

                                //SELESAII----------------------------------------------------
                                if (uangsisa > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Sisa uang kak : Rp."+uangsisa);
                                }

                                else if (uangsisa < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                                break;
                        }


                        break;

                                        
                  
                    //minyak---------------------------------------------------------------------------

                    case "4":
                    System.out.println("  |~kakak tumbas minyak kaleh regane 11,3k/l  ");
                    System.out.print("  |~mau beli berapa liter kak ?                 : ") ;
                    minyakberat = inputan.nextFloat();
                    hargaminyak1 = (int) (minyakberat*12300);
                    uangsisa = (uang-hargaminyak1);
                    System.out.println("  |~Berarti kaknya beli minyak Sebanyak "+minyakberat+" liter") ;
                    System.out.println("  |~kaleh regane Rp."+hargaminyak1) ;
                    System.out.println("  |---------------------------------------------------");
                    System.out.println("  |~pengen nambah belanjaan kak"+nama ) ;
                    System.out.println("  |~Kalo ndak mau abaikan seperti biasa :'( " ) ;
                    System.out.print("  |~Masukkaan kode barange : " ) ;
                    tambahan = inputan2.nextLine();
                    System.out.println("  |---------------------------------------------------");

                    //namabah belanjaan--------------------------------------------------------------------------------------

                        switch (tambahan) {
                            case "1":
                            System.out.println("  |~Nambah beras kaleh regane 10k/kg ");
                            System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                            berasberatambahan = inputan.nextFloat();
                            hargaminyakberas = (int)(berasberatambahan*10000+hargaminyak1) ;
                            uangsisa1 = (uang-hargaminyakberas);
                            System.out.println("  |~Jadi tumbas minyak sebanyak "+minyakberat+" liter ditambah " );
                            System.out.println("  |~beras seberat "+berasberatambahan+" kg dengan total harga Rp."+hargaminyakberas );
                            System.out.println("  |---------------------------------------------------");
                            
                            
                            //SELESAII----------------------------------------------------
                            
                            if (uangsisa1 > 0) {
                                System.out.println("  |~Ya sudah suwun wes tumbas");
                                System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                System.out.println("  |---------------------------------------------------");

                            
                            }
                            
                            else if (uangsisa1 < 0 ){
                                System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                System.out.println("  |~Mbayar ac 5k terus moleh o");
                                System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                System.out.println("  |---------------------------------------------------");
                            }
                            
                            break;

                            case "2":
                                System.out.println("  |~Nambah jagung kaleh regane 11,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                minyakberatambahan = inputan.nextInt();
                                hargaminyakjagung = (int)(minyakberatambahan*11300+hargaminyak1) ;
                                uangsisa1 = (uang-hargaminyakjagung);
                                System.out.println("  |~Jadi tumbas minyak sebanyak "+minyakberat+" liter ditambah " );
                                System.out.println("  |~jagung seberat "+minyakberatambahan+" kg dengan total harga Rp."+hargaminyakjagung );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                                break;
                            
                            case "3":
                                
                                System.out.println("  |~Nambah telur kaleh regane 12,3k/kg ");
                                System.out.print("  |~badhe tumbas pinten kilo kak ?                 : ") ;
                                minyakberatambahan = inputan.nextInt();
                                hargaminyaktelur = (int)(minyakberatambahan*16300+hargaminyak1) ;
                                uangsisa1 = (uang-hargaminyaktelur);
                                System.out.println("  |~Jadi tumbas minyak sebanyak "+minyakberat+" liter ditambah " );
                                System.out.println("  |~telur seberat "+minyakberatambahan+" kg dengan total harga Rp."+hargaminyaktelur );
                                System.out.println("  |---------------------------------------------------");


                            //SELESAII----------------------------------------------------

                                if (uangsisa1 > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Susok e sampeyan : Rp."+uangsisa1);
                                    System.out.println("  |---------------------------------------------------");


                                }

                                else if (uangsisa1 < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                            break;
                        
                            default:

                                //SELESAII----------------------------------------------------
                                if (uangsisa > 0) {
                                    System.out.println("  |~Ya sudah suwun wes tumbas");
                                    System.out.println("  |~Sisa uang kak : Rp."+uangsisa);
                                }

                                else if (uangsisa < 0 ){
                                    System.out.println("  |~Ndak Iso duwek e kurang jadi kudu");
                                    System.out.println("  |~Mbayar ac 5k terus moleh o");
                                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                                    System.out.println("  |---------------------------------------------------");
                                }
                                break;
                        }


                        break;


                    default:
                    System.out.println("  |~OK ndak tuku ndak op2 mbayar ac 5k");
                    System.out.println("  |~Sisa uang mu sekarang Rp."+sisauanggkbeli);
                    System.out.println("  |---------------------------------------------------");
                        break;
                }

            } 

    }
}