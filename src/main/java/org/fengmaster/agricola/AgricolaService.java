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
import org.fengmaster.agricola.game.Game;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AgricolaService   {


    private static String numberPattern = "\\d+";
    // 编译正则表达式
    private static Pattern pattern = Pattern.compile(numberPattern);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game  game=new Game();
        game.start();
        while (true) {
            System.out.println(game.info());
            String input = scanner.nextLine();


            if (input.contains("next")){
                //下一回合
                game.nextRound();
            }else if(input.contains("ai")){
                //ai执行
                game.aiNext();

            }else {


                //输入类似  1 参数
                //先找出第一个数字
                Matcher matcher = pattern.matcher(input);

                // 查找字符串中第一个匹配正则表达式的子串
                if (matcher.find()) {
                    String actionIndexStr = matcher.group();

                    // 提取数字之后的字符串
                    String inputParms = input.substring(input.indexOf(actionIndexStr) + actionIndexStr.length());
                    int actionIndex= Integer.parseInt(actionIndexStr);
                    game.playerAction(game.player,actionIndex,inputParms);

                } else {
                    System.out.println("字符串中没有出现数字。");
                }


            }




        }


    }
}
