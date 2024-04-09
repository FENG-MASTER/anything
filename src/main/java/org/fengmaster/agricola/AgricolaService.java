package org.fengmaster.agricola;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import lombok.extern.java.Log;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AgricolaService   {




    public static void main(String[] args) {
        // 创建一个终端和屏幕
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
        try {
            Terminal terminal = terminalFactory.createTerminal();
            Screen screen = terminalFactory.createScreen();
            screen.startScreen();

            // 创建一个窗口并设置标题
            BasicWindow window = new BasicWindow("Lanterna Simple GUI");

            // 创建面板来承载组件
            Panel panel = new Panel(new GridLayout(2));

            // 在左上角添加一些文本
            panel.addComponent(new Label("欢迎使用Lanterna!").setLayoutData(GridLayout.createLayoutData(
                    GridLayout.Alignment.BEGINNING, GridLayout.Alignment.BEGINNING)));

            // 创建并添加一个按钮，当点击时输出信息
            Button button = new Button("点击我", new Runnable() {
                @Override
                public void run() {
                    System.out.println("按钮被点击了!");
                }
            }).setLayoutData(GridLayout.createLayoutData(
                    GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER));

            panel.addComponent(button);

            // 将面板添加到窗口中
            window.setComponent(panel);

            // 创建一个GUI并启动
            MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
            gui.addWindowAndWait(window);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
