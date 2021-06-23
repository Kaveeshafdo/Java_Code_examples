/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;


public class NewRefactoringDemo1 {
    public static void main(String[] args) {
		NewRefactoringDemo1 r = new NewRefactoringDemo1();
		int counter = 0;
		System.out.println(counter++);
		D d = new D();
                d.doSmth();
                r.Dos();
	}
	
	 void Dos(){
            System.out.println("jjjj");
        }
}
class D{
    public void doSmth() {
		      System.out.println("ffff");
	}
    
}