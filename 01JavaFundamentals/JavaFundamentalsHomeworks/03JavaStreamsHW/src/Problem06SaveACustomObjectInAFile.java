import java.util.*;
import java.io.*;

public class Problem06SaveACustomObjectInAFile {
    public static void main(String[] args) throws ClassNotFoundException {
        HashMap<String, Integer> course = new HashMap<>();
        course.put("Programming Basics", 400);
        course.put("Java Fundamentals", 200);
        course.put("Teamwork and Personal skills", 180);
        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("resources/course.save")))) {
            output.writeObject(course);
            output.close();
        } catch (IOException error) {
            System.err.println("Cannot write file!");
        }
        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("resources/course.save")))) {
            System.out.println(input.readObject());
            input.close();
        } catch (IOException error) {
            System.err.println("Cannot read from file!");
        }
    }
}
//code doesn't work well. probably need optimization on the execeptions handling. please help with your comments :)