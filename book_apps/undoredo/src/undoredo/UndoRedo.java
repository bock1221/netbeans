package undoredo;

public class UndoRedo {
    private static UndoRedoManager undoRedo = new UndoRedoManager();
    
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
        
        //p.setName("Bob");
        
        Command command = new SetNameCommand(person, "Bob");
        command.setAddressCommand(person,"1 lexington");
        command.execute();
        undoRedo.addCommand(command);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        
        command = new SetNameCommand(person, "Charlie");
        command.setAddressCommand(person,"2 lexington");
        command.execute();
        undoRedo.addCommand(command);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        
        command = new SetNameCommand(person, "Joe");
        command.setAddressCommand(person,"3 lexington");
        command.execute();
        undoRedo.addCommand(command);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        
        while(undoRedo.canUndo()) {
            undoRedo.undo();
            System.out.println(person.getName());
            System.out.println(person.getAddress());
        }
        
        while(undoRedo.canRedo()) {
            undoRedo.redo();
            System.out.println(person.getName());
            System.out.println(person.getAddress());
        }
    }
}
