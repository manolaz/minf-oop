package team;

/**
 * Project
 */
public class Project {
    public static void main(String[] args) {

        ConcreteEmployee con = new ConcreteEmployee();

        Member mem = new Member(con, "Marco Polo");
        System.out.println(mem);

        Leader lead = new Leader(mem, "Lead");
        System.out.println(lead);

        Manager mana = new Manager(lead, "Manager");
        System.out.println(mana);
        
      }
}