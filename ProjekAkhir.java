import java.util.Scanner;
public class ProjekAkhir{
	static Scanner sc = new Scanner(System.in);
    static int baris,kolom,tahun,hari,jam,jumlahGaji;
    static double akun;
    static String pass;
    static int[][] array;
    static String[][] nama,status;
    static double[][] totalgaji,tunIstri,tunAnak,total,lembur,bersih,nip;
    static double kelas[] = {1560800,2022200,2579400,3044300};
    static double gajipokok[] = {49200,64700,81300,95900};
    static double tunMakan[] = {35000,35000,37000,41000};
    static double uangLembur[] = {13000,17000,20000,25000};

    public static void dataPegawai(){
        nama=new String[baris][kolom];
        nip=new double[baris][kolom];
        status=new String[baris][kolom];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print("Nama Pegawai ke " +(i+1)+ "          : ");
                nama[i][j] = sc.next();
                nama[i][j]+= sc.nextLine();
                System.out.print("Nomor Identitas (NIP)      : ");
                nip[i][j]=sc.nextDouble();
                System.out.print("Pegawai Bagian             : ");
                status[i][j]= sc.next();
                System.out.println("-----------------------------------");
                System.out.println("         PEGAWAI KE -  " +(i+1)+ "   ");
                System.out.println("-----------------------------------");
                System.out.println("Nama Pegawai                = "+nama[i][j]);
                System.out.println("Nomor Identitas (NIP)       = "+(int)nip[i][j]);
                System.out.println("Status Pegawai              = "+status[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void golonganPegawai(){
    	for(int i=0; i<array.length; i++){
    		for(int j=0; j<array[0].length; j++){
    			System.out.println("-----------------------------------");
                System.out.println("         PEGAWAI KE -  " +(i+1)+ "   ");
                System.out.println("-----------------------------------");
                System.out.print("Masukkan Tahun Masa Kerja menjadi Pegawai Bank  : ");
                tahun= sc.nextInt();
                System.out.print("Masukkan Golongan Pegawai ( 1 / 2 / 3 / 4 ) : ");
                int golongan = sc.next().charAt(0);
                switch(golongan){
                    case'1':
                    System.out.println("Gaji awal golongan 1 sebesar = Rp. "+kelas[0]);
                    System.out.println("Gaji pokok sebesar           = Rp. "+gajipokok[0]);
                    totalgaji[i][j]= kelas[0]+(gajipokok[0]*tahun);
                    System.out.println("Total Gaji                   = Rp. "+totalgaji[i][j]);
                    break;
                    case'2':
                    System.out.println("Gaji awal golongan 2 sebesar = Rp. "+kelas[1]);
                    System.out.println("Gaji pokok sebesar           = Rp. "+gajipokok[1]);
                    totalgaji[i][j] = kelas[1]+(gajipokok[1]*tahun);
                    System.out.println("Total Gaji                   = Rp. "+totalgaji[i][j]);
                    break;
                    case'3':
                    System.out.println("Gaji awal golongan 3 sebesar = Rp. "+kelas[2]);
                    System.out.println("Gaji pokok sebesar           = Rp. "+gajipokok[2]);
                    totalgaji[i][j] = kelas[2]+(gajipokok[2]*tahun);
                    System.out.println("Total Gaji                   = Rp. "+totalgaji[i][j]);
                    break;
                    case'4':
                    System.out.println("Gaji awal golongan 4 sebesar = Rp. "+kelas[3]);
                    System.out.println("Gaji pokok sebesar           = Rp. "+gajipokok[3]);
                    totalgaji[i][j] = kelas[3]+(gajipokok[3]*tahun);
                    System.out.println("Total Gaji                   = Rp. "+totalgaji[i][j]);  
                    break;
                    default:
                    System.out.println("Masukkan Golongan PNS ( 1 / 2 / 3 / 4 ) dengan benar! ");
                }
    		}System.out.println();
    	}
    }
	public static void tunjanganIstriAnak(){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				System.out.println("-----------------------------------");
                System.out.println("         PEGAWAI KE -  " +(i+1)+ "   ");
                System.out.println("-----------------------------------");
                System.out.print("Total Gaji Pegawai Bank          = Rp. ");
                jumlahGaji= (int) sc.nextDouble();
                tunIstri[i][j] =(jumlahGaji* 10 / 100);
                System.out.println("->> Tunjangan Istri sebesar  = Rp. " + tunIstri[i][j]);
                tunAnak[i][j] =(jumlahGaji* 2 / 100);
                System.out.println("->> Tunjangan Anak sebesar   = Rp. " + tunAnak[i][j]);
			}System.out.println();
		}
	}
	public static void tunjanganMakan(){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.println("-----------------------------------");
                System.out.println("         PEGAWAI KE -  " +(i+1)+ "   ");
                System.out.println("-----------------------------------");
                System.out.print("Masukkan berapa hari anda bekerja       : ");
                hari= sc.nextInt();
                System.out.print("Masukkan Golongan Pegawai ( 1 / 2 / 3 / 4 ) : ");
                int tunGolonganKe = sc.nextInt();
                if (tunGolonganKe == 1){
                    System.out.println("->> Tunjangan Golongan 1 sebesar  : Rp. "+tunMakan[0]);
                    total[i][j]=(tunMakan[0] * hari);
                    System.out.println("->> Total Tunjangan Makan sebesar : Rp. "+total[i][j]);
                }
                else if (tunGolonganKe == 2){
                    System.out.println("->> Tunjangan Golongan 2 sebesar  : Rp. "+tunMakan[1]);
                    total[i][j]=(tunMakan[1] * hari);
                    System.out.println("->> Total Tunjangan Makan sebesar : Rp. "+total[i][j]);
                }
                else if (tunGolonganKe == 3){
                    System.out.println("->> Tunjangan Golongan 3 sebesar  : Rp. "+tunMakan[2]);
                    total[i][j]=(tunMakan[2] * hari);
                    System.out.println("->> Total Tunjangan Makan sebesar : Rp. "+total[i][j]);
                }
                else if (tunGolonganKe == 4){
                    System.out.println("->> Tunjangan Golongan 4 sebesar  : Rp. "+tunMakan[3]);
                    total[i][j]=(tunMakan[3] * hari);
                    System.out.println("->> Total Tunjangan Makan sebesar : Rp. "+total[i][j]);
                }
                else{
                    System.out.println("Masukkan Golongan Pegawai ( 1 / 2 / 3 / 4 ) dengan benar! ");
                }
            }System.out.println(" ");
        }
    }
    public static void lembur(){
    	for(int i=0; i<array.length; i++){
    		for(int j=0; j<array[0].length; j++){
    			System.out.println("-----------------------------------");
                System.out.println("            PEGAWAI KE -  " +(i+1)+ "   ");
                System.out.println("-----------------------------------");
                System.out.print("Masukkan berapa banyak Jam Lembur            : ");
                jam= sc.nextInt();
                System.out.print("Masukkan Golongan Pegawai ( 1 / 2 / 3 / 4 ) : ");
                int lemburGolKe = sc.nextInt();
                if(lemburGolKe == 1){
                	System.out.println("Uang Lembur Pegawai golongan 1    : Rp. "+uangLembur[0]);
                    lembur[i][j]= (uangLembur[0] * jam);
                    System.out.println("->> Uang Lembur sebesar           : Rp. "+lembur[i][j]);
                }
                else if(lemburGolKe == 2){
                	System.out.println("Uang Lembur Pegawai golongan 2    : Rp. "+uangLembur[1]);
                    lembur[i][j]= (uangLembur[1] * jam);
                    System.out.println("->> Uang Lembur sebesar           : Rp. "+lembur[i][j]);
                }
                else if(lemburGolKe == 3){
                	System.out.println("Uang Lembur Pegawai golongan 3    : Rp. "+uangLembur[2]);
                    lembur[i][j]= (uangLembur[2] * jam);
                    System.out.println("->> Uang Lembur sebesar           : Rp. "+lembur[i][j]);
                }
                else if(lemburGolKe == 4){
                	System.out.println("Uang Lembur Pegawai golongan 4    : Rp. "+uangLembur[3]);
                    lembur[i][j]= (uangLembur[3] * jam);
                    System.out.println("->> Uang Lembur sebesar           : Rp. "+lembur[i][j]);
                }
                else{
                	System.out.println("Masukkan Golongan Pegawai ( 1 / 2 / 3 / 4 ) dengan benar! ");
                }
    		}System.out.println();
    	}
    }
    public static void slipGaji(){
        bersih=new double[baris][kolom];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                    System.out.print("Masukkan Nama Pegawai : ");
                    String cariNama=sc.next();
                    cariNama+=sc.nextLine();
                if (cariNama.equals(nama[i][j])){
                    System.out.println("------------------------------------------");
                    System.out.println("        CETAK SLIP GAJI PEGAWAI    ");
                    System.out.println("------------------------------------------");
                    System.out.println("Nama Pegawai ke " +(i+1)+ "          : "+nama[i][j]);
                    System.out.println("Nomor Identitas (NIP)      : "+(int)nip[i][j]);
                    System.out.println("----------- PENGHASILAN GAJI ---------------");
                    System.out.println("Gaji Pokok                 : Rp. " +totalgaji[i][j]);
                    System.out.println("--------------- TUNJANGAN ------------------");
                    System.out.println("Tunjangan Istri            : Rp. " +tunIstri[i][j]);
                    System.out.println("Tunjangan Anak             : Rp. " +tunAnak[i][j]);
                    System.out.println("Tunjangan Makan            : Rp. " +total[i][j]);
                    System.out.println("Uang Lembur                : Rp. " +lembur[i][j]);
                    System.out.println("----------- TOTAL PENGHASILAN GAJI  --------");
                    bersih[i][j] = totalgaji[i][j]+tunIstri[i][j]+tunAnak[i][j]+total[i][j]+lembur[i][j];
                    System.out.println("Total Gaji yang diterima   : Rp. " +bersih[i][j]);
                }
                else{
                    System.out.println("Masukkan Nama yang sesuai dengan Urutan Data Pegawai");
                }
                System.out.print("Apakah Anda ingin mencetak Slip Gaji Pegawai lainnya? (ya / tidak) = ");
                String jawaban = sc.next();
                if(jawaban.equals("tidak")){
                    System.out.println("----------- CETAK SLIP GAJI BERAKHIR ---------");
                    System.out.println("=======================================================");
                    System.out.println("Silahkan menuju Fitur Menu Selanjutnya ");
                }
            }System.out.println();
        }
    }
    public static void pencarian(){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                    System.out.print("Masukkan Nama Pegawai yang Anda cari : ");
                    String cariNama=sc.next();
                    cariNama+=sc.nextLine();
                if (cariNama.equals(nama[i][j])){
                    System.out.println("-----------------------------------");
                    System.out.println("      HASIL PENCARIAN NAMA     ");
                    System.out.println("-----------------------------------");
                    System.out.println("Nama Pegawai ke " +(i+1)+ "         : "+nama[i][j]);
                    System.out.println("Nomor Identitas (NIP)      : "+(int)nip[i][j]);
                    System.out.println("Status Pegawai             : "+status[i][j]);
                    System.out.println("----------- PENGHASILAN GAJI ---------------");
                    System.out.println("Gaji Pokok                 : Rp. " +totalgaji[i][j]);
                    System.out.println("----------- TOTAL PENGHASILAN GAJI  --------");
                    System.out.println("Total Gaji yang diterima   : Rp. " +bersih[i][j]); 
                } 
                else{
                    System.out.println("Masukkan Nama yang sesuai dengan urutan Data Pegawai");
                }
                System.out.print("Apakah Anda ingin mencari Data Pegawai lainnya? (ya / tidak) = ");
                String jawaban = sc.next();
                if(jawaban.equals("tidak")){
                    System.out.println("----------- PENCARIAN BERAKHIR ---------");
                    System.out.println("=======================================================");
                    System.out.println("Silahkan menuju Fitur Menu Selanjutnya ");
                }
            }System.out.println();
        }
    }
    public static void pelaporan(){
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("                                                                                      PELAPORAN PEGAWAI BANK    ");
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________"); 
            System.out.println("Pegawaia Ke-       Nama Pegawai Bank          NIP             Status Pegawai \t  Gaji Pokok \t\tTunjangan Istri \t   Tunjangan Anak \t   Tunjangan Makan \t  Uang Lembur  \t  Gaji Bersih");
            for(int i=0; i<array.length; i++){
                for(int j=0; j<array[0].length; j++){   
                    System.out.println("  "+(i+1)+"  \t\t" + nama[i][j] +"\t  "+ (int)nip[i][j]+"\t       "+status[i][j]+"\t\t  "+totalgaji[i][j]+"\t\t"+tunIstri[i][j]+"\t\t   "+tunAnak[i][j]+"\t\t   "+total[i][j]+"\t\t   "+lembur[i][j]+"\t   "+bersih[i][j]);
                }System.out.println();
        }
    }
    public static void main(String[] args){
    	System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                SISTEM PROGRAM PENGGAJIAN PEGAWAI BANK ");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.print("Masukkan Nomor Akun (NIP): ");     
        akun = sc.nextDouble();
        System.out.print("Masukkan Password        : ");
        pass = sc.next();
        System.out.println("-----------Pilihan Fitur Program-----------");
        System.out.println("1. Fitur Menu Data Pegawai Bank");
        System.out.println("2. Fitur Menu Perhitungan Gaji Pegawai Bank");
        System.out.println("3. Fitur Menu Cetak Slip Gaji Tiap Pegawai Bank");
        System.out.println("4. Fitur Menu Pencarian Pegawai Bank");
        System.out.println("5. Fitur Menu Pelaporan Pegawai Bank");
        System.out.print("Silahkan Anda memilih Fitur Menu (1 / 2 / 3 / 4 / 5) = Fitur ");
        int fitur = sc.nextInt();
        switch (fitur){
            case 1:
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("                                FITUR MENU DATA PEGAWAI ");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("        INPUT DATA PERSONAL PEGAWAI BANK    ");
            System.out.println("------------------------------------------");
            System.out.print("Masukkan Jumlah Pegawai Bank : ");
            baris=sc.nextInt();
            kolom=baris-(baris-1);
            array = new int[baris][kolom];
            System.out.println();
            dataPegawai();
            System.out.print("Apakah Anda ingin melanjutkan ke Fitur Menu selanjutnya? (ya / tidak) = ");
            String jawaban = sc.next();
            if(jawaban.equals("tidak")){
                System.out.println("----------- PROGRAM TELAH BERAKHIR ---------");
                break;
            }
            case 2:
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("                                FITUR MENU PERHITUNGAN GAJI PEGAWAI BANK ");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("----------- Pilihan -----------");
            System.out.println("1. Gaji Pokok");
            System.out.println("2. Gaji Tunjangan");
            System.out.println("3. Gaji Lembur");
            System.out.print("Silahkan Anda memilih (1 / 2 / 3) = Nomor ");
            int pilihanGaji = sc.nextInt();
            switch (pilihanGaji){
                case 1:
                totalgaji=new double[baris][kolom];
                golonganPegawai();
                System.out.println("=======================================================");
                System.out.println("Anda menuju Pilihan Menu Menghitung Gaji Tunjangan ");
                case 2:
                System.out.println("----------------------------------");
                System.out.println("    TUNJANGAN PEGAWAI BANK ");
                System.out.println("----------------------------------");
                System.out.println("----------- Pilihan -----------");
                System.out.println("1. Tunjangan Istri dan Anak");
                System.out.println("2. Tunjangan Makan ");
                System.out.print("Silahkan Anda memilih (1 / 2) = Nomor ");
                int menuTunjangan = sc.nextInt();
                switch(menuTunjangan){
                    case 1:
                    tunIstri=new double[baris][kolom];
                    tunAnak=new double[baris][kolom];
                    System.out.println("----------- Menghitung Tunjangan Istri dan Anak-----------");
                    tunjanganIstriAnak();
                    System.out.println("=======================================================");
                    System.out.println("Anda menuju Pilihan Menu Menghitung Tunjangan Makan ");
                    case 2:
                    total=new double[baris][kolom];
                    System.out.println("----------- Menghitung Tunjangan Makan -----------");
                    tunjanganMakan();
                    System.out.println("=======================================================");
                    System.out.println("Anda menuju Pilihan Menu Menghitung Gaji Lembur ");
                    break;
                    default:
                        System.out.println("Masukkan Pilihan (1/2) dengan benar! ");    
                }
                case 3:
                lembur=new double[baris][kolom];
                System.out.println("----------------------------------");
                System.out.println("    UANG LEMBUR PEGAWAI BANK    ");
                lembur();
                break;
                default:
                System.out.println("Masukkan Pilihan Menu (1/2/3) dengan benar! ");   
            }
            System.out.print("Apakah Anda ingin mencetak Slip Gaji Pegawai Bank ? (ya / tidak) = ");
            jawaban = sc.next();
            if(jawaban.equals("tidak")){
                pelaporan();
                System.out.println("----------- PROGRAM TELAH BERAKHIR ---------");
                break;
            }
            case 3:
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("                                FITUR MENU CETAK SLIP GAJI PEGAWAI BANK ");
                System.out.println("-----------------------------------------------------------------------------------------------");
                slipGaji();
                System.out.print("Apakah Anda ingin melanjutkan ke Fitur Menu selanjutnya? (ya / tidak) = ");
                jawaban = sc.next();
                if(jawaban.equals("tidak")){
                    pelaporan();
                    System.out.println("----------- PROGRAM TELAH BERAKHIR ---------");
                    break;
                }
            case 4:
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("                                FITUR MENU PENCARIAN PEGAWAI BANK ");
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("----------- PENCARIAN PEGAWAI ---------");
                pencarian();
                System.out.print("Apakah Anda ingin melanjutkan ke Fitur Pelaporan Pegawai Bank ? (ya / tidak) = ");
                jawaban = sc.next();
                if(jawaban.equals("tidak")){
                    pelaporan();
                    System.out.println("----------- PROGRAM TELAH BERAKHIR ---------");
                    break;
                }
            case 5:
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println("                                FITUR MENU PELAPORAN PEGAWAI BANK ");
                System.out.println("-----------------------------------------------------------------------------------------------");
                pelaporan();
                System.out.print("Apakah Anda ingin kembali ke Menu awal? (ya / tidak) = ");
                jawaban = sc.next();
                if(jawaban.equals("tidak")){
                    System.out.println("----------- PROGRAM TELAH BERAKHIR ---------");
                    System.out.println("----------- ANDA HARUS MEMULAI PROGRAM DARI AWAL ---------");
                    break;
                } else {
                    System.out.println();
                    dataPegawai();
                    System.out.println("---------------- PROGRAM TELAH BERAKHIR --------------");
                    System.out.println("----------- ANDA HARUS MEMULAI PROGRAM DARI AWAL ---------");
                    break;
                }
            default:
            System.out.println("Masukkan Pilihan Menu dengan benar! ");
        }
    }

}