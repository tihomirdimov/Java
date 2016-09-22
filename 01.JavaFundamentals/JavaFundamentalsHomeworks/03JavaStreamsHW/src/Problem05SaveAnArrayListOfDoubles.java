import java.util.*;
import java.io.*;

public class Problem05SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("resources/doubles.list"));
            ArrayList<Double> doubles = new ArrayList<>();
            doubles.add(88.8888);
            doubles.add(77.77);
            doubles.add(44.4);
            doubles.add(11.111);
            output.writeObject(doubles);
            output.close();
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("resources/doubles.list"));
            System.out.println(input.readObject());
            input.close();
        } catch (IOException e){
            System.out.println("Reading/writing error");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//code doesn't work well. probably need optimization on the execeptions handling. please help with your comments :)