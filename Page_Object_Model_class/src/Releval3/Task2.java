package Releval3;

import org.testng.annotations.Test;

import Releval1.Task1;
import Releval2.Pom_class;

public class Task2 extends Task1  {
	
	@Test
	public void task()
	{
		Pom_class p=new Pom_class(driver);
		p.Lamt(5000000);
		p.tenure(180);
		p.Intrest(6.7f);
		p.payment();
		p.Amount(5000);
		p.Date(1);
		p.last();
		p.button();
	}

}
