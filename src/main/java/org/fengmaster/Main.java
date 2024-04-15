package org.fengmaster;


import lombok.SneakyThrows;
import org.fengmaster.agricola.game.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {



    private static String numberPattern = "\\d+";
    // 编译正则表达式
    private static Pattern pattern = Pattern.compile(numberPattern);



    private final int port;
    private ExecutorService executor;

    public Main(int port) {
        this.port = port;
        this.executor = Executors.newCachedThreadPool();
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server is listening on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            executor.submit(() -> handleClient(clientSocket));
        }
    }

    private void handleClient(Socket socket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            String inputLine;

            Game game=new Game();
            game.start();


            out.println(game.info());



            while ((inputLine = in.readLine()) != null) {


                if (inputLine.contains("next")){
                    //下一回合
                    game.nextRound();
                }else if(inputLine.contains("ai")){
                    //ai执行
                    game.aiNext();

                }else if(inputLine.contains("quit")) {
                    socket.close();

                }else {


                    //输入类似  1 参数
                    //先找出第一个数字
                    Matcher matcher = pattern.matcher(inputLine);

                    // 查找字符串中第一个匹配正则表达式的子串
                    if (matcher.find()) {
                        String actionIndexStr = matcher.group();

                        // 提取数字之后的字符串
                        String inputParms = inputLine.substring(inputLine.indexOf(actionIndexStr) + actionIndexStr.length());
                        int actionIndex= Integer.parseInt(actionIndexStr);
                        game.playerAction(game.player,actionIndex,inputParms);


                    } else {
                        System.out.println("字符串中没有出现数字。");
                    }


                }

                out.println(game.info());



            }
        } catch (IOException e) {
            System.err.println("Exception caught when trying to communicate with the client.");
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.err.println("Exception caught when trying to close the client socket.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int port = 22223; // 默认端口号

        Main server = new Main(port);
        try {
            server.start();
        } catch (IOException e) {
            System.err.println("Could not start the server on port " + port + ".");
            e.printStackTrace();
        }
    }

}
