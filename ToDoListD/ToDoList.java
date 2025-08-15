package ToDoListD;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;
    public ToDoList(ArrayList<String> tasks){
        this.tasks = tasks;
    }
    public ToDoList(){
        this.tasks = new ArrayList<>();
    }
    public void add(String task){
        tasks.add(task);
    }
    public void remove(int index){
        if(index < 0 || index >= tasks.size()){
            return;
        }
        tasks.remove(index);
    }
    public void view(){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + " " + tasks.get(i));
        }
    }
    public ArrayList<String> getTasks() {
        return tasks;
    }
    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }
    public void save(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File path: ");
        String fileName = scanner.nextLine() + ".txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String task: tasks){
                writer.write(task + "\n");
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public ArrayList<String> load(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File path: ");
        String fileName = scanner.nextLine() + ".txt";
        ArrayList<String> s = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String l = reader.readLine();
            while (l != null){
                s.add(l);
                l = reader.readLine();
            }


            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return s;
    }
}