package testiusb;/*
    @wersion yu
*/

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class BubbleSortVisualizer extends JFrame {
    // 待排序数组
    private static int[] arr = {30, 10, 50, 20, 60, 40, 70, 90, 80, 100};
    private DrawPanel panel;

    // 当前比较的两个下标（用于高亮）
    private int compareI = -1;
    private int compareJ = -1;

    public BubbleSortVisualizer() {
        setTitle("冒泡排序动态可视化");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new DrawPanel();
        add(panel);
    }

    // 绘制面板
    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            int barWidth = width / arr.length;

            for (int i = 0; i < arr.length; i++) {
                // 正在比较的柱子：红色
                if (i == compareI || i == compareJ) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.CYAN);
                }
                int barHeight = arr[i] * 4; // 放大高度
                g.fillRect(i * barWidth, height - barHeight, barWidth - 2, barHeight);
                g.setColor(Color.BLACK);
                g.drawString(arr[i] + "", i * barWidth + 5, height - 5);
            }
        }
    }

    // 冒泡排序 + 动态刷新
    public void bubbleSort() throws InterruptedException {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                compareI = j;
                compareJ = j + 1;
                panel.repaint();  // 刷新界面
                Thread.sleep(300); // 停顿看动画

                if (arr[j] > arr[j + 1]) {
                    // 交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    panel.repaint();
                    Thread.sleep(300);
                }
            }
        }
        // 排序完成全部变绿色
        compareI = -1;
        compareJ = -1;
        panel.repaint();
    }

    public static void main(String[] args) {
        BubbleSortVisualizer frame = new BubbleSortVisualizer();
        frame.setVisible(true);

        // 启动排序线程
        new Thread(() -> {
            try {
                frame.bubbleSort();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println(Arrays.toString(arr));
    }
}
