/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanII;
import java.util.Scanner;

// *
// * @author Naufal Zaki
// *         TIFRP 19A
// *         19552011155
// *  Teknik Informatika
// ----------------------------------
// * SEKOLAH TINGGI TEKNOLOGI BANDUNG
// ----------------------------------
// */


public class MenghitungNilaiMahasiswa {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       
        String nama, nim;
        final double UAS, UTS, Tugas, Absensi, NilaiAkhir;
        char grade;
        
            System.out.println("------------><------------");
            System.out.println("Menghitung Nilai Mahasiswa");
            System.out.println("------------><------------");
            System.out.println("Ketentuan : UAS     40%   ");
            System.out.println("            UTS     30%   ");
            System.out.println("            Tugas   20%   ");
            System.out.println("            Absensi 10%   ");
            System.out.println("------------><------------");
            System.out.print("Masukan Nama Mahasiswa : ");
            nama=input.nextLine();
            System.out.print("Masukan NIM : ");
            nim=input.nextLine();
            System.out.print("Nilai UAS : ");
            UAS=input.nextInt();
            System.out.print("Nilai UTS : ");
            UTS=input.nextInt();
            System.out.print("Nilai Tugas : ");
            Tugas=input.nextInt();
            System.out.print("Total Kehadiran Absensi : ");
            Absensi=input.nextInt();
            
            NilaiAkhir=(0.4 * UAS + 0.3 * UTS + 0.2 * Tugas + 0.1 * Absensi);
                
                if(NilaiAkhir>=80) {
                    grade = 'A';
                }
                else if(NilaiAkhir>=69) {
                    grade = 'B';
                }
                else if(NilaiAkhir>=58) {
                    grade = 'C';
                }
                else if(NilaiAkhir>=47) {
                    grade = 'D';
                }else {
                    grade = 'E';
                }
                
                if(grade == 'A' || grade == 'B' || grade == 'C') {
                    System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki Nilai Akhir "+
                                        NilaiAkhir+" | grade ("+grade+")"+"" + "\n"+nama+" dinyatakan Lulus"); 
                }else{
                    System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki Nilai Akhir "+
                                        NilaiAkhir+" | grade ("+grade+")"+"" + "\n"+nama+" dinyatakan Tidak Lulus");  
                }
    }
}
