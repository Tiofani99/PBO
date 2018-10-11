public class tugas1{

public static void main(String[] args) {
    ninja[] konoha = new ninja[3];

    konoha[0]= new ninja();
    konoha[0].setNama("Uchiha Sasuke");
    konoha[0].setNoReg("012606");
    konoha[0].setTingkat("Genin");

    konoha[1]= new ninja();
    konoha[1].setNama("Uzumaki Naruto");
    konoha[1].setNoReg("012607");
    konoha[1].setTingkat("Genin");

    konoha[2]= new ninja();
    konoha[2].setNama("Haruno Sakura");
    konoha[2].setNoReg("012601");
    konoha[2].setTingkat("Chunin");

    System.out.println("========================================================");
    System.out.println("\t\tData Tim 7 Konohagakure \n");
    System.out.print("Nomor Registrasi \tNama \t\t\tTingkat\n");
    for(ninja x:konoha){
      System.out.print(x.getNoReg()+"\t\t\t"+x.getNama()+"\t\t"+x.getTingkat());
      System.out.println();
    }
    System.out.println("========================================================");
  }

}
