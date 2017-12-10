package Item;

import java.io.Serializable;
/** ������ �������� ������ � ��������� ����������.
* 
* @version 1.0
*/
public class Item implements Serializable {
/** �������� ����������� �������. */
// transient
private double x;
/** ��������� ���������� �������. */
private double y;

/** ������������� ��������������� ��������� */
private static final long serialVersionUID = 1L;
/** �������������� ���� {@linkplain Item2d#x}, {@linkplain Item2d#y} */
public Item() {
x = .0;
y = .0;
}
/** ������������� �������� �����: ���������
* � ���������� ���������� �������.
* @param x - �������� ��� ������������� ���� {@linkplain Item2d#x}
* @param y - �������� ��� ������������� ���� {@linkplain Item2d#y}
*/
public Item(double x, double y) {
this.x = x;
this.y = y;
}
/** ��������� �������� ���� {@linkplain Item2d#x}
* @param x - �������� ��� {@linkplain Item2d#x}
* @return �������� {@linkplain Item2d#x}
*/
public double setX(double x) {
return this.x = x;
}
/** ��������� �������� ���� {@linkplain Item2d#x}
* @return �������� {@linkplain Item2d#x}
*/
public double getX() {
return x;
}
/** ��������� �������� ���� {@linkplain Item2d#y}
* @param y - �������� ��� {@linkplain Item2d#y}
* @return �������� {@linkplain Item2d#y}
*/
public double setY(double y) {
return this.y = y;
}
/** ��������� �������� ���� {@linkplain Item2d#y}
* @return �������� {@linkplain Item2d#y}
*/
public double getY() {
return y;
}
/** ��������� �������� {@linkplain Item2d#x} � {@linkplain Item2d#y}
* @param x - �������� ��� {@linkplain Item2d#x}
* @param y - �������� ��� {@linkplain Item2d#y}
* @return this
*/
public Item setXY(double x, double y) {
this.x = x;
this.y = y;
return this;
}
/** ������������ ��������� ���������� � ���� ������.<br>{@inheritDoc} */
@Override
public String toString() {
return "x = " + x + ", y = " + y;
}
/** ������������� ��������������� �����.<br>{@inheritDoc} */
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;

Item other = (Item) obj;
if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
return false;
// �������� ��������� ���������� ���������� �������
if (Math.abs(Math.abs(y) - Math.abs(other.y)) > .1e-10)
return false;
return true;
}
}