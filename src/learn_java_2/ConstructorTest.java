package learn_java_2;

import java.util.Random;

/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��16�� ����2:48:47 
 * ��˵�� 
 */
public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		for(Employee e: staff){
			System.out.println("name=" + e.getName() + ",id="+e.getId()+",salary="+e.getSalary());
		}
	}
}

class Employee{
	private static int nextId;
	private int id;
	private String name = ""; //ʵ�����Գ�ʼ��
	private double salary;
	
	//��̬��ʼ����
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	//�����ʼ����
	{
		id = nextId;
		nextId++;
	}
	
	//3�����صĹ�����
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public Employee(double s){
		// ���������Ĺ�����
		this("Employee #" + nextId, s);
	}
	
	//Ĭ�ϵĹ�����
	public Employee(){
		// name initialized to ""--see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getId(){
		return id;
	}
	
	
}
