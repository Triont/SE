package Item;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/** Содержит реализацию методов для вычисления и отображения результатов.
* 
* @version 1.0
*/
public class Calc {
/** Имя файла, используемое при сериализации. */
private static final String FNAME = "Item.txt";
/** Сохраняет результат вычислений. Объект класса {@linkplain Item2d} */
private Item result;


/** Инициализирует {@linkplain Calc#result} */
public Calc() {
result = new Item();

}
/** Установить значение {@linkplain Calc#result}
* @param result - новое значение ссылки на объект {@linkplain Item2d}
*/
public void setResult(Item result) {

this.result = result;
}
/** Получить значение {@linkplain Calc#result}
* @return текущее значение ссылки на объект {@linkplain Item2d}
*/
public Item getResult() {
return result;
}
/** Вычисляет значение функции.
* @param x - аргумент вычисляемой функции.
* @return результат вычисления функции.
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
/** Вычисляет значение функции и сохраняет
* результат в объекте {@linkplain Calc#result}
* @param x - аргумент вычисляемой функции.
*/
public double average()
{
	return 0;
}
public double init(double x ) {
result.setX(x);
return result.setX(calculation());
}

/** Выводит результат вычислений. */
public void show() {
System.out.println(result);
}
/** Сохраняет {@linkplain Calc#result} в файле {@linkplain Calc#FNAME}
* @throws IOException
*/
public void save() throws IOException {
ObjectOutputStream os = new ObjectOutputStream(new
FileOutputStream(FNAME));
os.writeObject(result);
os.flush();
os.close();
}
/** Восстанавливает {@linkplain Calc#result} из файла {@linkplain Calc#FNAME}
* @throws Exception
*/
public void restore() throws Exception {
	
ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
result = (Item)is.readObject();
is.close();
}
}