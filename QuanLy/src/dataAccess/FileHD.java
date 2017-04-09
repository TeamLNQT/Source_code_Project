package dataAccess;

import entity.HoaDon;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Nhan
 */
public class FileHD {
    File f = new File("HoaDon.DAT");
    public void ghiBD(ArrayList<HoaDon> list)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(list);
            oos.close();
        }   
        catch(Exception e){}
    }
    
    public ArrayList<HoaDon> docBD() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists())
            return new ArrayList<HoaDon>();
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        return (ArrayList<HoaDon>)ois.readObject();
    }
}

