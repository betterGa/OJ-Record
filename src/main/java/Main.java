import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

interface  A
        {public void methodA();}

interface B
{public void methodB();}

interface C extends A,B
{public void methodC();}

public class Main {

HashMap


    public static void main(String[] args)throws IOException {
       Properties properties=new Properties();
       properties.setProperty("xa","Xi'an");
       properties.setProperty("sh","shangHai");
       File file=new File("D:/test1.properties");
       properties.store(new FileOutputStream(file),"testProperties");
       properties.load(new FileInputStream(file));
       System.out.println(properties.getProperty("xa"));
    }
}
