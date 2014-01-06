package undoredo;

public interface Command {
    void execute();
    void setAddressCommand(Person person,String address);
}
