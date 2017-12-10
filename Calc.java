package Item;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/** �������� ���������� ������� ��� ���������� � ����������� �����������.
* 
* @version 1.0
*/
public class Calc {
/** ��� �����, ������������ ��� ������������. */
private static final String FNAME = "Item.txt";
/** ��������� ��������� ����������. ������ ������ {@linkplain Item2d} */
private Item result;


/** �������������� {@linkplain Calc#result} */
public Calc() {
result = new Item();

}
/** ���������� �������� {@linkplain Calc#result}
* @param result - ����� �������� ������ �� ������ {@linkplain Item2d}
*/
public void setResult(Item result) {

this.result = result;
}
/** �������� �������� {@linkplain Calc#result}
* @return ������� �������� ������ �� ������ {@linkplain Item2d}
*/
public Item getResult() {
return result;
}
/** ��������� �������� �������.
* @param x - �������� ����������� �������.
* @return ��������� ���������� �������.
*/
private int calculation()
{
	double d=1000*Math.sin( Math.random()*360.0);
	double q=1000*Math.sin( Math.random()*360.0);
	double w=1000*Math.sin( Math.random()*360.0);
	double r=1000*Math.sin( Math.random()*360.0);
	double avr=(d+q+w+r)/4.0;
	int x= (int)avr;
	String s=Long.toBinaryString(x);
	int count =0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='1')
		{
			count++;
		}
		
	}
	return count;
	
	
}
private double calc(double x) {
return 1000* Math.sin(x);
}
/** ��������� �������� ������� � ���������
* ��������� � ������� {@linkplain Calc#result}
* @param x - �������� ����������� �������.
*/
public double average()
{
	return 0;
}
public double init(double x ) {
result.setX(x);
return result.setX(calculation());
}

/** ������� ��������� ����������. */
public void show() {
System.out.println(result);
}
/** ��������� {@linkplain Calc#result} � ����� {@linkplain Calc#FNAME}
* @throws IOException
*/
public void save() throws IOException {
ObjectOutputStream os = new ObjectOutputStream(new
FileOutputStream(FNAME));
os.writeObject(result);
os.flush();
os.close();
}
/** ��������������� {@linkplain Calc#result} �� ����� {@linkplain Calc#FNAME}
* @throws Exception
*/
public void restore() throws Exception {
	
ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
result = (Item)is.readObject();
is.close();
}
}