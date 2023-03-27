package partie1.idynamique;

import partie1.metier.IMetier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class DynamiqueInstantiation {
    private static Map<String, Object> context = new HashMap<>();
    DynamiqueInstantiation(){
        try {
            Class clazz = DynamiqueInstantiation.class;
            File config = new File(clazz.getClassLoader().getResource("my-config.properties").getFile());
            FileReader fileReader = new FileReader(config);
            BufferedReader bufferedFileReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedFileReader.readLine())!=null){
                String[] split = line.split("=");
                context.put(split[0],createAndInjectObject(split[1]));
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    public static void main(String[] args)throws Exception {
        DynamiqueInstantiation dynamiqueInstantiation = new DynamiqueInstantiation();

        IMetier iMetier = (IMetier) dynamiqueInstantiation.getBean("metier");
        double result = iMetier.calcul();
        System.out.println("iMetier.calcul(): "+result);
    }


    private Object getBean(String bean) throws Exception{
        return context.get(bean);

    }

    private Object createAndInjectObject(String c)throws Exception{
        Class clazz = Class.forName(c);
        Constructor[] constructors = clazz.getDeclaredConstructors();
        if(constructors.length>1)
            throw new Exception();
        Class[] parameterTypes = constructors[0].getParameterTypes();
        for (Class parameterType : parameterTypes) {
            for (Map.Entry<String, Object> entry: context.entrySet()) {
                Object value = entry.getValue();
                if(parameterType.isInstance(value)){
                    return constructors[0].newInstance(value);
                }
            }
        }
        return constructors[0].newInstance();
    }

}
