package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TaskShow extends JFrame {
    private JTextArea task;
    private JTextArea solution;
    private JButton prevTaskBtn;
    private JButton nextTaskBtn;
    private int currentTask = 0;
    private ArrayList<TaskInfo> tasks;

    public TaskShow(ArrayList<TaskInfo> info) {
        super("Task " + String.valueOf(info.get(0).numberOfTask));
        tasks = info;
        initialSettings(info.get(0));
    }
    public void initialSettings(TaskInfo info){
        task = new JTextArea(info.description);
        solution = new JTextArea(info.solution);
        prevTaskBtn = new JButton("Previous Task");
        nextTaskBtn = new JButton("Next Task ");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(task);
        buttonsPanel.add(solution);
        buttonsPanel.add(prevTaskBtn);
        buttonsPanel.add(nextTaskBtn);
        add(buttonsPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        prevTaskBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               setTask(--currentTask);
            }
        });
        nextTaskBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                setTask(++currentTask);
            }
        });

    }
    public void setTask(int indexOfTask){
        setTitle("Task "+ String.valueOf(indexOfTask+1));

        task.setText(tasks.get(indexOfTask).description);
        solution.setText(tasks.get(indexOfTask).solution);

    }
}
