import com.sun.javadoc.*;


public class ListClass {

	public static boolean start(RootDoc root) 
	{		
		ListClass def = new ListClass();
		ClassDoc[] classes = root.classes();
        for (int i = 0; i < classes.length; ++i) {
    		if (i > 0)
	            System.out.println(",");
    		
    		def.DumpClass(classes[i]);

        }
        return true;
	}

	void DumpClass(ClassDoc c)
	{
		
		System.out.println("\"" + c.simpleTypeName() + "\" : {");
		String[] namespaces = c.qualifiedTypeName().split("\\.");
		
		String packageName = "";
		for(int i = 0; i < namespaces.length - 1; i++)
		{
			if (i > 0)
				packageName += ".";
			packageName += namespaces[i];
			
		}
		
		System.out.println("\"package\" : \"" + c.qualifiedTypeName() + "\", ");
		System.out.println("\"props\" : {");
		
		FieldDoc[] f = c.fields();
		for (int i = 0; i < f.length; i++)
		{
			if (i > 0)
				System.out.println(",");
            System.out.println("\"" + f[i].name()+ "\": \"" + f[i].type().simpleTypeName() + "\"");
		}
		
		MethodDoc[] m = c.methods();
		for (int i = 0; i < m.length; i++)
		{
			if (i > 0 || f.length > 0)
				System.out.println(",");
            System.out.print("\"" + m[i].name() + "(");
            for (int j = 0; j < m[i].parameters().length; j++)
            {
            	if (j > 0)
            		System.out.print(",");
            	System.out.print(m[i].parameters()[j].name());
            }
            System.out.println(")\" : \"" + m[i].returnType().simpleTypeName() + "\"");
		}
		System.out.println("} }");
	}
	
	
}
