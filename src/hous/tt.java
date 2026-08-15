package hous;
import java.util.Scanner;
public class tt {
    public static void main(String[] args){
    Mange m=new Mange("yu","ty","ytr",23);
    m.work();

    System.out.println("\n"+m.start);
    }


}

abstract class Employer{
    long start = System.currentTimeMillis();
    private String name;
    private String id;
    private String salary;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSalary() {
        return salary;
    }

    public Employer(String name, String id, String salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();
    long end=System.currentTimeMillis();
}
  class Mange extends Employer{
    private double bonus;

    public Mange(String name, String id, String salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

      @Override
      public void work() {
          System.out.print("姓名"+getName()+"id"+getId());
      }
  }


