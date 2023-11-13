package tcp.connection;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    static ServerSocket serverSocket = null;
    static ArrayList<Socket> socketList = new ArrayList<>();
    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(50001);
            while (true) {

                System.out.println("대기중...");
                Socket socket = serverSocket.accept();// 연결이 수립되면 socket 객체가 반환

                socketList.add(socket);

                new Thread(() -> {
                    communicateWithClient(socket);
                }).start();
            }

            // socket에 연결이 수립된 클라이언트 정보가 있다.
            // 해당 클라이언트와 데이터를 주고 받을 수 있다.
            // 데이터를 주고 받는 것은 stream으로 한다.

            //데이터 보내기
//            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//            dos.writeUTF(message);
//            dos.flush();
//            System.out.println( "[서버] 받은 데이터를 다시 보냄: " + message);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void communicateWithClient(Socket socket){
        DataInputStream dis = null;
        DataOutputStream dos = null;
        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
        String id = "";
        String message = "";

        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");
        try {
            dis = new DataInputStream(socket.getInputStream());
            id = dis.readUTF();
            message = "";

            //데이터 받기
            while (true) {
                message = dis.readUTF();
                System.out.println(id + " : "+ message);

                for (Socket clientSocket : socketList) {
                    if (clientSocket.equals(socket)) continue;
                    dos = new DataOutputStream(clientSocket.getOutputStream());
                    dos.writeUTF(id + " : "+ message);
                    dos.flush();
                }
            }
        } catch (Exception e) {
            try {
                System.out.println(id + " 님이 나가셨습니다.");
                socketList.remove(socket);
                socket.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

//package tcp.connection;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.Socket;
//import java.net.ServerSocket;
//import java.net.InetSocketAddress;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//
//public class Server {
//    public static void main(String[] args){
//        try{
//            ServerSocket serverSocket = new ServerSocket(50001);
//
//            while (true){
//                System.out.println("대기중");
//                Socket socket = serverSocket.accept(); // 연결이 수립되면 socket 객체가 반환
//
//                new Thread(()->{
//                        communicateWithClient(socket);
//                }).start();
//            }
//
//            // socket 에 연결이 수립된 클라이언트 정보가 있다.
//            // 해당 클라이언트와 데이터를 주고 받을 수 있다.
//            // 데이터를 주고 받는 것은 stream으로 한다.
//
//            //데이터 보내기
////            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
////            dos.writeUTF(message);
////            dos.flush();
////            System.out.println( "[서버] 받은 데이터를 다시 보냄: " + message);
//
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    private static void communicateWithClient(Socket socket) throws IOException{
//        //연결된 클라이언트 정보 얻기
//        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
//        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");
//
//        //데이터 받기
//        DataInputStream dis = new DataInputStream(socket.getInputStream());
//        String message = dis.readUTF();
//
//        System.out.println(isa.getHostName() + ":" + message);
//
//        dis.close();
//        socket.close();
//    }
//
//}
