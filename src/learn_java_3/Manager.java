package learn_java_3;
/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月17日 下午5:04:59 
 * 类说明 
 */
public class Manager extends Employee {
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day){
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double b){
		bonus = b;
	}
	
	
}
