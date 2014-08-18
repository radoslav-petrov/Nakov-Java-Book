package _20_OOP_1;

import java.math.BigDecimal;

public class Worker extends Human implements Comparable<Worker> {

	private BigDecimal wage = new BigDecimal("0.0");
	private double workHours;
	
	public BigDecimal calcOneHourWage() {
		return this.wage.divide(BigDecimal.valueOf(this.workHours));
	}

	public BigDecimal getWage() {
		return wage;
	}
	public void setWage(BigDecimal wage) {
		this.wage = wage;
	}
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	
	public Worker(String firstName, String lastName, BigDecimal wage, double workHours) {
		super(firstName, lastName);
		this.wage = wage;
		this.workHours = workHours;
		
	}

	@Override
	public int compareTo(Worker o) {
		return this.calcOneHourWage().compareTo(o.calcOneHourWage());
	}
	
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + " " + this.getWage() + "lv za " + this.getWorkHours() + "hours";
	}
	
}
