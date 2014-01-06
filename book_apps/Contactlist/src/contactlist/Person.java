package contactlist;

public class Person implements Nameable,Adressible {
    private HasName myName = new HasName();
    private Hasaddress myAddres = new Hasaddress();
    public void setName(String name)
    {
        myName.setName(name);
    }
    
    public String getName()
    {
        return myName.getName();
    } 
      public void setAddres(String addres) {
        myAddres.setAddres(addres);
    }

    public String getAddres() {
        return myAddres.getAddres();
    }
}
