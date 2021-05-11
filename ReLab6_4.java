//สร้าง Function rnd,setData,DisplayData
import javax.swing.JOptionPane;

public class ReLab6_4 {
    public static void main(String[] args) {
        int data[][];
        int row, col;

        row = Integer.parseInt(JOptionPane.showInputDialog("Enter number row : "));
        col = Integer.parseInt(JOptionPane.showInputDialog("Enter number column : "));
        data = new int[row][col];
        setData(data);
        displayData(data);

    }

    public static void setData(int data[][]) {
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                data[i][j] = rnd(10, 20);
    }

    public static void displayData(int data[][]) {
        String output = " ";
        for (int i = 0; i < data.length; i++) {
            output += "\n";
            for (int j = 0; j < data[i].length; j++)
                output += (data[i][j] + " ");
        }
        JOptionPane.showMessageDialog(null, output, "Display Score in Array", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }
}