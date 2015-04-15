package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException, HttpException {
        String studentNr = "013653428";
        if (args.length > 0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats-2015.herokuapp.com/students/" + studentNr + "/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream = method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        System.out.println("json-muotoinen data:");
        System.out.println(bodyText + "\n");

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        System.out.println("Opiskelija: " + studentNr);

        int hours = 0;
        int exrs = 0;

        for (Submission submission : subs) {
            System.out.println(submission);
            hours += submission.getHours();
            System.out.print("\t" + "tehtäviä tehty: ");
            for (int i = 1; i <= 21; i++) {
                if (submission.isA(i)) {
                    System.out.print(i + " ");
                    exrs++;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Yhteensä tehtäviä tehty " + exrs + ", aikaa käytetty " + hours + " tuntia");
    }
}
