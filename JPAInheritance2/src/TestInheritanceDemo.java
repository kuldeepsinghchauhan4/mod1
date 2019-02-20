import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestInheritanceDemo {
public static void main(String arg[]) {
	Emp kuldeep=new Emp();
	kuldeep.setEmpName("kuldeep singh");
	kuldeep.setEmpSal(60000);
	Manager sonu=new Manager();
	sonu.setEmpName("sonusingh");
	sonu.setEmpSal(55000.0F);
	sonu.setDeptName("java");
	EntityManager em=JPAUtil.getEntityManger();
	EntityTransaction tran=em.getTransaction();
	tran.begin();
	em.persist(kuldeep);
	em.persist(sonu);
	tran.commit();
	System.out.println("DHJSHFJKS");
	
}
}
