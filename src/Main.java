import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("how are you");
        String message =String.format("welcome ,%s,friends",name);
    }
}