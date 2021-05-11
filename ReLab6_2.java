//แก้ method ให้สมบูรณ์
import javax.swing.JOptionPane;

public class ReLab6_2 {
    public static void main(String[] args) {
        int score[] = new int[10]; // declare and allocate array
        String output = "";
        // initial value
        for (int n = 0; n < score.length; n++)
            score[n] = rnd(100, 500);
        for (int n = 0; n < score.length; n++)
            output += "Score " + (n + 1) + " : " + score[n] + "\n";
        output += "Minimum value is " + getMin(score) + "\n";
        output += "Maximum value is " + getMax(score) + "\n";
        output += "Average value is " + getAverage(score) + "\n";
        JOptionPane.showMessageDialog(null, output, "Display Score in Array", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int getMin(int score[]) {
        int min = score[0];
        for(int i=1 ; i<score.length;i++){
            if (score[i] < min){
                min = score[i];
            }
        }
        return (min);
    }

    public static int getMax(int score[]) {
        int max = 0;
        for (int i=0; i<score.length;i++ ){
            if (max < score[i]){
                max = score[i];
            }
        }
        return (max);
    }

    public static int getAverage(int score[]) {
        int avg = 0, a=0;
        for(int i=0; i<10 ;i++){
            a +=score[i];
        }
        avg=a/10;
        return (avg);
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }
}