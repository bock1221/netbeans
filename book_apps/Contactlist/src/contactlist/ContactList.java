package contactlist;

public class ContactList{
    public static void main(String[] args) {
        //Nameable n = new Nameable();
        
        Person p = new Person();
        p.setName("Bob");
        p.setAddres("105 lexington");
        Orginazation o = new Orginazation();
        o.setName("PCS");
        o.setAddres("160 lexington");
        System.out.println(p.getName());
        System.out.println(o.getName());
        System.out.println(p.getAddres());
        System.out.println(o.getAddres());
        
    }
}

