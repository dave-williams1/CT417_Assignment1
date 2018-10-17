import java.util.ArrayList;
import java.util.Date;

public class Programme {
	String ProgramName;
	ArrayList<Module> modules = new ArrayList<Module>();
	Date start;
	Date end;
	
	public Programme(String name, Date Start, Date End){
		ProgramName = name;
		start = Start;
		end = End;
	}
	
	public void addModule(Module mod){
		modules.add(mod);
	}
}
