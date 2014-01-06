package undoredo;

public class SetNameCommand implements Command {
    private Person person;
    private String name;
    private String address;
    public SetNameCommand(Person person, String name) {
        
        this.name = name;
        this.person=person;
    }
  
    public void setAddressCommand(Person person,String address){
    this.address=address;
    }
    
    public void execute() {
        String oldName = person.getName();
        person.setName(name);
        name = oldName;
        String oldAddress=person.getAddress();
        person.setAddress(address);
        address=oldAddress;
    }
}
