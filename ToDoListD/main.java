package ToDoListD;

import java.util.Scanner;

public class main {
    public static void Main(){
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Add [0] | Delete [1] | View [2] | Save [3] | Load [4]");
            String inp = scanner.nextLine();
            switch (inp){
                case "0":
                    System.out.println("Task: (Empty for cancel)");
                    inp = scanner.nextLine();
                    if (inp.isEmpty()){
                        continue;
                    }
                    toDoList.add(inp);
                    continue;
                case "1":
                    System.out.println("Index: (Empty for cancel)");
                    inp = scanner.nextLine();
                    if (inp.isEmpty()){
                        continue;
                    }
                    toDoList.remove(Integer.parseInt(inp));
                    continue;
                case "2":
                    toDoList.view();
                    continue;
                case "3":
                    toDoList.save();
                    continue;
                case "4":
                    toDoList.setTasks(toDoList.load());
                    continue;
                default:
                    continue;
            }
        }
    }
}
