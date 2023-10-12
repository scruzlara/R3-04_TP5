public class Principale {
	public static void main(String[] args) {
		//construction des traitements
		CompterJusque2 cmp=new CompterJusque2(1);
		CompterJusque2 cmp2=new CompterJusque2(2);
		CompterJusque2 cmp3=new CompterJusque2(3);
		//lancement des traitements
		cmp.start(); // le main continue
		cmp2.start(); // le main continue
		cmp3.start(); // le main continue jusqu'à la fin des traitements System.out.println("traitements encore en attente");
	}
}
