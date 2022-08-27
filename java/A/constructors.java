package A;

public class constructors {
    int modelyear;
    String modelName;
    constructors(int year,String Name){
        modelyear=year;
        modelName=Name;

    }

    public static void main(String[] args) {
        constructors OBJ1=new constructors(2015,"mobile") ;
        System.out.println(OBJ1.modelyear+ " "+OBJ1.modelName);
    }

        }

