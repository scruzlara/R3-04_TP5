/**
 * la classe CompterJusque2 modelise des traitements a executer en parrallele * Dans ce cas, il s'agit de compter jusque 2
 */
public class CompterJusque2 extends Thread {
	private int idTraitement;
	/*** constructeur
	 */
	public CompterJusque2(int n) {
		this.idTraitement = n; }
	/**
	 * redefinition de la methode run() de thread * le traitement a executer
	 */
	public void run() {
		System.out.println("traitement " + idTraitement + "-> se lance");
		//compte de 1 a 2
		for (int i=1;i<3;i++){
			System.out.println("traitement " + idTraitement + "-> " + i);
			//attends un centieme de seconde
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("traitement " + idTraitement + "-> se finit"); }
}
