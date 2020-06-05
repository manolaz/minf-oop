package team;

/**
 * Project
 */
public class Project {
    public static void main(String[] args) {

        ConcreteEmployee con = new ConcreteEmployee();

        Member mem = new Member(con, "Marco Polo");
        mem.doTask();

        Leader lead = new Leader(mem, "Lead");
        lead.doTask();

        Manager mana = new Manager(lead, "Manager");
        mana.doTask();
        
      }
}