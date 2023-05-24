package Releval4;

import org.testng.annotations.Test;

import Releval1.Task1;
import Releval2.Pom_class;

public class Task3 extends Task1 {
	@Test
	public void task1()
	{
		Pom_class p=new Pom_class(driver);
		p.button();
	}

}
