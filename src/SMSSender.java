import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SMSSender {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        String message = "Junk characters? method sendMultipartTextMessage only send text message. If you want to send non text message, you should look to method sendDataMessage. Below is the code excerpt from android cts. It has example on how to send long messages.";
        String phone = "9731814995";
        String username = "abcd";
        String password = "1234";
        String address = "http://192.168.1.101";
        String port = "8090";

        URL url = new URL(
                address+":"+port+"/SendSMS?username="+username+"&password="+password+
                        "&phone="+phone+"&message="+URLEncoder.encode(message,"UTF-8"));

        URLConnection connection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while((inputLine = bufferedReader.readLine()) !=null){
            System.out.println(inputLine);
        }
        bufferedReader.close();


    }

}
