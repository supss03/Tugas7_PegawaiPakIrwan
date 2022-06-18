package pegawaipakirwan;

import java.util.ArrayList;

public class PegawaiPakIrwan {

    public static void main(String[] args) {
        ArrayList<Pegawai> pegawai = new ArrayList<>();

        pegawai.add(new PegawaiTetap("Bayu", "3507284903274240892342", 2000000));
        pegawai.add(new PegawaiTetap("Yusuf", "3507284903274240892345", 4500000));
        pegawai.add(new PegawaiTetap("Sarah", "3507284903274240892348", 9750000));
        
        pegawai.add(new PegawaiHarian("Edo", "3507284903274240892343", 8500, 40));
        pegawai.add(new PegawaiHarian("LilY", "3507284903274240892346", 8500, 60));
        pegawai.add(new PegawaiHarian("Siti", "3507284903274240892349", 8500, 35));
        
        pegawai.add(new Sales("Tika", "3507284903274240892342", 50, 50000));
        pegawai.add(new Sales("Ahmad", "3507284903274240892347", 23, 50000));
        pegawai.add(new Sales("Bima", "3507284903274240892350", 100, 50000));

        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}