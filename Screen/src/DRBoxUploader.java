import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DRBoxUploader extends Thread{
    private InputStream inStream = null;
    private DbxClientV2 client = null;

    public DRBoxUploader(InputStream inStream, DbxClientV2 client){
        this.inStream = inStream;
        this.client = client;
    }

    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        try {
            FileMetadata metadata = client.files().uploadBuilder("/" + dateFormat.format(now) + ".png").uploadAndFinish(inStream);
        } catch (DbxException | IOException e) {
            e.printStackTrace();
        }
    }
}
