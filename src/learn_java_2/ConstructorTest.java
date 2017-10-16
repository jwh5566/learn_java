package learn_java_2;

import java.util.Random;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月16日 下午2:48:47 
 * 类说明 
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
	private String name = ""; //实例属性初始化
	private double salary;
	
	//静态初始化块
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	//对象初始化块
	{
		id = nextId;
		nextId++;
	}
	
	//3个重载的构造器
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public Employee(double s){
		// 调用其他的构造器
		this("Employee #" + nextId, s);
	}
	
	//默认的构造器
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
